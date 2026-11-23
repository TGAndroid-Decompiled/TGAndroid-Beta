package uc;

import c8.ud;
public final class a {
    public static final String[] f58692o = {"34", "37"};
    public static final String[] f58693p = {"60", "62", "64", "65"};
    public static final String[] f58694q = {"35"};
    public static final String[] f58695r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58696s = {"4"};
    public static final String[] f58697t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58698a;
    public final String f58699b;
    public final Integer f58700c;
    public final Integer d;
    public final String f58701e;
    public final String f58702f;
    public final String f58703g;
    public final String h;
    public final String f58704i;
    public final String f58705j;
    public final String f58706k;
    public String f58707l;
    public String f58708m;
    public final String f58709n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58698a = ud.e(replaceAll);
        this.f58700c = num;
        this.d = num2;
        this.f58699b = ud.e(str2);
        this.f58701e = ud.e(str3);
        this.f58702f = ud.e(str4);
        this.f58703g = ud.e(str5);
        this.h = ud.e(str6);
        this.f58704i = ud.e(str7);
        this.f58705j = ud.e(str8);
        this.f58706k = ud.e(str9);
        this.f58708m = ud.a(str10) == null ? a() : str10;
        if (ud.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58707l = str16;
        ud.e(str12);
        ud.b(str13);
        ud.e(str14);
        this.f58709n = ud.e(str15);
    }

    public final String a() {
        String str;
        if (ud.d(this.f58708m)) {
            String str2 = this.f58698a;
            if (!ud.d(str2)) {
                if (ud.c(str2, f58692o)) {
                    str = "American Express";
                } else if (ud.c(str2, f58693p)) {
                    str = "Discover";
                } else if (ud.c(str2, f58694q)) {
                    str = "JCB";
                } else if (ud.c(str2, f58695r)) {
                    str = "Diners Club";
                } else if (ud.c(str2, f58696s)) {
                    str = "Visa";
                } else if (ud.c(str2, f58697t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58708m = str;
            }
        }
        return this.f58708m;
    }

    public final String b() {
        if (!ud.d(this.f58707l)) {
            return this.f58707l;
        }
        String str = this.f58698a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58707l = substring;
            return substring;
        }
        return null;
    }
}
