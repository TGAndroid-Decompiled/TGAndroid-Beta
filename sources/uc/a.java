package uc;

import w7.t8;
public final class a {
    public static final String[] f43989o = {"34", "37"};
    public static final String[] f43990p = {"60", "62", "64", "65"};
    public static final String[] f43991q = {"35"};
    public static final String[] f43992r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43993s = {"4"};
    public static final String[] f43994t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43995a;
    public final String f43996b;
    public final Integer f43997c;
    public final Integer d;
    public final String e;
    public final String f43998f;
    public final String f43999g;
    public final String h;
    public final String f44000i;
    public final String f44001j;
    public final String f44002k;
    public String f44003l;
    public String f44004m;
    public final String f44005n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43995a = t8.e(replaceAll);
        this.f43997c = num;
        this.d = num2;
        this.f43996b = t8.e(str2);
        this.e = t8.e(str3);
        this.f43998f = t8.e(str4);
        this.f43999g = t8.e(str5);
        this.h = t8.e(str6);
        this.f44000i = t8.e(str7);
        this.f44001j = t8.e(str8);
        this.f44002k = t8.e(str9);
        this.f44004m = t8.a(str10) == null ? a() : str10;
        if (t8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f44003l = str16;
        t8.e(str12);
        t8.b(str13);
        t8.e(str14);
        this.f44005n = t8.e(str15);
    }

    public final String a() {
        String str;
        if (t8.d(this.f44004m)) {
            String str2 = this.f43995a;
            if (!t8.d(str2)) {
                if (t8.c(str2, f43989o)) {
                    str = "American Express";
                } else if (t8.c(str2, f43990p)) {
                    str = "Discover";
                } else if (t8.c(str2, f43991q)) {
                    str = "JCB";
                } else if (t8.c(str2, f43992r)) {
                    str = "Diners Club";
                } else if (t8.c(str2, f43993s)) {
                    str = "Visa";
                } else if (t8.c(str2, f43994t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f44004m = str;
            }
        }
        return this.f44004m;
    }

    public final String b() {
        if (!t8.d(this.f44003l)) {
            return this.f44003l;
        }
        String str = this.f43995a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f44003l = substring;
            return substring;
        }
        return null;
    }
}
