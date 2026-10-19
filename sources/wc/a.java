package wc;

import w7.o9;
public final class a {
    public static final String[] f48899o = {"34", "37"};
    public static final String[] f48900p = {"60", "62", "64", "65"};
    public static final String[] f48901q = {"35"};
    public static final String[] f48902r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f48903s = {"4"};
    public static final String[] f48904t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f48905a;
    public final String f48906b;
    public final Integer f48907c;
    public final Integer d;
    public final String e;
    public final String f48908f;
    public final String f48909g;
    public final String h;
    public final String f48910i;
    public final String f48911j;
    public final String f48912k;
    public String f48913l;
    public String f48914m;
    public final String f48915n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f48905a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f48907c = num;
        this.d = num2;
        this.f48906b = o9.e(str2);
        this.e = o9.e(str3);
        this.f48908f = o9.e(str4);
        this.f48909g = o9.e(str5);
        this.h = o9.e(str6);
        this.f48910i = o9.e(str7);
        this.f48911j = o9.e(str8);
        this.f48912k = o9.e(str9);
        this.f48914m = o9.a(str10) == null ? a() : str10;
        this.f48913l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f48915n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f48914m)) {
            String str2 = this.f48905a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f48899o)) {
                    str = "American Express";
                } else if (o9.c(str2, f48900p)) {
                    str = "Discover";
                } else if (o9.c(str2, f48901q)) {
                    str = "JCB";
                } else if (o9.c(str2, f48902r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f48903s)) {
                    str = "Visa";
                } else if (o9.c(str2, f48904t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f48914m = str;
            }
        }
        return this.f48914m;
    }

    public final String b() {
        if (!o9.d(this.f48913l)) {
            return this.f48913l;
        }
        String str = this.f48905a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f48913l = substring;
            return substring;
        }
        return null;
    }
}
