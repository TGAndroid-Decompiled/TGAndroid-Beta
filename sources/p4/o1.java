package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53415i;
    public static final String f53416j;
    public static final String f53417k;
    public static final String f53418l;
    public static final String f53419m;
    public static final String f53420n;
    public static final String f53421o;
    public static final String f53422p;
    public static final String f53423q;
    public static final String f53424r;
    public final int f53425a;
    public final int f53426b;
    public final int f53427c;
    public final String d;
    public final String f53428e;
    public final IBinder f53429f;
    public final Bundle f53430g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53415i = Integer.toString(0, 36);
        f53416j = Integer.toString(1, 36);
        f53417k = Integer.toString(2, 36);
        f53418l = Integer.toString(3, 36);
        f53419m = Integer.toString(4, 36);
        f53420n = Integer.toString(5, 36);
        f53421o = Integer.toString(6, 36);
        f53422p = Integer.toString(7, 36);
        f53423q = Integer.toString(8, 36);
        f53424r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53425a = i7;
        this.f53426b = 1010001300;
        this.f53427c = 9;
        this.d = str;
        this.f53428e = "";
        this.f53429f = c1Var;
        this.f53430g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53425a == o1Var.f53425a && this.f53426b == o1Var.f53426b && this.f53427c == o1Var.f53427c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53428e, o1Var.f53428e) && Objects.equals(this.f53429f, o1Var.f53429f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53425a), 0, Integer.valueOf(this.f53426b), Integer.valueOf(this.f53427c), this.d, this.f53428e, null, this.f53429f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53426b + " interfaceVersion=" + this.f53427c + " service=" + this.f53428e + " IMediaSession=" + this.f53429f + " extras=" + this.f53430g + "}";
    }
}
