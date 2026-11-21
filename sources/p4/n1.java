package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final e2.b1 f55393k;
    public static final n1 f55394l;
    public static final String f55395m;
    public static final String f55396n;
    public static final String f55397o;
    public static final String f55398p;
    public static final String f55399q;
    public static final String f55400r;
    public static final String f55401s;
    public static final String f55402t;
    public static final String f55403u;
    public static final String v;
    public final e2.b1 f55404a;
    public final boolean f55405b;
    public final long f55406c;
    public final long d;
    public final long f55407e;
    public final int f55408f;
    public final long f55409g;
    public final long h;
    public final long f55410i;
    public final long f55411j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f55393k = b1Var;
        f55394l = new n1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13812a;
        f55395m = Integer.toString(0, 36);
        f55396n = Integer.toString(1, 36);
        f55397o = Integer.toString(2, 36);
        f55398p = Integer.toString(3, 36);
        f55399q = Integer.toString(4, 36);
        f55400r = Integer.toString(5, 36);
        f55401s = Integer.toString(6, 36);
        f55402t = Integer.toString(7, 36);
        f55403u = Integer.toString(8, 36);
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
        this.f55404a = b1Var;
        this.f55405b = z10;
        this.f55406c = j3;
        this.d = j10;
        this.f55407e = j11;
        this.f55408f = i7;
        this.f55409g = j12;
        this.h = j13;
        this.f55410i = j14;
        this.f55411j = j15;
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
        e2.b1 b10 = this.f55404a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f55405b) {
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
            j10 = this.f55407e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f55408f;
        }
        if (z10) {
            j11 = this.f55409g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f55410i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f55411j;
        } else {
            j14 = 0;
        }
        return new n1(b10, z12, this.f55406c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f55404a;
        if (i7 < 3 || !f55393k.a(b1Var)) {
            bundle.putBundle(f55395m, b1Var.c(i7));
        }
        boolean z10 = this.f55405b;
        if (z10) {
            bundle.putBoolean(f55396n, z10);
        }
        long j3 = this.f55406c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f55397o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f55398p, j10);
        }
        long j11 = this.f55407e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f55399q, j11);
        }
        int i10 = this.f55408f;
        if (i10 != 0) {
            bundle.putInt(f55400r, i10);
        }
        long j12 = this.f55409g;
        if (j12 != 0) {
            bundle.putLong(f55401s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f55402t, j13);
        }
        long j14 = this.f55410i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f55403u, j14);
        }
        long j15 = this.f55411j;
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
            if (this.f55406c == n1Var.f55406c && this.f55404a.equals(n1Var.f55404a) && this.f55405b == n1Var.f55405b && this.d == n1Var.d && this.f55407e == n1Var.f55407e && this.f55408f == n1Var.f55408f && this.f55409g == n1Var.f55409g && this.h == n1Var.h && this.f55410i == n1Var.f55410i && this.f55411j == n1Var.f55411j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55404a, Boolean.valueOf(this.f55405b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f55404a;
        sb2.append(b1Var.f10364b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10366e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10367f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10368g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10369i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f55405b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f55406c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f55407e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f55408f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f55409g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f55410i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f55411j, "}");
    }
}
