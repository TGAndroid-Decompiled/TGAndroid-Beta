package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final e2.b1 f53344k;
    public static final l1 f53345l;
    public static final String f53346m;
    public static final String f53347n;
    public static final String f53348o;
    public static final String f53349p;
    public static final String f53350q;
    public static final String f53351r;
    public static final String f53352s;
    public static final String f53353t;
    public static final String f53354u;
    public static final String v;
    public final e2.b1 f53355a;
    public final boolean f53356b;
    public final long f53357c;
    public final long d;
    public final long f53358e;
    public final int f53359f;
    public final long f53360g;
    public final long h;
    public final long f53361i;
    public final long f53362j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f53344k = b1Var;
        f53345l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.m0.f14112a;
        f53346m = Integer.toString(0, 36);
        f53347n = Integer.toString(1, 36);
        f53348o = Integer.toString(2, 36);
        f53349p = Integer.toString(3, 36);
        f53350q = Integer.toString(4, 36);
        f53351r = Integer.toString(5, 36);
        f53352s = Integer.toString(6, 36);
        f53353t = Integer.toString(7, 36);
        f53354u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public l1(e2.b1 b1Var, boolean z9, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        boolean z10;
        if (b1Var.h != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z9 == z10);
        this.f53355a = b1Var;
        this.f53356b = z9;
        this.f53357c = j3;
        this.d = j10;
        this.f53358e = j11;
        this.f53359f = i7;
        this.f53360g = j12;
        this.h = j13;
        this.f53361i = j14;
        this.f53362j = j15;
    }

    public final l1 a(boolean z9, boolean z10) {
        boolean z11;
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (z9 && z10) {
            return this;
        }
        e2.b1 b10 = this.f53355a.b(z9, z10);
        int i7 = 0;
        if (z9 && this.f53356b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9) {
            j3 = this.d;
        } else {
            j3 = -9223372036854775807L;
        }
        if (z9) {
            j10 = this.f53358e;
        } else {
            j10 = 0;
        }
        if (z9) {
            i7 = this.f53359f;
        }
        if (z9) {
            j11 = this.f53360g;
        } else {
            j11 = 0;
        }
        if (z9) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z9) {
            j13 = this.f53361i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z9) {
            j14 = this.f53362j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z11, this.f53357c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f53355a;
        if (i7 < 3 || !f53344k.a(b1Var)) {
            bundle.putBundle(f53346m, b1Var.c(i7));
        }
        boolean z9 = this.f53356b;
        if (z9) {
            bundle.putBoolean(f53347n, z9);
        }
        long j3 = this.f53357c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f53348o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f53349p, j10);
        }
        long j11 = this.f53358e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f53350q, j11);
        }
        int i10 = this.f53359f;
        if (i10 != 0) {
            bundle.putInt(f53351r, i10);
        }
        long j12 = this.f53360g;
        if (j12 != 0) {
            bundle.putLong(f53352s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f53353t, j13);
        }
        long j14 = this.f53361i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f53354u, j14);
        }
        long j15 = this.f53362j;
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
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f53357c == l1Var.f53357c && this.f53355a.equals(l1Var.f53355a) && this.f53356b == l1Var.f53356b && this.d == l1Var.d && this.f53358e == l1Var.f53358e && this.f53359f == l1Var.f53359f && this.f53360g == l1Var.f53360g && this.h == l1Var.h && this.f53361i == l1Var.f53361i && this.f53362j == l1Var.f53362j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53355a, Boolean.valueOf(this.f53356b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f53355a;
        sb2.append(b1Var.f10184b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10186e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10187f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10188g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10189i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f53356b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f53357c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f53358e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f53359f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f53360g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f53361i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f53362j, "}");
    }
}
