package wc;

import w7.o9;
public final class a {
    public static final String[] f47514o = {"34", "37"};
    public static final String[] f47515p = {"60", "62", "64", "65"};
    public static final String[] f47516q = {"35"};
    public static final String[] f47517r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47518s = {"4"};
    public static final String[] f47519t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47520a;
    public final String f47521b;
    public final Integer f47522c;
    public final Integer d;
    public final String e;
    public final String f47523f;
    public final String f47524g;
    public final String h;
    public final String f47525i;
    public final String f47526j;
    public final String f47527k;
    public String f47528l;
    public String f47529m;
    public final String f47530n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.f47520a = o9.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.f47522c = num;
        this.d = num2;
        this.f47521b = o9.e(str2);
        this.e = o9.e(str3);
        this.f47523f = o9.e(str4);
        this.f47524g = o9.e(str5);
        this.h = o9.e(str6);
        this.f47525i = o9.e(str7);
        this.f47526j = o9.e(str8);
        this.f47527k = o9.e(str9);
        this.f47529m = o9.a(str10) == null ? a() : str10;
        this.f47528l = o9.e(str11) == null ? b() : str11;
        o9.e(str12);
        o9.b(str13);
        o9.e(str14);
        this.f47530n = o9.e(str15);
    }

    public final String a() {
        String str;
        if (o9.d(this.f47529m)) {
            String str2 = this.f47520a;
            if (!o9.d(str2)) {
                if (o9.c(str2, f47514o)) {
                    str = "American Express";
                } else if (o9.c(str2, f47515p)) {
                    str = "Discover";
                } else if (o9.c(str2, f47516q)) {
                    str = "JCB";
                } else if (o9.c(str2, f47517r)) {
                    str = "Diners Club";
                } else if (o9.c(str2, f47518s)) {
                    str = "Visa";
                } else if (o9.c(str2, f47519t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47529m = str;
            }
        }
        return this.f47529m;
    }

    public final String b() {
        if (!o9.d(this.f47528l)) {
            return this.f47528l;
        }
        String str = this.f47520a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47528l = substring;
            return substring;
        }
        return null;
    }
}
