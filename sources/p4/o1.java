package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53403i;
    public static final String f53404j;
    public static final String f53405k;
    public static final String f53406l;
    public static final String f53407m;
    public static final String f53408n;
    public static final String f53409o;
    public static final String f53410p;
    public static final String f53411q;
    public static final String f53412r;
    public final int f53413a;
    public final int f53414b;
    public final int f53415c;
    public final String d;
    public final String f53416e;
    public final IBinder f53417f;
    public final Bundle f53418g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53403i = Integer.toString(0, 36);
        f53404j = Integer.toString(1, 36);
        f53405k = Integer.toString(2, 36);
        f53406l = Integer.toString(3, 36);
        f53407m = Integer.toString(4, 36);
        f53408n = Integer.toString(5, 36);
        f53409o = Integer.toString(6, 36);
        f53410p = Integer.toString(7, 36);
        f53411q = Integer.toString(8, 36);
        f53412r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53413a = i7;
        this.f53414b = 1010001300;
        this.f53415c = 9;
        this.d = str;
        this.f53416e = "";
        this.f53417f = c1Var;
        this.f53418g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53413a == o1Var.f53413a && this.f53414b == o1Var.f53414b && this.f53415c == o1Var.f53415c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53416e, o1Var.f53416e) && Objects.equals(this.f53417f, o1Var.f53417f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53413a), 0, Integer.valueOf(this.f53414b), Integer.valueOf(this.f53415c), this.d, this.f53416e, null, this.f53417f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53414b + " interfaceVersion=" + this.f53415c + " service=" + this.f53416e + " IMediaSession=" + this.f53417f + " extras=" + this.f53418g + "}";
    }
}
