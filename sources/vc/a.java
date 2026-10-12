package vc;

import w7.z8;
public final class a {
    public static final String[] f49755o = {"34", "37"};
    public static final String[] f49756p = {"60", "62", "64", "65"};
    public static final String[] f49757q = {"35"};
    public static final String[] f49758r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f49759s = {"4"};
    public static final String[] f49760t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f49761a;
    public final String f49762b;
    public final Integer f49763c;
    public final Integer d;
    public final String f49764e;
    public final String f49765f;
    public final String f49766g;
    public final String h;
    public final String f49767i;
    public final String f49768j;
    public final String f49769k;
    public String f49770l;
    public String f49771m;
    public final String f49772n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f49761a = z8.e(replaceAll);
        this.f49763c = num;
        this.d = num2;
        this.f49762b = z8.e(str2);
        this.f49764e = z8.e(str3);
        this.f49765f = z8.e(str4);
        this.f49766g = z8.e(str5);
        this.h = z8.e(str6);
        this.f49767i = z8.e(str7);
        this.f49768j = z8.e(str8);
        this.f49769k = z8.e(str9);
        this.f49771m = z8.a(str10) == null ? a() : str10;
        if (z8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f49770l = str16;
        z8.e(str12);
        z8.b(str13);
        z8.e(str14);
        this.f49772n = z8.e(str15);
    }

    public final String a() {
        String str;
        if (z8.d(this.f49771m)) {
            String str2 = this.f49761a;
            if (!z8.d(str2)) {
                if (z8.c(str2, f49755o)) {
                    str = "American Express";
                } else if (z8.c(str2, f49756p)) {
                    str = "Discover";
                } else if (z8.c(str2, f49757q)) {
                    str = "JCB";
                } else if (z8.c(str2, f49758r)) {
                    str = "Diners Club";
                } else if (z8.c(str2, f49759s)) {
                    str = "Visa";
                } else if (z8.c(str2, f49760t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f49771m = str;
            }
        }
        return this.f49771m;
    }

    public final String b() {
        if (!z8.d(this.f49770l)) {
            return this.f49770l;
        }
        String str = this.f49761a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f49770l = substring;
            return substring;
        }
        return null;
    }
}
