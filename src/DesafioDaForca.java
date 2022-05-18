import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * O jogo da forca é um jogo popular que pode ser jogado simplesmente com um pedaço de papel e lápis.
 * As origens deste jogo não são conhecidas com rigor, mas alguns autores defendem que o jogo surgiu na época Vitoriana,
 * no Reino Unido, sendo possível encontrar referências a este jogo em diversas obras, embora com nomes diferentes.
 *
 * No jogo da forca um jogador tem que descobrir uma palavra escondida, tendo como única informação prévia o número de
 * letras que constituem a palavra. O jogador procede então, por tentativa e erro, sugerindo letras que podem pertencer
 * à palavra.
 *
 * Quando uma letra pertence à palavra, é indicada ao jogador as posições em que a letra aparece na palavra. Quando a
 * letra não pertence à palavra, é incrementado um contador de tentativas (normalmente representado através do desenho
 * de um indivíduo sendo enforcado).
 *
 * O jogo termina quando o jogador descobre todas as letras da palavra escondida (vencendo o jogo) ou quando esgota o
 * número de tentativas falhas (7 tentativas, sendo enforcado ou perdendo o jogo).
 *
 * Crie um programa em Java que implemente a lógica necessária para permitir ao usuário jogar o jogo da forca no
 * computador. O programa selecionará aleatoriamente uma palavra de seu dicionário para que o usuário a descubra.
 * Observe os requisitos a seguir:
 * - O dicionário deve conter no mímimo 10 palavras e cada uma deve conter o mínimo de 5 letras;
 * - O jogo deve iniciar mostrando um menu para o usuário escolher iniciar uma nova partida ou fechar o jogo;
 * - Ao iniciar uma nova partida o jogo deve selecionar uma das palavras no dicionário e exibir ao usuário o número de
 * letras totais na palavra;
 * - Quando a partida terminar o jogo deve mostrar uma mensagem informando se o usuário venceu ou perdeu e aguardar o
 * usuário prescionar uma tecla para exibir novamente o menu inicial.
 *
 */
public class DesafioDaForca {
    static final String[] PALAVRAS = new String[] {
            "DESAFIO",
            "SEGREDO",
            "LÓGICA",
            "PROGRAMAÇÃO",
            "PERSISTÊNCIA",
            "ANÁLISE",
            "ORGANIZAÇÃO",
            "CONVENÇÃO",
            "CONFIANÇA",
            "TRABALHO"
    };
    static String palavraSecreta;
    static int vidas;
    static String palavraFormada;
    static int acertos;

    public static void main(String[] args) {
        do {
            exibeMenu();
            System.out.println("Aperte <ENTER> para continuar");
            new Scanner(System.in).nextLine();
        } while (true);
    }

    public static void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void exibeMenu() {
        limpaConsole();
        System.out.println("#".repeat(80));
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.println("#" + " ".repeat(31) + " JOGO DA FORCA " + " ".repeat(31) + " #");
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.println("#" + " ".repeat(24) + " 1 - Iniciar uma nova partida " + " ".repeat(24) + "#");
        System.out.println("#" + " ".repeat(24) + " 2 - Sair " + " ".repeat(44) + "#");
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.println("#".repeat(80));
        String opcao = "";
        do {
            opcao = new Scanner(System.in).nextLine();
            switch (opcao) {
                case "1":
                    iniciarPartida();
                    break;
                case "2":
                    System.exit(0);
                    break;
                default:
                    opcao = "";
                    System.out.println("Opção inválida! Tente novamente");
            }
        } while (opcao.isBlank());
    }

    private static void iniciarPartida() {
        palavraSecreta = PALAVRAS[new Random().nextInt(PALAVRAS.length)];
        palavraFormada = " ".repeat(palavraSecreta.length());
        vidas = 7;
        acertos = 0;
        do {
            exibeForca();
            pedeLetra();
        } while (vidas > 0 && acertos < palavraSecreta.length());
        exibeForca();
        if (vidas <= 0) {
            System.out.println("Você perdeu! Mais sorte na próxima vez!");
        } else {
            System.out.println("Parabéns! Você ganhou!");
        }
    }

    private static void exibeMascaraPalavra() {
        System.out.println("#".repeat(80));
        System.out.print("# ");
        for (char letra : palavraSecreta.toCharArray()) {
            System.out.print("  ___  ");
        }
        System.out.println(" #");
        System.out.print("# ");
        for (int i = 0; i < palavraSecreta.toCharArray().length; i++) {
            System.out.printf(" | %s | ", palavraFormada.charAt(i));
        }
        for (char letra : palavraSecreta.toCharArray()) {

        }
        System.out.println(" #");
        System.out.print("# ");
        for (char letra : palavraSecreta.toCharArray()) {
            System.out.print(" |___| ");
        }
        System.out.println(" #");
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.println("#".repeat(80));
    }

    private static void exibeForca() {
        limpaConsole();
        exibeMascaraPalavra();
        System.out.println("#".repeat(80));
        System.out.println("# ########      #" + " ".repeat(62) + "#");
        System.out.println("# #   .__|__.   #" + " ".repeat(62) + "#");
        if (vidas < 1) {
            System.out.println("# #   | ^.^ |   #" + " ".repeat(62) + "#");
            System.out.println("# #   |  x  |   #" + " ".repeat(62) + "#");
            System.out.println("# #    \\___/    #" + " ".repeat(62) + "#");
        } else {
            System.out.println("# #   |     |   #" + " ".repeat(62) + "#");
            System.out.println("# #   |     |   #" + " ".repeat(62) + "#");
            System.out.println("# #   |_____|   #" + " ".repeat(62) + "#");
        }
        if (vidas < 2) {
            System.out.println("# #      ||     #" + " ".repeat(62) + "#");
        } else {
            System.out.println("# #             #" + " ".repeat(62) + "#");
        }
        if (vidas < 3) {
            System.out.println("# #    ./||\\.   #" + " ".repeat(62) + "#");
            System.out.println("# #      ||     #" + " ".repeat(62) + "#");
        }else if (vidas < 4) {
            System.out.println("# #    ./||     #" + " ".repeat(62) + "#");
            System.out.println("# #      ||     #" + " ".repeat(62) + "#");
        } else if (vidas < 5) {
            System.out.println("# #             #" + " ".repeat(62) + "#");
            System.out.println("# #      ||     #" + " ".repeat(62) + "#");
        } else {
            System.out.println("# #             #" + " ".repeat(62) + "#");
            System.out.println("# #             #" + " ".repeat(62) + "#");
        }
        if (vidas < 6) {
            System.out.println("# #     /  \\    #" + " ".repeat(62) + "#");
            System.out.println("# #   _/    \\_  #" + " ".repeat(62) + "#");
        } else if (vidas < 7) {
            System.out.println("# #     /       #" + " ".repeat(62) + "#");
            System.out.println("# #   _/        #" + " ".repeat(62) + "#");
        } else {
            System.out.println("# #             #" + " ".repeat(62) + "#");
            System.out.println("# #             #" + " ".repeat(62) + "#");
        }
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.printf("##### Vidas: %d     %n", vidas);
        System.out.printf("##### Acertos: %d   %n", acertos);
        System.out.println("#" + " ".repeat(78) + "#");
        System.out.println("#".repeat(80));
    }

    private static char limpaLetra(char letra) {
        switch (letra) {
            case 'Ç':
                return 'C';
            case 'Á':
            case 'À':
            case 'Ã':
            case 'Â':
            case 'Ä':
                return 'A';
            case 'É':
            case 'È':
            case 'Ẽ':
            case 'Ê':
            case 'Ë':
                return 'E';
            case 'Í':
            case 'Ì':
            case 'Ĩ':
            case 'Î':
            case 'Ï':
                return 'I';
            case 'Ó':
            case 'Ò':
            case 'Õ':
            case 'Ô':
            case 'Ö':
                return 'O';
            case 'Ú':
            case 'Ù':
            case 'Ũ':
            case 'Û':
            case 'Ü':
                return 'U';
            default:
                return letra;
        }
    }

    private static boolean validaLetra(String letra) {
        if (letra.isBlank() || letra.length() > 1) {
            return false;
        } else {
            return Character.isLetter(letra.charAt(0));
        }
    }
    private static void pedeLetra() {
        System.out.println("Informe uma letra");
        do {
            String letraInformada = new Scanner(System.in).nextLine();
            if (!validaLetra(letraInformada)) {
                System.out.println("Letra inválida! Tente novamente");
            } else {
                char letra = limpaLetra(letraInformada.toUpperCase(Locale.ROOT).charAt(0));
                boolean acertou = false;
                for (int i = 0; i < palavraSecreta.toCharArray().length; i++) {
                    if (letra == limpaLetra(palavraSecreta.charAt(i))) {
                        acertou = true;
                        char[] letras = palavraFormada.toCharArray();
                        letras[i] = palavraSecreta.charAt(i);
                        palavraFormada = new String(letras);
                        acertos++;
                    }
                }
                if (!acertou) {
                    vidas--;
                }
                break;
            }
        } while (true);
    }
}
