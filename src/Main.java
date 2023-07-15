import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("yamada","takana","yasuda","suzuki","iida");
        //名前を大文字に変換して標準出力する
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        //名前を大文字に変換して標準出力する（メソッド変換で記載、内容は同じ、クラス::メソッドの形で書く）
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        //名前を小文字に変換して標準出力する
        names.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}