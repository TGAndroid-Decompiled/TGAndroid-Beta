package uc;

import c8.td;
public final class a {
    public static final String[] f58608o = {"34", "37"};
    public static final String[] f58609p = {"60", "62", "64", "65"};
    public static final String[] f58610q = {"35"};
    public static final String[] f58611r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58612s = {"4"};
    public static final String[] f58613t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58614a;
    public final String f58615b;
    public final Integer f58616c;
    public final Integer d;
    public final String f58617e;
    public final String f58618f;
    public final String f58619g;
    public final String h;
    public final String f58620i;
    public final String f58621j;
    public final String f58622k;
    public String f58623l;
    public String f58624m;
    public final String f58625n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58614a = td.e(replaceAll);
        this.f58616c = num;
        this.d = num2;
        this.f58615b = td.e(str2);
        this.f58617e = td.e(str3);
        this.f58618f = td.e(str4);
        this.f58619g = td.e(str5);
        this.h = td.e(str6);
        this.f58620i = td.e(str7);
        this.f58621j = td.e(str8);
        this.f58622k = td.e(str9);
        this.f58624m = td.a(str10) == null ? a() : str10;
        if (td.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58623l = str16;
        td.e(str12);
        td.b(str13);
        td.e(str14);
        this.f58625n = td.e(str15);
    }

    public final String a() {
        String str;
        if (td.d(this.f58624m)) {
            String str2 = this.f58614a;
            if (!td.d(str2)) {
                if (td.c(str2, f58608o)) {
                    str = "American Express";
                } else if (td.c(str2, f58609p)) {
                    str = "Discover";
                } else if (td.c(str2, f58610q)) {
                    str = "JCB";
                } else if (td.c(str2, f58611r)) {
                    str = "Diners Club";
                } else if (td.c(str2, f58612s)) {
                    str = "Visa";
                } else if (td.c(str2, f58613t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58624m = str;
            }
        }
        return this.f58624m;
    }

    public final String b() {
        if (!td.d(this.f58623l)) {
            return this.f58623l;
        }
        String str = this.f58614a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58623l = substring;
            return substring;
        }
        return null;
    }
}
