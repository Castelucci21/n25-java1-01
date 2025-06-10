import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a classe Mosca.
 * 
 * @author Lara
 * @version 2025-06-06
 */
public class Mosca extends Inseto
{
    //Fields
    private int velocidade;
    private int rotacao;
    //constructor padrão
    public Mosca (){
        velocidade = 1;
        rotacao = 0;
    }
    //constructor com parametros
    public Mosca(int vel,int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    /**
     * Act - Método responsável pelas ações da mosca quando 
     * os botões Act ou Run são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        if (Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
        }
        verificarCanto();
    }
}
