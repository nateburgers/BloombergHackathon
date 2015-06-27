package spaceship.data;

import spaceship.entity.Bomb;
import spaceship.entity.Mine;
import spaceship.entity.PlayerShip;
import spaceship.entity.Ship;

import java.util.ArrayList;


/**
 * Created by Ashish109 on 6/27/2015.
 */
public class Status
{

    public final PlayerShip swagLord;
    public final ArrayList<Mine> mines;
    public final ArrayList<Bomb> bombs;
    public final ArrayList<Ship> enemies;

    public Status(String status_out)
    {
        mines = new ArrayList<Mine>();
        bombs = new ArrayList<Bomb>();
        enemies = new ArrayList<Ship>();

        String[] tokens = status_out.split("[ \n\t]+");
        int index = 1;

        double xCoordinate = Double.parseDouble(tokens[index++]);
        double yCoordinate = Double.parseDouble(tokens[index++]);
        Vector myCoordinates = new Vector(xCoordinate,yCoordinate);

        double xVelocity = Double.parseDouble(tokens[index++]);
        double yVelocity = Double.parseDouble(tokens[index++]);
        Vector myVelocity = new Vector(xVelocity,yVelocity);

        swagLord = new PlayerShip(myCoordinates, myVelocity);
        System.out.println(tokens[index]);
        index++;
        System.out.println(tokens[index]);
        int numOfMines = Integer.parseInt(tokens[index++]);

        for (int i = 0; i < numOfMines; i++)
        {
            switch (tokens[index])
            {
                case "--" : index++;
                            double xPosition = Double.parseDouble(tokens[index++]);
                            double yPosition = Double.parseDouble(tokens[index++]);
                            mines.add(new Mine(new Vector(xPosition, yPosition),null));
                            break;
                default :   String username = tokens[index++];
                            double xPos = Double.parseDouble(tokens[index++]);
                            double yPos = Double.parseDouble(tokens[index++]);
                            mines.add(new Mine(new Vector(xPos, yPos), new Ship(username,null,null,0)));
            }
        }

        index++;
        int numOfPlayers = Integer.parseInt(tokens[index++]);

        for (int i = 0; i < numOfPlayers; i ++)
        {
            double xCoord = Double.parseDouble(tokens[index++]);
            double yCoord = Double.parseDouble(tokens[index++]);
            Vector enemyCoord = new Vector(xCoord,yCoord);

            double xVel = Double.parseDouble(tokens[index++]);
            double yVel = Double.parseDouble(tokens[index++]);
            Vector enemyVel = new Vector(xVel,yVel);

            enemies.add(new Ship(enemyCoord, enemyVel));
        }

        index++;
        int numOfBombs = Integer.parseInt(tokens[index++]);

        for (int i = 0; i < numOfBombs; i++)
        {
            double xCoord = Double.parseDouble(tokens[index++]);
            double yCoord = Double.parseDouble(tokens[index++]);
            Vector bombCoord = new Vector(xCoord,yCoord);
            bombs.add(new Bomb(bombCoord));
        }
    }

}
