import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int san= scan.nextInt();
        int[] pig = {1935, 1947, 1959,1971,1983,1995};
        int[] dog= {1934,1946,1958,1970,1982,1994};
        int[] took={1945,1957,1969,1981,1993,2005};
        int[] mon={1944,1956,1968,1980,1992,2004};
        int[] koi={1943,1956,1967,1979,1991,2003};
        int[] at={1942,1954,1966,1978,1990,2002};
        int[] jyl={1941,1953,1965,1977,1989,2001};
        int[] dr={1940,1952,1964,1976,1988,2000};
        int[] ko={1939,1951,1963,1975,1987,1999};
        int[] tig={1938,1950,1962,1974,1986,1998};
        int[] ox={1937,1949,1961,1973,1985,1997};
        int[] rat={1936,1948,1960,1972,1984,1996};
        for (int i = 0; i < pig.length; i++) {
            if (san == pig[i]) {
                System.out.println(pig[i] + " Чочко жылы");
            }
            for (int j = 0; j < 1; j++) {
                if(san == dog[i]){
                    System.out.println(dog[i]+" Ит жылы");
                }
                for (int k = 0; k < 1; k++) {
                    if(san==took[i]){
                        System.out.println(took[i]+" тоок жылы");
                    }
                    for (int l = 0; l < 1; l++) {
                        if(san==mon[i]){
                            System.out.println(mon[i]+" Maймыл жылы");
                        }
                        for (int m = 0; m < 1; m++) {
                            if(san==koi[i]){
                                System.out.println(koi[i]+" Кой жылы");
                            }
                            for (int n = 0; n < 1; n++) {
                                if(san==at[i]){
                                    System.out.println(at[i]+" Ат жылы");
                                }}
                            for (int n = 0; n < 1; n++) {
                                if(san==jyl[i]){
                                    System.out.println(jyl[i]+" Жылан жылы");
                                }
                                for (int o = 0; o < 1; o++) {
                                    if(san==dr[i]){
                                        System.out.println(dr[i]+" Дракон жылы");
                                    }
                                    for (int p = 0; p < 1; p++) {
                                        if(san==ko[i]){
                                            System.out.println(ko[i]+" Коён жылы");
                                        }
                                        for (int q = 0; q < 1; q++) {
                                            if(san==tig[i]){
                                                System.out.println(tig[i]+" Тигр жылы");
                                            }
                                            for (int r = 0; r < 1; r++) {
                                                if(san==ox[i]){
                                                    System.out.println(ox[i]+" Бука жылы");
                                                }
                                                for (int s = 0; s < 1; s++) {
                                                    if(san==rat[i]){
                                                        System.out.println(rat[i]+" Чычкан жылы");
                                                    }}}}}}}}}}}}}}



