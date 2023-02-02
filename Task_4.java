/**
 Напишите метод, который составит строку, состоящую из 100 повторений слова TEST.
 Производится замер времени на выполнение операции.
 */

 public class Task_4 {
 
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            //str += "+";
            sb.append("TEST");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);
    }
 }

