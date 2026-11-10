package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class z41 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f52241a;
    public String f52242b;
    public String f52243c;
    public boolean d;
    public String f52244e;
    public String f52245f;
    public String f52246g;
    public boolean h;
    public String f52247i;
    public String f52248j;
    public String f52249k;
    public boolean f52250l;
    public String f52251m;
    public String f52252n;
    public String f52253o;
    public String f52254p;
    public String f52255q;
    public boolean f52256r;
    public boolean f52257s;
    public String f52258t;
    public String f52259u;
    public String v;
    public boolean f52260w;
    public boolean f52261x;
    public String f52262y;
    public String f52263z;

    public static ab.b0 a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z9;
        double d = tL_statsAbsValueAndPrev.current;
        double d2 = tL_statsAbsValueAndPrev.previous;
        int i7 = (int) (d - d2);
        if (d2 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i7 / ((float) d2)) * 100.0f);
        }
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z10 = true;
        String str = "";
        if (i7 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.g0.o0(i7, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i7 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.g0.o0(i7, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z9);
        Boolean valueOf2 = Boolean.valueOf(z10);
        ab.b0 b0Var = new ab.b0(11, false);
        b0Var.f907b = o02;
        b0Var.f909e = str;
        b0Var.f908c = valueOf;
        b0Var.d = valueOf2;
        return b0Var;
    }
}
