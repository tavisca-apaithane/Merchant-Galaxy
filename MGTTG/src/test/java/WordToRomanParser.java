public class WordToRomanParser {

    public Object[] parse(String glob_is_i) {
        String [] rtext=glob_is_i.split(" ");
        return new String[]{rtext[0],rtext[1]};
    }
}
