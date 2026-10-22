package wc;

import w7.o9;
public final class a {
    public static final String[] f48909o = {"34", "37"};
    public static final String[] f48910p = {"60", "62", "64", "65"};
    public static final String[] f48911q = {"35"};
    public static final String[] f48912r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f48913s = {"4"};
    public static final String[] f48914t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f48915a;
    public final String f48916b;
    public final Integer f48917c;
    public final Integer d;
    public final String e;
    public final String f48918f;
    public final String f48919g;
    public final String h;
    public final String f48920i;
    public final String f48921j;
    public final String f48922k;
    public String f48923l;
    public String f48924m;
    public final String f48925n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f48915a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f48917c = num;
        this.d = num2;
        this.f48916b = o9.e(str2);
        this.e = o9.e(str3);
        this.f48918f = o9.e(str4);
        this.f48919g = o9.e(str5);
        this.h = o9.e(str6);
        this.f48920i = o9.e(str7);
        this.f48921j = o9.e(str8);
        this.f48922k = o9.e(str9);
        this.f48924m = o9.a(str10) == null ? a() : str10;
        this.f48923l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f48925n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f48924m)) {
            String str2 = this.f48915a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f48909o)) {
                    str = "American Express";
                } else if (o9.c(str2, f48910p)) {
                    str = "Discover";
                } else if (o9.c(str2, f48911q)) {
                    str = "JCB";
                } else if (o9.c(str2, f48912r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f48913s)) {
                    str = "Visa";
                } else if (o9.c(str2, f48914t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f48924m = str;
            }
        }
        return this.f48924m;
    }

    public final String b() {
        if (!o9.d(this.f48923l)) {
            return this.f48923l;
        }
        String str = this.f48915a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f48923l = substring;
            return substring;
        }
        return null;
    }
}
