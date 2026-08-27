package w4;

import android.graphics.Color;
import h7.u6;

public final class d {

    public final String f49258a;

    public final int f49259b;

    public final Integer f49260c;
    public final Integer d;

    public final float f49261e;

    public final boolean f49262f;

    public final boolean f49263g;
    public final boolean h;

    public final boolean f49264i;

    public final int f49265j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f49258a = str;
        this.f49259b = i10;
        this.f49260c = num;
        this.d = num2;
        this.f49261e = f10;
        this.f49262f = z10;
        this.f49263g = z11;
        this.h = z12;
        this.f49264i = z13;
        this.f49265j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        s3.c.k("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e9) {
            d5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e9);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            d5.a.f(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(u6.a(((j10 >> 24) & 255) ^ 255), u6.a(j10 & 255), u6.a((j10 >> 8) & 255), u6.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e9) {
            d5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e9);
            return null;
        }
    }
}
