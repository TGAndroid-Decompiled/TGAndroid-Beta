package uc;

import c8.td;
public final class a {
    public static final String[] f58612o = {"34", "37"};
    public static final String[] f58613p = {"60", "62", "64", "65"};
    public static final String[] f58614q = {"35"};
    public static final String[] f58615r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58616s = {"4"};
    public static final String[] f58617t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58618a;
    public final String f58619b;
    public final Integer f58620c;
    public final Integer d;
    public final String f58621e;
    public final String f58622f;
    public final String f58623g;
    public final String h;
    public final String f58624i;
    public final String f58625j;
    public final String f58626k;
    public String f58627l;
    public String f58628m;
    public final String f58629n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58618a = td.e(replaceAll);
        this.f58620c = num;
        this.d = num2;
        this.f58619b = td.e(str2);
        this.f58621e = td.e(str3);
        this.f58622f = td.e(str4);
        this.f58623g = td.e(str5);
        this.h = td.e(str6);
        this.f58624i = td.e(str7);
        this.f58625j = td.e(str8);
        this.f58626k = td.e(str9);
        this.f58628m = td.a(str10) == null ? a() : str10;
        if (td.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58627l = str16;
        td.e(str12);
        td.b(str13);
        td.e(str14);
        this.f58629n = td.e(str15);
    }

    public final String a() {
        String str;
        if (td.d(this.f58628m)) {
            String str2 = this.f58618a;
            if (!td.d(str2)) {
                if (td.c(str2, f58612o)) {
                    str = "American Express";
                } else if (td.c(str2, f58613p)) {
                    str = "Discover";
                } else if (td.c(str2, f58614q)) {
                    str = "JCB";
                } else if (td.c(str2, f58615r)) {
                    str = "Diners Club";
                } else if (td.c(str2, f58616s)) {
                    str = "Visa";
                } else if (td.c(str2, f58617t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58628m = str;
            }
        }
        return this.f58628m;
    }

    public final String b() {
        if (!td.d(this.f58627l)) {
            return this.f58627l;
        }
        String str = this.f58618a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58627l = substring;
            return substring;
        }
        return null;
    }
}
