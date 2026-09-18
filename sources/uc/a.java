package uc;

import w7.t8;
public final class a {
    public static final String[] f43916o = {"34", "37"};
    public static final String[] f43917p = {"60", "62", "64", "65"};
    public static final String[] f43918q = {"35"};
    public static final String[] f43919r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43920s = {"4"};
    public static final String[] f43921t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43922a;
    public final String f43923b;
    public final Integer f43924c;
    public final Integer d;
    public final String e;
    public final String f43925f;
    public final String f43926g;
    public final String h;
    public final String f43927i;
    public final String f43928j;
    public final String f43929k;
    public String f43930l;
    public String f43931m;
    public final String f43932n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43922a = t8.e(replaceAll);
        this.f43924c = num;
        this.d = num2;
        this.f43923b = t8.e(str2);
        this.e = t8.e(str3);
        this.f43925f = t8.e(str4);
        this.f43926g = t8.e(str5);
        this.h = t8.e(str6);
        this.f43927i = t8.e(str7);
        this.f43928j = t8.e(str8);
        this.f43929k = t8.e(str9);
        this.f43931m = t8.a(str10) == null ? a() : str10;
        if (t8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43930l = str16;
        t8.e(str12);
        t8.b(str13);
        t8.e(str14);
        this.f43932n = t8.e(str15);
    }

    public final String a() {
        String str;
        if (t8.d(this.f43931m)) {
            String str2 = this.f43922a;
            if (!t8.d(str2)) {
                if (t8.c(str2, f43916o)) {
                    str = "American Express";
                } else if (t8.c(str2, f43917p)) {
                    str = "Discover";
                } else if (t8.c(str2, f43918q)) {
                    str = "JCB";
                } else if (t8.c(str2, f43919r)) {
                    str = "Diners Club";
                } else if (t8.c(str2, f43920s)) {
                    str = "Visa";
                } else if (t8.c(str2, f43921t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43931m = str;
            }
        }
        return this.f43931m;
    }

    public final String b() {
        if (!t8.d(this.f43930l)) {
            return this.f43930l;
        }
        String str = this.f43922a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43930l = substring;
            return substring;
        }
        return null;
    }
}
