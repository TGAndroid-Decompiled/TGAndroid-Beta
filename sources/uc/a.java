package uc;

import c8.qd;
public final class a {
    public static final String[] f58001o = {"34", "37"};
    public static final String[] f58002p = {"60", "62", "64", "65"};
    public static final String[] f58003q = {"35"};
    public static final String[] f58004r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58005s = {"4"};
    public static final String[] f58006t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58007a;
    public final String f58008b;
    public final Integer f58009c;
    public final Integer d;
    public final String f58010e;
    public final String f58011f;
    public final String f58012g;
    public final String h;
    public final String f58013i;
    public final String f58014j;
    public final String f58015k;
    public String f58016l;
    public String f58017m;
    public final String f58018n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58007a = qd.e(replaceAll);
        this.f58009c = num;
        this.d = num2;
        this.f58008b = qd.e(str2);
        this.f58010e = qd.e(str3);
        this.f58011f = qd.e(str4);
        this.f58012g = qd.e(str5);
        this.h = qd.e(str6);
        this.f58013i = qd.e(str7);
        this.f58014j = qd.e(str8);
        this.f58015k = qd.e(str9);
        this.f58017m = qd.a(str10) == null ? a() : str10;
        if (qd.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58016l = str16;
        qd.e(str12);
        qd.b(str13);
        qd.e(str14);
        this.f58018n = qd.e(str15);
    }

    public final String a() {
        String str;
        if (qd.d(this.f58017m)) {
            String str2 = this.f58007a;
            if (!qd.d(str2)) {
                if (qd.c(str2, f58001o)) {
                    str = "American Express";
                } else if (qd.c(str2, f58002p)) {
                    str = "Discover";
                } else if (qd.c(str2, f58003q)) {
                    str = "JCB";
                } else if (qd.c(str2, f58004r)) {
                    str = "Diners Club";
                } else if (qd.c(str2, f58005s)) {
                    str = "Visa";
                } else if (qd.c(str2, f58006t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58017m = str;
            }
        }
        return this.f58017m;
    }

    public final String b() {
        if (!qd.d(this.f58016l)) {
            return this.f58016l;
        }
        String str = this.f58007a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58016l = substring;
            return substring;
        }
        return null;
    }
}
