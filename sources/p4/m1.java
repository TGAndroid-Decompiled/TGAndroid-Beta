package p4;

import a8.ma;
import android.os.Bundle;
import j$.util.Objects;
public final class m1 {
    public static final e2.b1 f55460k;
    public static final m1 f55461l;
    public static final String f55462m;
    public static final String f55463n;
    public static final String f55464o;
    public static final String f55465p;
    public static final String f55466q;
    public static final String f55467r;
    public static final String f55468s;
    public static final String f55469t;
    public static final String f55470u;
    public static final String v;
    public final e2.b1 f55471a;
    public final boolean f55472b;
    public final long f55473c;
    public final long d;
    public final long f55474e;
    public final int f55475f;
    public final long f55476g;
    public final long h;
    public final long f55477i;
    public final long f55478j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f55460k = b1Var;
        f55461l = new m1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13778a;
        f55462m = Integer.toString(0, 36);
        f55463n = Integer.toString(1, 36);
        f55464o = Integer.toString(2, 36);
        f55465p = Integer.toString(3, 36);
        f55466q = Integer.toString(4, 36);
        f55467r = Integer.toString(5, 36);
        f55468s = Integer.toString(6, 36);
        f55469t = Integer.toString(7, 36);
        f55470u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public m1(e2.b1 b1Var, boolean z10, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (b1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.f(z10 == z11);
        this.f55471a = b1Var;
        this.f55472b = z10;
        this.f55473c = j3;
        this.d = j10;
        this.f55474e = j11;
        this.f55475f = i7;
        this.f55476g = j12;
        this.h = j13;
        this.f55477i = j14;
        this.f55478j = j15;
    }

    public final m1 a(boolean z10, boolean z11) {
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
        e2.b1 b10 = this.f55471a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f55472b) {
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
            j10 = this.f55474e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f55475f;
        }
        if (z10) {
            j11 = this.f55476g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f55477i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f55478j;
        } else {
            j14 = 0;
        }
        return new m1(b10, z12, this.f55473c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f55471a;
        if (i7 < 3 || !f55460k.a(b1Var)) {
            bundle.putBundle(f55462m, b1Var.c(i7));
        }
        boolean z10 = this.f55472b;
        if (z10) {
            bundle.putBoolean(f55463n, z10);
        }
        long j3 = this.f55473c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f55464o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f55465p, j10);
        }
        long j11 = this.f55474e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f55466q, j11);
        }
        int i10 = this.f55475f;
        if (i10 != 0) {
            bundle.putInt(f55467r, i10);
        }
        long j12 = this.f55476g;
        if (j12 != 0) {
            bundle.putLong(f55468s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f55469t, j13);
        }
        long j14 = this.f55477i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f55470u, j14);
        }
        long j15 = this.f55478j;
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
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f55473c == m1Var.f55473c && this.f55471a.equals(m1Var.f55471a) && this.f55472b == m1Var.f55472b && this.d == m1Var.d && this.f55474e == m1Var.f55474e && this.f55475f == m1Var.f55475f && this.f55476g == m1Var.f55476g && this.h == m1Var.h && this.f55477i == m1Var.f55477i && this.f55478j == m1Var.f55478j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55471a, Boolean.valueOf(this.f55472b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f55471a;
        sb2.append(b1Var.f10328b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10330e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10331f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10332g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10333i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f55472b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f55473c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f55474e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f55475f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f55476g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f55477i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f55478j, "}");
    }
}
