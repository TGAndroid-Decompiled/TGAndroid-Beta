package uc;

import w7.s8;
public final class a {
    public static final String[] f47022o = {"34", "37"};
    public static final String[] f47023p = {"60", "62", "64", "65"};
    public static final String[] f47024q = {"35"};
    public static final String[] f47025r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47026s = {"4"};
    public static final String[] f47027t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47028a;
    public final String f47029b;
    public final Integer f47030c;
    public final Integer d;
    public final String f47031e;
    public final String f47032f;
    public final String f47033g;
    public final String h;
    public final String f47034i;
    public final String f47035j;
    public final String f47036k;
    public String f47037l;
    public String f47038m;
    public final String f47039n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47028a = s8.e(replaceAll);
        this.f47030c = num;
        this.d = num2;
        this.f47029b = s8.e(str2);
        this.f47031e = s8.e(str3);
        this.f47032f = s8.e(str4);
        this.f47033g = s8.e(str5);
        this.h = s8.e(str6);
        this.f47034i = s8.e(str7);
        this.f47035j = s8.e(str8);
        this.f47036k = s8.e(str9);
        this.f47038m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47037l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f47039n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f47038m)) {
            String str2 = this.f47028a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f47022o)) {
                    str = "American Express";
                } else if (s8.c(str2, f47023p)) {
                    str = "Discover";
                } else if (s8.c(str2, f47024q)) {
                    str = "JCB";
                } else if (s8.c(str2, f47025r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f47026s)) {
                    str = "Visa";
                } else if (s8.c(str2, f47027t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47038m = str;
            }
        }
        return this.f47038m;
    }

    public final String b() {
        if (!s8.d(this.f47037l)) {
            return this.f47037l;
        }
        String str = this.f47028a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47037l = substring;
            return substring;
        }
        return null;
    }
}
