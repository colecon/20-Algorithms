//Cole Constantino | Given a 2d grid map count the number of islands. 
//You may assume all four edges of the grid are all surrounded by water.
public class NumOfIslands{
  public static int numIslands(char[][] grid) {
    //loop through, at every 1 run new function to see 
    //if its an island by checking all 4 sides
    /*
     ------------------
     | //(0,0)    (0,4) |
     |                  |
     | //(4,0)    (4,4) |
     -------------------    
     */   
    int count = 0;    
    for(int i = 0; i < grid.length; i++){
      for(int j = 0 ; j < grid[i].length; j++){
        if(grid[i][j] == '1'){
          count++;
          clearIsland(i,j,grid);
        }
      }
    }    
    return count;
  }
  
  public static void clearIsland(int i, int j, char[][] grid){
    //if its an edge i == 0 or j == 0 return false
    //if i == grid.length or j == grid[i].length return false
    if(i<0 || j<0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
      return;
    grid[i][j] = '0'; //curr
    clearIsland(i-1,j,grid); //up
    clearIsland(i,j+1,grid); //right
    clearIsland(i+1,j,grid); //down
    clearIsland(i,j-1,grid); //left
    return;
  }
  
  
  public static void main(String[] args){
    char[][] map = {{'1','1','1','1','0'},
                    {'1','1','0','1','0'},
                    {'1','1','0','0','0'},
                    {'0','0','0','0','0'}};
    System.out.println(numIslands(map));
  }
}

/*
 * input:
 *   11110
 *   11010
 *   11000
 *   00000
 * 
 * output: 1
 */