package p4;

import a8.la;
import android.os.Bundle;
import j$.util.Objects;
public final class n1 {
    public static final e2.b1 f55352k;
    public static final n1 f55353l;
    public static final String f55354m;
    public static final String f55355n;
    public static final String f55356o;
    public static final String f55357p;
    public static final String f55358q;
    public static final String f55359r;
    public static final String f55360s;
    public static final String f55361t;
    public static final String f55362u;
    public static final String v;
    public final e2.b1 f55363a;
    public final boolean f55364b;
    public final long f55365c;
    public final long d;
    public final long f55366e;
    public final int f55367f;
    public final long f55368g;
    public final long h;
    public final long f55369i;
    public final long f55370j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f55352k = b1Var;
        f55353l = new n1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13783a;
        f55354m = Integer.toString(0, 36);
        f55355n = Integer.toString(1, 36);
        f55356o = Integer.toString(2, 36);
        f55357p = Integer.toString(3, 36);
        f55358q = Integer.toString(4, 36);
        f55359r = Integer.toString(5, 36);
        f55360s = Integer.toString(6, 36);
        f55361t = Integer.toString(7, 36);
        f55362u = Integer.toString(8, 36);
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
        this.f55363a = b1Var;
        this.f55364b = z10;
        this.f55365c = j3;
        this.d = j10;
        this.f55366e = j11;
        this.f55367f = i7;
        this.f55368g = j12;
        this.h = j13;
        this.f55369i = j14;
        this.f55370j = j15;
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
        e2.b1 b10 = this.f55363a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f55364b) {
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
            j10 = this.f55366e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f55367f;
        }
        if (z10) {
            j11 = this.f55368g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f55369i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f55370j;
        } else {
            j14 = 0;
        }
        return new n1(b10, z12, this.f55365c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f55363a;
        if (i7 < 3 || !f55352k.a(b1Var)) {
            bundle.putBundle(f55354m, b1Var.c(i7));
        }
        boolean z10 = this.f55364b;
        if (z10) {
            bundle.putBoolean(f55355n, z10);
        }
        long j3 = this.f55365c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f55356o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f55357p, j10);
        }
        long j11 = this.f55366e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f55358q, j11);
        }
        int i10 = this.f55367f;
        if (i10 != 0) {
            bundle.putInt(f55359r, i10);
        }
        long j12 = this.f55368g;
        if (j12 != 0) {
            bundle.putLong(f55360s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f55361t, j13);
        }
        long j14 = this.f55369i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f55362u, j14);
        }
        long j15 = this.f55370j;
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
            if (this.f55365c == n1Var.f55365c && this.f55363a.equals(n1Var.f55363a) && this.f55364b == n1Var.f55364b && this.d == n1Var.d && this.f55366e == n1Var.f55366e && this.f55367f == n1Var.f55367f && this.f55368g == n1Var.f55368g && this.h == n1Var.h && this.f55369i == n1Var.f55369i && this.f55370j == n1Var.f55370j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55363a, Boolean.valueOf(this.f55364b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f55363a;
        sb2.append(b1Var.f10335b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10337e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10338f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10339g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10340i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f55364b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f55365c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f55366e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f55367f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f55368g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f55369i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f55370j, "}");
    }
}
