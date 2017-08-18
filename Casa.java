class Casa
{
    // variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    // constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
    void acomodate()
    {
        // colocar los objetos en la posicion que les corresponde       
        pared.moveVertical(80);
        pared.changeSize(100);
        pared.makeVisible();

        // prueba
        puerta.changeColor("black");
        puerta.moveHorizontal(20);
        puerta.moveVertical(100);
        puerta.makeVisible();

        techo.changeSize(50, 140);
        techo.moveHorizontal(60);
        techo.moveVertical(70);
        techo.makeVisible();

        ventana.changeColor("yellow");
        ventana.moveHorizontal(180);
        ventana.moveVertical(-10);
        ventana.changeSize(60);
        ventana.makeVisible();        
    }
}
