package uc;

import w7.u8;
public final class a {
    public static final String[] f47593o = {"34", "37"};
    public static final String[] f47594p = {"60", "62", "64", "65"};
    public static final String[] f47595q = {"35"};
    public static final String[] f47596r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47597s = {"4"};
    public static final String[] f47598t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47599a;
    public final String f47600b;
    public final Integer f47601c;
    public final Integer d;
    public final String f47602e;
    public final String f47603f;
    public final String f47604g;
    public final String h;
    public final String f47605i;
    public final String f47606j;
    public final String f47607k;
    public String f47608l;
    public String f47609m;
    public final String f47610n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47599a = u8.e(replaceAll);
        this.f47601c = num;
        this.d = num2;
        this.f47600b = u8.e(str2);
        this.f47602e = u8.e(str3);
        this.f47603f = u8.e(str4);
        this.f47604g = u8.e(str5);
        this.h = u8.e(str6);
        this.f47605i = u8.e(str7);
        this.f47606j = u8.e(str8);
        this.f47607k = u8.e(str9);
        this.f47609m = u8.a(str10) == null ? a() : str10;
        if (u8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47608l = str16;
        u8.e(str12);
        u8.b(str13);
        u8.e(str14);
        this.f47610n = u8.e(str15);
    }

    public final String a() {
        String str;
        if (u8.d(this.f47609m)) {
            String str2 = this.f47599a;
            if (!u8.d(str2)) {
                if (u8.c(str2, f47593o)) {
                    str = "American Express";
                } else if (u8.c(str2, f47594p)) {
                    str = "Discover";
                } else if (u8.c(str2, f47595q)) {
                    str = "JCB";
                } else if (u8.c(str2, f47596r)) {
                    str = "Diners Club";
                } else if (u8.c(str2, f47597s)) {
                    str = "Visa";
                } else if (u8.c(str2, f47598t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47609m = str;
            }
        }
        return this.f47609m;
    }

    public final String b() {
        if (!u8.d(this.f47608l)) {
            return this.f47608l;
        }
        String str = this.f47599a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47608l = substring;
            return substring;
        }
        return null;
    }
}
