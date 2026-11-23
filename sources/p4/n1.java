package p4;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final e2.b1 f55362k;
    public static final n1 f55363l;
    public static final String f55364m;
    public static final String f55365n;
    public static final String f55366o;
    public static final String f55367p;
    public static final String f55368q;
    public static final String f55369r;
    public static final String f55370s;
    public static final String f55371t;
    public static final String f55372u;
    public static final String v;
    public final e2.b1 f55373a;
    public final boolean f55374b;
    public final long f55375c;
    public final long d;
    public final long f55376e;
    public final int f55377f;
    public final long f55378g;
    public final long h;
    public final long f55379i;
    public final long f55380j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f55362k = b1Var;
        f55363l = new n1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13778a;
        f55364m = Integer.toString(0, 36);
        f55365n = Integer.toString(1, 36);
        f55366o = Integer.toString(2, 36);
        f55367p = Integer.toString(3, 36);
        f55368q = Integer.toString(4, 36);
        f55369r = Integer.toString(5, 36);
        f55370s = Integer.toString(6, 36);
        f55371t = Integer.toString(7, 36);
        f55372u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public n1(e2.b1 b1Var, boolean z10, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (b1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.f(z10 == z11);
        this.f55373a = b1Var;
        this.f55374b = z10;
        this.f55375c = j3;
        this.d = j10;
        this.f55376e = j11;
        this.f55377f = i7;
        this.f55378g = j12;
        this.h = j13;
        this.f55379i = j14;
        this.f55380j = j15;
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
        e2.b1 b10 = this.f55373a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f55374b) {
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
            j10 = this.f55376e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f55377f;
        }
        if (z10) {
            j11 = this.f55378g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f55379i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f55380j;
        } else {
            j14 = 0;
        }
        return new n1(b10, z12, this.f55375c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f55373a;
        if (i7 < 3 || !f55362k.a(b1Var)) {
            bundle.putBundle(f55364m, b1Var.c(i7));
        }
        boolean z10 = this.f55374b;
        if (z10) {
            bundle.putBoolean(f55365n, z10);
        }
        long j3 = this.f55375c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f55366o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f55367p, j10);
        }
        long j11 = this.f55376e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f55368q, j11);
        }
        int i10 = this.f55377f;
        if (i10 != 0) {
            bundle.putInt(f55369r, i10);
        }
        long j12 = this.f55378g;
        if (j12 != 0) {
            bundle.putLong(f55370s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f55371t, j13);
        }
        long j14 = this.f55379i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f55372u, j14);
        }
        long j15 = this.f55380j;
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
            if (this.f55375c == n1Var.f55375c && this.f55373a.equals(n1Var.f55373a) && this.f55374b == n1Var.f55374b && this.d == n1Var.d && this.f55376e == n1Var.f55376e && this.f55377f == n1Var.f55377f && this.f55378g == n1Var.f55378g && this.h == n1Var.h && this.f55379i == n1Var.f55379i && this.f55380j == n1Var.f55380j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55373a, Boolean.valueOf(this.f55374b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f55373a;
        sb2.append(b1Var.f10330b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10332e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10333f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10334g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10335i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f55374b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f55375c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f55376e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f55377f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f55378g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f55379i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f55380j, "}");
    }
}
