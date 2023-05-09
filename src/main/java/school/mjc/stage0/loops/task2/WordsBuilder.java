package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        if (chars == null || chars.length == 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        System.out.print(sb);
    }
}
