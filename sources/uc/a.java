package uc;

import w7.t8;
public final class a {
    public static final String[] f43946o = {"34", "37"};
    public static final String[] f43947p = {"60", "62", "64", "65"};
    public static final String[] f43948q = {"35"};
    public static final String[] f43949r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f43950s = {"4"};
    public static final String[] f43951t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f43952a;
    public final String f43953b;
    public final Integer f43954c;
    public final Integer d;
    public final String e;
    public final String f43955f;
    public final String f43956g;
    public final String h;
    public final String f43957i;
    public final String f43958j;
    public final String f43959k;
    public String f43960l;
    public String f43961m;
    public final String f43962n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f43952a = t8.e(replaceAll);
        this.f43954c = num;
        this.d = num2;
        this.f43953b = t8.e(str2);
        this.e = t8.e(str3);
        this.f43955f = t8.e(str4);
        this.f43956g = t8.e(str5);
        this.h = t8.e(str6);
        this.f43957i = t8.e(str7);
        this.f43958j = t8.e(str8);
        this.f43959k = t8.e(str9);
        this.f43961m = t8.a(str10) == null ? a() : str10;
        if (t8.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f43960l = str16;
        t8.e(str12);
        t8.b(str13);
        t8.e(str14);
        this.f43962n = t8.e(str15);
    }

    public final String a() {
        String str;
        if (t8.d(this.f43961m)) {
            String str2 = this.f43952a;
            if (!t8.d(str2)) {
                if (t8.c(str2, f43946o)) {
                    str = "American Express";
                } else if (t8.c(str2, f43947p)) {
                    str = "Discover";
                } else if (t8.c(str2, f43948q)) {
                    str = "JCB";
                } else if (t8.c(str2, f43949r)) {
                    str = "Diners Club";
                } else if (t8.c(str2, f43950s)) {
                    str = "Visa";
                } else if (t8.c(str2, f43951t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f43961m = str;
            }
        }
        return this.f43961m;
    }

    public final String b() {
        if (!t8.d(this.f43960l)) {
            return this.f43960l;
        }
        String str = this.f43952a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f43960l = substring;
            return substring;
        }
        return null;
    }
}
