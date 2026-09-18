package uc;

import w7.s8;
public final class a {
    public static final String[] f43689o = {"34", "37"};
    public static final String[] f43690p = {"60", "62", "64", "65"};
    public static final String[] f43691q = {"35"};
    public static final String[] f43692r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43693s = {"4"};
    public static final String[] f43694t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43695a;
    public final String f43696b;
    public final Integer f43697c;
    public final Integer d;
    public final String e;
    public final String f43698f;
    public final String f43699g;
    public final String h;
    public final String f43700i;
    public final String f43701j;
    public final String f43702k;
    public String f43703l;
    public String f43704m;
    public final String f43705n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43695a = s8.e(replaceAll);
        this.f43697c = num;
        this.d = num2;
        this.f43696b = s8.e(str2);
        this.e = s8.e(str3);
        this.f43698f = s8.e(str4);
        this.f43699g = s8.e(str5);
        this.h = s8.e(str6);
        this.f43700i = s8.e(str7);
        this.f43701j = s8.e(str8);
        this.f43702k = s8.e(str9);
        this.f43704m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43703l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f43705n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f43704m)) {
            String str2 = this.f43695a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f43689o)) {
                    str = "American Express";
                } else if (s8.c(str2, f43690p)) {
                    str = "Discover";
                } else if (s8.c(str2, f43691q)) {
                    str = "JCB";
                } else if (s8.c(str2, f43692r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f43693s)) {
                    str = "Visa";
                } else if (s8.c(str2, f43694t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43704m = str;
            }
        }
        return this.f43704m;
    }

    public final String b() {
        if (!s8.d(this.f43703l)) {
            return this.f43703l;
        }
        String str = this.f43695a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43703l = substring;
            return substring;
        }
        return null;
    }
}
