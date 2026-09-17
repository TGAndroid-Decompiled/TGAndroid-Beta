package uc;

import w7.s8;
public final class a {
    public static final String[] f47023o = {"34", "37"};
    public static final String[] f47024p = {"60", "62", "64", "65"};
    public static final String[] f47025q = {"35"};
    public static final String[] f47026r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f47027s = {"4"};
    public static final String[] f47028t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f47029a;
    public final String f47030b;
    public final Integer f47031c;
    public final Integer d;
    public final String f47032e;
    public final String f47033f;
    public final String f47034g;
    public final String h;
    public final String f47035i;
    public final String f47036j;
    public final String f47037k;
    public String f47038l;
    public String f47039m;
    public final String f47040n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f47029a = s8.e(replaceAll);
        this.f47031c = num;
        this.d = num2;
        this.f47030b = s8.e(str2);
        this.f47032e = s8.e(str3);
        this.f47033f = s8.e(str4);
        this.f47034g = s8.e(str5);
        this.h = s8.e(str6);
        this.f47035i = s8.e(str7);
        this.f47036j = s8.e(str8);
        this.f47037k = s8.e(str9);
        this.f47039m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f47038l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f47040n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f47039m)) {
            String str2 = this.f47029a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f47023o)) {
                    str = "American Express";
                } else if (s8.c(str2, f47024p)) {
                    str = "Discover";
                } else if (s8.c(str2, f47025q)) {
                    str = "JCB";
                } else if (s8.c(str2, f47026r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f47027s)) {
                    str = "Visa";
                } else if (s8.c(str2, f47028t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f47039m = str;
            }
        }
        return this.f47039m;
    }

    public final String b() {
        if (!s8.d(this.f47038l)) {
            return this.f47038l;
        }
        String str = this.f47029a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f47038l = substring;
            return substring;
        }
        return null;
    }
}
