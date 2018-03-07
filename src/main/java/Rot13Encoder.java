public class Rot13Encoder {

    private static final int OFFSET = 13;
    private static final int UPPERCASE_Z_IN_ASCII_TABLE = 90;


    public static void main(String[] args){
        encode("Hello, World", OFFSET);
        encode("Lorem ipsum!0987!", OFFSET);
    }
    private static void encode(String input, int offset){
        input = input.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i< input.length();i++){
            int position = input.charAt(i);
            if(inAsciiAlphabet(position)){
                sb.append(input.charAt(i));
                continue;
            }
            int newPosition = (int) input.charAt(i) + offset;
            if(newASCIIGreaterThan90(newPosition)){
                newPosition -=26;
            }
            sb.append(Character.toString((char) newPosition));
        }
        System.out.println(sb.toString().toUpperCase());
    }

    private static boolean inAsciiAlphabet(int position) {
        return position <65 | position > 90;
    }

    private static boolean newASCIIGreaterThan90(int newPosition) {
        return newPosition > UPPERCASE_Z_IN_ASCII_TABLE;
    }
}
