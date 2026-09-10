package uc;

import w7.s8;
public final class a {
    public static final String[] f42632o = {"34", "37"};
    public static final String[] f42633p = {"60", "62", "64", "65"};
    public static final String[] f42634q = {"35"};
    public static final String[] f42635r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f42636s = {"4"};
    public static final String[] f42637t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f42638a;
    public final String f42639b;
    public final Integer f42640c;
    public final Integer d;
    public final String e;
    public final String f42641f;
    public final String f42642g;
    public final String h;
    public final String f42643i;
    public final String f42644j;
    public final String f42645k;
    public String f42646l;
    public String f42647m;
    public final String f42648n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f42638a = s8.e(replaceAll);
        this.f42640c = num;
        this.d = num2;
        this.f42639b = s8.e(str2);
        this.e = s8.e(str3);
        this.f42641f = s8.e(str4);
        this.f42642g = s8.e(str5);
        this.h = s8.e(str6);
        this.f42643i = s8.e(str7);
        this.f42644j = s8.e(str8);
        this.f42645k = s8.e(str9);
        this.f42647m = s8.a(str10) == null ? a() : str10;
        if (s8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f42646l = str16;
        s8.e(str12);
        s8.b(str13);
        s8.e(str14);
        this.f42648n = s8.e(str15);
    }

    public final String a() {
        String str;
        if (s8.d(this.f42647m)) {
            String str2 = this.f42638a;
            if (!s8.d(str2)) {
                if (s8.c(str2, f42632o)) {
                    str = "American Express";
                } else if (s8.c(str2, f42633p)) {
                    str = "Discover";
                } else if (s8.c(str2, f42634q)) {
                    str = "JCB";
                } else if (s8.c(str2, f42635r)) {
                    str = "Diners Club";
                } else if (s8.c(str2, f42636s)) {
                    str = "Visa";
                } else if (s8.c(str2, f42637t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f42647m = str;
            }
        }
        return this.f42647m;
    }

    public final String b() {
        if (!s8.d(this.f42646l)) {
            return this.f42646l;
        }
        String str = this.f42638a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f42646l = substring;
            return substring;
        }
        return null;
    }
}
