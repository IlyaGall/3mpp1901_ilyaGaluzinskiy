/* Создайте программу, которая находит и выводит все простые числа меньше 100 Простое число — это натуральное число, которое имеет только два делителя: единицу и само себя
 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97*/
 public class Primes
{
    public static void main(String[] args)
    {
        for(int i=2;i<100;i++)
        {
            if(isPrime(i)==true)// отправляем цифру для проверки в класс isPrime
              System.out.print(i+" "); // выводит в консоль данные
        }
    }
    /* класс проверки числа на чётность входной параметр int -это число которое надо проверить на чётность, возращает значение true- число натуральное, false число составное */
    public static boolean isPrime(int n)
    {
        for(int count=n; count>1; count--)
        {// проверка на чётность с помощью цикла пробегаем по всем числам, которые меньше текущего
            if(n % count ==0 & count!=n) // если остаток от деления равен 0, то это значит, что число составное, при этом отсекается условие, что число делется само на себя
            {
                return false;// если число составное останавливаем цикл и отправляем false
            }
        }
         return true;// если число прошло проверку цикла, то возращаем true
    }
}
//Edit - Line - Reindent форматировать код