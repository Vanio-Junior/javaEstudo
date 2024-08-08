/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.data.hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vanio.oliveira
 */
public class DataHora {

    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        
        LocalDate d08 = LocalDate.parse("21/07/2022", fmt1);        
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        
        LocalDate d10 = LocalDate.parse("22/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        LocalDate d11 = LocalDate.of(2022, 7, 20);
        LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);
        
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d12);
    }
}
