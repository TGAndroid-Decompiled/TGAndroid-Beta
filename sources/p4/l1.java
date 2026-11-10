package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final e2.b1 f53355k;
    public static final l1 f53356l;
    public static final String f53357m;
    public static final String f53358n;
    public static final String f53359o;
    public static final String f53360p;
    public static final String f53361q;
    public static final String f53362r;
    public static final String f53363s;
    public static final String f53364t;
    public static final String f53365u;
    public static final String v;
    public final e2.b1 f53366a;
    public final boolean f53367b;
    public final long f53368c;
    public final long d;
    public final long f53369e;
    public final int f53370f;
    public final long f53371g;
    public final long h;
    public final long f53372i;
    public final long f53373j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f53355k = b1Var;
        f53356l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.m0.f14114a;
        f53357m = Integer.toString(0, 36);
        f53358n = Integer.toString(1, 36);
        f53359o = Integer.toString(2, 36);
        f53360p = Integer.toString(3, 36);
        f53361q = Integer.toString(4, 36);
        f53362r = Integer.toString(5, 36);
        f53363s = Integer.toString(6, 36);
        f53364t = Integer.toString(7, 36);
        f53365u = Integer.toString(8, 36);
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
        this.f53366a = b1Var;
        this.f53367b = z9;
        this.f53368c = j3;
        this.d = j10;
        this.f53369e = j11;
        this.f53370f = i7;
        this.f53371g = j12;
        this.h = j13;
        this.f53372i = j14;
        this.f53373j = j15;
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
        e2.b1 b10 = this.f53366a.b(z9, z10);
        int i7 = 0;
        if (z9 && this.f53367b) {
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
            j10 = this.f53369e;
        } else {
            j10 = 0;
        }
        if (z9) {
            i7 = this.f53370f;
        }
        if (z9) {
            j11 = this.f53371g;
        } else {
            j11 = 0;
        }
        if (z9) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z9) {
            j13 = this.f53372i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z9) {
            j14 = this.f53373j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z11, this.f53368c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f53366a;
        if (i7 < 3 || !f53355k.a(b1Var)) {
            bundle.putBundle(f53357m, b1Var.c(i7));
        }
        boolean z9 = this.f53367b;
        if (z9) {
            bundle.putBoolean(f53358n, z9);
        }
        long j3 = this.f53368c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f53359o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f53360p, j10);
        }
        long j11 = this.f53369e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f53361q, j11);
        }
        int i10 = this.f53370f;
        if (i10 != 0) {
            bundle.putInt(f53362r, i10);
        }
        long j12 = this.f53371g;
        if (j12 != 0) {
            bundle.putLong(f53363s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f53364t, j13);
        }
        long j14 = this.f53372i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f53365u, j14);
        }
        long j15 = this.f53373j;
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
            if (this.f53368c == l1Var.f53368c && this.f53366a.equals(l1Var.f53366a) && this.f53367b == l1Var.f53367b && this.d == l1Var.d && this.f53369e == l1Var.f53369e && this.f53370f == l1Var.f53370f && this.f53371g == l1Var.f53371g && this.h == l1Var.h && this.f53372i == l1Var.f53372i && this.f53373j == l1Var.f53373j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53366a, Boolean.valueOf(this.f53367b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f53366a;
        sb2.append(b1Var.f10189b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10191e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10192f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10193g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10194i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f53367b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f53368c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f53369e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f53370f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f53371g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f53372i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f53373j, "}");
    }
}
