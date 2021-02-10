package exception;

public class Throw {



        //cum putem sa mai aruncam o exceptie cu aceasta clauza

        //Aceasta clauza se face pe Metode!!!!!!!


        public int division( int a, int b){

            if(b==0){
                throw new ArithmeticException();
            }

            int rez = a / b;
            return rez;

        }


    public static void main(String[] args) {
        Throw obj = new Throw();
        try{
            System.out.println(obj.division(5,0));
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }


    public void checkVotingAge(int age){

            if(age<18){
                throw new ArithmeticException("Not eligible");
            }

    }

    }
