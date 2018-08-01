package 내_숙제다;

import java.util.Scanner;

class mazeQ2 {
   public int[][] map = new int[10][10];
   public int n = 0;
   public int way = 0;
   public int Visited = 2;

   public mazeQ2() {
      makingmap();
   }

   public void makingmap() {
      Scanner sc = new Scanner(System.in);
      System.out.println("맵의 크기를 입력하세요 : ");
      n = sc.nextInt();
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            map[i][j] = sc.nextInt();
         }
      }
      movefoward(0, 0, 0);

   }

   public boolean movefoward(int x, int y, int c) {
      if (x < 0 || y < 0 || x > n - 1 || y > n - 1 || map[x][y] != 0) {
         return false;
      } else if (x == n - 1 && y == n - 1) {
         System.out.println("Yes");
         return true;
      } else {
         if (c != 0) {
            map[x][y] = 2;
         }
         if (movefoward(x, findEast(x, y), c + 1) || movefoward(findSouth(x, y), y, c + 1)
               || movefoward(x, findWest(x, y), c + 1) || movefoward(findNorth(x, y), y, c + 1)) {
            return true;
         }
      }
      return false;
   }

   public int findEast(int x, int y) {
      for (int i = 0; i < n; i++) {
         y++;
         if (y > n - 1||map[x][y] == 1 ) {
            break;
         }
      }
      y = y - 1;
      return y;
   }

   public int findSouth(int x, int y) {
      for (int i = 0; i < n; i++) {
         x++;
         if ( x > n - 1||map[x][y] == 1 ) {
            break;
         }
      }
      x = x - 1;

      return x;
   }

   public int findWest(int x, int y) {
      for (int i = 0; i < n; i++) {
         y--;
         if (y < 0||map[x][y] == 1 ) {
            break;
         }
      }
      y = y + 1;
      return y;
   }

   public int findNorth(int x, int y) {
      for (int i = 0; i < n; i++) {
         x--;
         if ( x < 0||map[x][y] == 1 ) {
            break;
         }
      }
      x = x + 1;
      return x;
   }
}

public class practice {
   public static void main(String args[]) {
      mazeQ2 m2 = new mazeQ2();

   }
}