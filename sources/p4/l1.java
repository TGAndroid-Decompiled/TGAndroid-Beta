package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final e2.b1 f53343k;
    public static final l1 f53344l;
    public static final String f53345m;
    public static final String f53346n;
    public static final String f53347o;
    public static final String f53348p;
    public static final String f53349q;
    public static final String f53350r;
    public static final String f53351s;
    public static final String f53352t;
    public static final String f53353u;
    public static final String v;
    public final e2.b1 f53354a;
    public final boolean f53355b;
    public final long f53356c;
    public final long d;
    public final long f53357e;
    public final int f53358f;
    public final long f53359g;
    public final long h;
    public final long f53360i;
    public final long f53361j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f53343k = b1Var;
        f53344l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.m0.f14112a;
        f53345m = Integer.toString(0, 36);
        f53346n = Integer.toString(1, 36);
        f53347o = Integer.toString(2, 36);
        f53348p = Integer.toString(3, 36);
        f53349q = Integer.toString(4, 36);
        f53350r = Integer.toString(5, 36);
        f53351s = Integer.toString(6, 36);
        f53352t = Integer.toString(7, 36);
        f53353u = Integer.toString(8, 36);
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
        this.f53354a = b1Var;
        this.f53355b = z9;
        this.f53356c = j3;
        this.d = j10;
        this.f53357e = j11;
        this.f53358f = i7;
        this.f53359g = j12;
        this.h = j13;
        this.f53360i = j14;
        this.f53361j = j15;
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
        e2.b1 b10 = this.f53354a.b(z9, z10);
        int i7 = 0;
        if (z9 && this.f53355b) {
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
            j10 = this.f53357e;
        } else {
            j10 = 0;
        }
        if (z9) {
            i7 = this.f53358f;
        }
        if (z9) {
            j11 = this.f53359g;
        } else {
            j11 = 0;
        }
        if (z9) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z9) {
            j13 = this.f53360i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z9) {
            j14 = this.f53361j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z11, this.f53356c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f53354a;
        if (i7 < 3 || !f53343k.a(b1Var)) {
            bundle.putBundle(f53345m, b1Var.c(i7));
        }
        boolean z9 = this.f53355b;
        if (z9) {
            bundle.putBoolean(f53346n, z9);
        }
        long j3 = this.f53356c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f53347o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f53348p, j10);
        }
        long j11 = this.f53357e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f53349q, j11);
        }
        int i10 = this.f53358f;
        if (i10 != 0) {
            bundle.putInt(f53350r, i10);
        }
        long j12 = this.f53359g;
        if (j12 != 0) {
            bundle.putLong(f53351s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f53352t, j13);
        }
        long j14 = this.f53360i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f53353u, j14);
        }
        long j15 = this.f53361j;
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
            if (this.f53356c == l1Var.f53356c && this.f53354a.equals(l1Var.f53354a) && this.f53355b == l1Var.f53355b && this.d == l1Var.d && this.f53357e == l1Var.f53357e && this.f53358f == l1Var.f53358f && this.f53359g == l1Var.f53359g && this.h == l1Var.h && this.f53360i == l1Var.f53360i && this.f53361j == l1Var.f53361j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53354a, Boolean.valueOf(this.f53355b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f53354a;
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
        sb2.append(this.f53355b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f53356c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f53357e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f53358f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f53359g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f53360i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f53361j, "}");
    }
}
