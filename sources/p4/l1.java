package p4;

import a8.ja;
import android.os.Bundle;
import j$.util.Objects;
public final class l1 {
    public static final e2.b1 f54761k;
    public static final l1 f54762l;
    public static final String f54763m;
    public static final String f54764n;
    public static final String f54765o;
    public static final String f54766p;
    public static final String f54767q;
    public static final String f54768r;
    public static final String f54769s;
    public static final String f54770t;
    public static final String f54771u;
    public static final String v;
    public final e2.b1 f54772a;
    public final boolean f54773b;
    public final long f54774c;
    public final long d;
    public final long f54775e;
    public final int f54776f;
    public final long f54777g;
    public final long h;
    public final long f54778i;
    public final long f54779j;

    static {
        e2.b1 b1Var = new e2.b1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f54761k = b1Var;
        f54762l = new l1(b1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = h2.l0.f13471a;
        f54763m = Integer.toString(0, 36);
        f54764n = Integer.toString(1, 36);
        f54765o = Integer.toString(2, 36);
        f54766p = Integer.toString(3, 36);
        f54767q = Integer.toString(4, 36);
        f54768r = Integer.toString(5, 36);
        f54769s = Integer.toString(6, 36);
        f54770t = Integer.toString(7, 36);
        f54771u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public l1(e2.b1 b1Var, boolean z10, long j3, long j10, long j11, int i7, long j12, long j13, long j14, long j15) {
        boolean z11;
        if (b1Var.h != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.f(z10 == z11);
        this.f54772a = b1Var;
        this.f54773b = z10;
        this.f54774c = j3;
        this.d = j10;
        this.f54775e = j11;
        this.f54776f = i7;
        this.f54777g = j12;
        this.h = j13;
        this.f54778i = j14;
        this.f54779j = j15;
    }

    public final l1 a(boolean z10, boolean z11) {
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
        e2.b1 b10 = this.f54772a.b(z10, z11);
        int i7 = 0;
        if (z10 && this.f54773b) {
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
            j10 = this.f54775e;
        } else {
            j10 = 0;
        }
        if (z10) {
            i7 = this.f54776f;
        }
        if (z10) {
            j11 = this.f54777g;
        } else {
            j11 = 0;
        }
        if (z10) {
            j12 = this.h;
        } else {
            j12 = -9223372036854775807L;
        }
        if (z10) {
            j13 = this.f54778i;
        } else {
            j13 = -9223372036854775807L;
        }
        if (z10) {
            j14 = this.f54779j;
        } else {
            j14 = 0;
        }
        return new l1(b10, z12, this.f54774c, j3, j10, i7, j11, j12, j13, j14);
    }

    public final Bundle b(int i7) {
        Bundle bundle = new Bundle();
        e2.b1 b1Var = this.f54772a;
        if (i7 < 3 || !f54761k.a(b1Var)) {
            bundle.putBundle(f54763m, b1Var.c(i7));
        }
        boolean z10 = this.f54773b;
        if (z10) {
            bundle.putBoolean(f54764n, z10);
        }
        long j3 = this.f54774c;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(f54765o, j3);
        }
        long j10 = this.d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f54766p, j10);
        }
        long j11 = this.f54775e;
        if (i7 < 3 || j11 != 0) {
            bundle.putLong(f54767q, j11);
        }
        int i10 = this.f54776f;
        if (i10 != 0) {
            bundle.putInt(f54768r, i10);
        }
        long j12 = this.f54777g;
        if (j12 != 0) {
            bundle.putLong(f54769s, j12);
        }
        long j13 = this.h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f54770t, j13);
        }
        long j14 = this.f54778i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f54771u, j14);
        }
        long j15 = this.f54779j;
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
            if (this.f54774c == l1Var.f54774c && this.f54772a.equals(l1Var.f54772a) && this.f54773b == l1Var.f54773b && this.d == l1Var.d && this.f54775e == l1Var.f54775e && this.f54776f == l1Var.f54776f && this.f54777g == l1Var.f54777g && this.h == l1Var.h && this.f54778i == l1Var.f54778i && this.f54779j == l1Var.f54779j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54772a, Boolean.valueOf(this.f54773b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        e2.b1 b1Var = this.f54772a;
        sb2.append(b1Var.f10020b);
        sb2.append(", periodIndex=");
        sb2.append(b1Var.f10022e);
        sb2.append(", positionMs=");
        sb2.append(b1Var.f10023f);
        sb2.append(", contentPositionMs=");
        sb2.append(b1Var.f10024g);
        sb2.append(", adGroupIndex=");
        sb2.append(b1Var.h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(b1Var.f10025i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f54773b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f54774c);
        sb2.append(", durationMs=");
        sb2.append(this.d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f54775e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f54776f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f54777g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f54778i);
        sb2.append(", contentBufferedPositionMs=");
        return a8.p0.r(sb2, this.f54779j, "}");
    }
}
