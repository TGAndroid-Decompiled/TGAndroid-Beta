package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53414i;
    public static final String f53415j;
    public static final String f53416k;
    public static final String f53417l;
    public static final String f53418m;
    public static final String f53419n;
    public static final String f53420o;
    public static final String f53421p;
    public static final String f53422q;
    public static final String f53423r;
    public final int f53424a;
    public final int f53425b;
    public final int f53426c;
    public final String d;
    public final String f53427e;
    public final IBinder f53428f;
    public final Bundle f53429g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14114a;
        f53414i = Integer.toString(0, 36);
        f53415j = Integer.toString(1, 36);
        f53416k = Integer.toString(2, 36);
        f53417l = Integer.toString(3, 36);
        f53418m = Integer.toString(4, 36);
        f53419n = Integer.toString(5, 36);
        f53420o = Integer.toString(6, 36);
        f53421p = Integer.toString(7, 36);
        f53422q = Integer.toString(8, 36);
        f53423r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53424a = i7;
        this.f53425b = 1010001300;
        this.f53426c = 9;
        this.d = str;
        this.f53427e = "";
        this.f53428f = c1Var;
        this.f53429g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53424a == o1Var.f53424a && this.f53425b == o1Var.f53425b && this.f53426c == o1Var.f53426c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53427e, o1Var.f53427e) && Objects.equals(this.f53428f, o1Var.f53428f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53424a), 0, Integer.valueOf(this.f53425b), Integer.valueOf(this.f53426c), this.d, this.f53427e, null, this.f53428f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53425b + " interfaceVersion=" + this.f53426c + " service=" + this.f53427e + " IMediaSession=" + this.f53428f + " extras=" + this.f53429g + "}";
    }
}
