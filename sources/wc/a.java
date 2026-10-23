package wc;

import w7.o9;
public final class a {
    public static final String[] f48910o = {"34", "37"};
    public static final String[] f48911p = {"60", "62", "64", "65"};
    public static final String[] f48912q = {"35"};
    public static final String[] f48913r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f48914s = {"4"};
    public static final String[] f48915t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f48916a;
    public final String f48917b;
    public final Integer f48918c;
    public final Integer d;
    public final String e;
    public final String f48919f;
    public final String f48920g;
    public final String h;
    public final String f48921i;
    public final String f48922j;
    public final String f48923k;
    public String f48924l;
    public String f48925m;
    public final String f48926n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f48916a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f48918c = num;
        this.d = num2;
        this.f48917b = o9.e(str2);
        this.e = o9.e(str3);
        this.f48919f = o9.e(str4);
        this.f48920g = o9.e(str5);
        this.h = o9.e(str6);
        this.f48921i = o9.e(str7);
        this.f48922j = o9.e(str8);
        this.f48923k = o9.e(str9);
        this.f48925m = o9.a(str10) == null ? a() : str10;
        this.f48924l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f48926n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f48925m)) {
            String str2 = this.f48916a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f48910o)) {
                    str = "American Express";
                } else if (o9.c(str2, f48911p)) {
                    str = "Discover";
                } else if (o9.c(str2, f48912q)) {
                    str = "JCB";
                } else if (o9.c(str2, f48913r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f48914s)) {
                    str = "Visa";
                } else if (o9.c(str2, f48915t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f48925m = str;
            }
        }
        return this.f48925m;
    }

    public final String b() {
        if (!o9.d(this.f48924l)) {
            return this.f48924l;
        }
        String str = this.f48916a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f48924l = substring;
            return substring;
        }
        return null;
    }
}
