public class Calculator {
    public void calculate(String str) {
        int x = 0, y = 1;
        String oper;
        String[] parts;
        parts = str.split(" ");
        try {
            x = Integer.parseInt(parts[0]);
        } catch(NumberFormatException e){
            System.out.println("Не удалось получить число из " + parts[0]);
            return;
        }
        try {
            y = Integer.parseInt(parts[2]);
        } catch(NumberFormatException e){
            System.out.println("Не удалось получить число из " + parts[2]);
            return;
        }
    
        oper = parts[1];
        switch(oper){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                if(y != 0)
                    System.out.println((double) x / y);
                else
                    System.out.println("Нельзя делить на ноль");
                break;
            default:
                System.out.println("Неверный оператор");
         }
        
    }
}