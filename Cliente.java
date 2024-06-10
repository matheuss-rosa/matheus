import java.util.Date;

public abstract class Cliente {

    
    public static int totalDeContas;

    private String name;
    private Date date;
    private String addres;
    


    public Cliente (String name, String addres, Date data) {

        this.name = name;
        this.date = date;
        this.addres = addres;

    }

    void imprimir(){

        System.out.println("Cliente inválido :(");

    }


    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }



    public String getAddres(){

        return addres;

    }

    public void setAddres(String addres){

        this.addres = addres;

    }



    public Date getDate(){

        return date;

    }
}