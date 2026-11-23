package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final e2.b1 f55397k;
    public static final n1 f55398l;
    public static final String f55399m;
    public static final String f55400n;
    public static final String f55401o;
    public static final String f55402p;
    public static final String f55403q;
    public static final String f55404r;
    public static final String f55405s;
    public static final String f55406t;
    public static final String f55407u;
    public static final String v;
    public final e2.b1 f55408a;
    public final boolean f55409b;
    public final long f55410c;
    public final long d;
    public final long f55411e;
    public final int f55412f;
    public final long f55413g;
    public final long h;
    public final long f55414i;
    public final long f55415j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f55397k = b1Var;
        f55398l = new n1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13815a;
        f55399m = Integer.toString(0, 36);
        f55400n = Integer.toString(1, 36);
        f55401o = Integer.toString(2, 36);
        f55402p = Integer.toString(3, 36);
        f55403q = Integer.toString(4, 36);
        f55404r = Integer.toString(5, 36);
        f55405s = Integer.toString(6, 36);
        f55406t = Integer.toString(7, 36);
        f55407u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public n1(e2.b1 b1Var, boolean z10, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (b1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.f(z10 == z11);
        this.f55408a = b1Var;
        this.f55409b = z10;
        this.f55410c = j3;
        this.d = j10;
        this.f55411e = j11;
        this.f55412f = i7;
        this.f55413g = j12;
        this.h = j13;
        this.f55414i = j14;
        this.f55415j = j15;
    }

    public final n1 a(boolean z10, boolean z11) {
        boolean z12;
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (z10 && z11) {
            return this;
        }
        e2.b1 b10 = this.f55408a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f55409b) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            j3 = this.d;
        } else {
            j3 = -9223372036854775807L;
        }
        if (z10) {
            j10 = this.f55411e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f55412f;
        }
        if (z10) {
            j11 = this.f55413g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f55414i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f55415j;
        } else {
            j14 = 0;
        }
        return new n1(b10, z12, this.f55410c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f55408a;
        if (i7 < 3 || !f55397k.a(b1Var)) {
            bundle.putBundle(f55399m, b1Var.c(i7));
        }
        boolean z10 = this.f55409b;
        if (z10) {
            bundle.putBoolean(f55400n, z10);
        }
        long j3 = this.f55410c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f55401o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f55402p, j10);
        }
        long j11 = this.f55411e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f55403q, j11);
        }
        int i10 = this.f55412f;
        if (i10 != 0) {
            bundle.putInt(f55404r, i10);
        }
        long j12 = this.f55413g;
        if (j12 != 0) {
            bundle.putLong(f55405s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f55406t, j13);
        }
        long j14 = this.f55414i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f55407u, j14);
        }
        long j15 = this.f55415j;
        if (i7 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f55410c == n1Var.f55410c && this.f55408a.equals(n1Var.f55408a) && this.f55409b == n1Var.f55409b && this.d == n1Var.d && this.f55411e == n1Var.f55411e && this.f55412f == n1Var.f55412f && this.f55413g == n1Var.f55413g && this.h == n1Var.h && this.f55414i == n1Var.f55414i && this.f55415j == n1Var.f55415j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55408a, Boolean.valueOf(this.f55409b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f55408a;
        sb2.append(b1Var.f10367b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10369e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10370f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10371g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10372i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f55409b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f55410c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f55411e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f55412f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f55413g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f55414i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f55415j, "}");
    }
}
