package ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ticket {
   //private static String tenChuyen;
   private int giaVe;
   //private static LocalDateTime ngayBay;

   public int ticketPrice (int tuoi){
      if(tuoi <= 2 && tuoi > 0){
         this.giaVe = 500;
      } else if (3 < tuoi && tuoi <= 16){
         this.giaVe = 700;
      } else {
         this.giaVe = 1000;
      }
      return giaVe;
   }
}
