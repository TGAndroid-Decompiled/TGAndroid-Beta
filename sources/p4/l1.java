package p4;

import a8.ia;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final e2.b1 f53226k;
    public static final l1 f53227l;
    public static final String f53228m;
    public static final String f53229n;
    public static final String f53230o;
    public static final String f53231p;
    public static final String f53232q;
    public static final String f53233r;
    public static final String f53234s;
    public static final String f53235t;
    public static final String f53236u;
    public static final String v;
    public final e2.b1 f53237a;
    public final boolean f53238b;
    public final long f53239c;
    public final long d;
    public final long f53240e;
    public final int f53241f;
    public final long f53242g;
    public final long h;
    public final long f53243i;
    public final long f53244j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f53226k = b1Var;
        f53227l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.m0.f14112a;
        f53228m = Integer.toString(0, 36);
        f53229n = Integer.toString(1, 36);
        f53230o = Integer.toString(2, 36);
        f53231p = Integer.toString(3, 36);
        f53232q = Integer.toString(4, 36);
        f53233r = Integer.toString(5, 36);
        f53234s = Integer.toString(6, 36);
        f53235t = Integer.toString(7, 36);
        f53236u = Integer.toString(8, 36);
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
        this.f53237a = b1Var;
        this.f53238b = z9;
        this.f53239c = j3;
        this.d = j10;
        this.f53240e = j11;
        this.f53241f = i7;
        this.f53242g = j12;
        this.h = j13;
        this.f53243i = j14;
        this.f53244j = j15;
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
        e2.b1 b10 = this.f53237a.b(z9, z10);
        int i7 = 0;
        if (z9 && this.f53238b) {
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
            j10 = this.f53240e;
        } else {
            j10 = 0;
        }
        if (z9) {
            i7 = this.f53241f;
        }
        if (z9) {
            j11 = this.f53242g;
        } else {
            j11 = 0;
        }
        if (z9) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z9) {
            j13 = this.f53243i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z9) {
            j14 = this.f53244j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z11, this.f53239c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f53237a;
        if (i7 < 3 || !f53226k.a(b1Var)) {
            bundle.putBundle(f53228m, b1Var.c(i7));
        }
        boolean z9 = this.f53238b;
        if (z9) {
            bundle.putBoolean(f53229n, z9);
        }
        long j3 = this.f53239c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f53230o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f53231p, j10);
        }
        long j11 = this.f53240e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f53232q, j11);
        }
        int i10 = this.f53241f;
        if (i10 != 0) {
            bundle.putInt(f53233r, i10);
        }
        long j12 = this.f53242g;
        if (j12 != 0) {
            bundle.putLong(f53234s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f53235t, j13);
        }
        long j14 = this.f53243i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f53236u, j14);
        }
        long j15 = this.f53244j;
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
            if (this.f53239c == l1Var.f53239c && this.f53237a.equals(l1Var.f53237a) && this.f53238b == l1Var.f53238b && this.d == l1Var.d && this.f53240e == l1Var.f53240e && this.f53241f == l1Var.f53241f && this.f53242g == l1Var.f53242g && this.h == l1Var.h && this.f53243i == l1Var.f53243i && this.f53244j == l1Var.f53244j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53237a, Boolean.valueOf(this.f53238b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f53237a;
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
        sb2.append(this.f53238b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f53239c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f53240e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f53241f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f53242g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f53243i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f53244j, "}");
    }
}
