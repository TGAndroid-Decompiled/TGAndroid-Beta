package uc;

import c8.td;
public final class a {
    public static final String[] f58566o = {"34", "37"};
    public static final String[] f58567p = {"60", "62", "64", "65"};
    public static final String[] f58568q = {"35"};
    public static final String[] f58569r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] f58570s = {"4"};
    public static final String[] f58571t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String f58572a;
    public final String f58573b;
    public final Integer f58574c;
    public final Integer d;
    public final String f58575e;
    public final String f58576f;
    public final String f58577g;
    public final String h;
    public final String f58578i;
    public final String f58579j;
    public final String f58580k;
    public String f58581l;
    public String f58582m;
    public final String f58583n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String replaceAll;
        String str16;
        if (str == null) {
            replaceAll = null;
        } else {
            replaceAll = str.trim().replaceAll("\\s+|-", "");
        }
        this.f58572a = td.e(replaceAll);
        this.f58574c = num;
        this.d = num2;
        this.f58573b = td.e(str2);
        this.f58575e = td.e(str3);
        this.f58576f = td.e(str4);
        this.f58577g = td.e(str5);
        this.h = td.e(str6);
        this.f58578i = td.e(str7);
        this.f58579j = td.e(str8);
        this.f58580k = td.e(str9);
        this.f58582m = td.a(str10) == null ? a() : str10;
        if (td.e(str11) == null) {
            str16 = b();
        } else {
            str16 = str11;
        }
        this.f58581l = str16;
        td.e(str12);
        td.b(str13);
        td.e(str14);
        this.f58583n = td.e(str15);
    }

    public final String a() {
        String str;
        if (td.d(this.f58582m)) {
            String str2 = this.f58572a;
            if (!td.d(str2)) {
                if (td.c(str2, f58566o)) {
                    str = "American Express";
                } else if (td.c(str2, f58567p)) {
                    str = "Discover";
                } else if (td.c(str2, f58568q)) {
                    str = "JCB";
                } else if (td.c(str2, f58569r)) {
                    str = "Diners Club";
                } else if (td.c(str2, f58570s)) {
                    str = "Visa";
                } else if (td.c(str2, f58571t)) {
                    str = "MasterCard";
                } else {
                    str = "Unknown";
                }
                this.f58582m = str;
            }
        }
        return this.f58582m;
    }

    public final String b() {
        if (!td.d(this.f58581l)) {
            return this.f58581l;
        }
        String str = this.f58572a;
        if (str != null && str.length() > 4) {
            String substring = str.substring(str.length() - 4, str.length());
            this.f58581l = substring;
            return substring;
        }
        return null;
    }
}
