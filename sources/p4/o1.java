package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53402i;
    public static final String f53403j;
    public static final String f53404k;
    public static final String f53405l;
    public static final String f53406m;
    public static final String f53407n;
    public static final String f53408o;
    public static final String f53409p;
    public static final String f53410q;
    public static final String f53411r;
    public final int f53412a;
    public final int f53413b;
    public final int f53414c;
    public final String d;
    public final String f53415e;
    public final IBinder f53416f;
    public final Bundle f53417g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53402i = Integer.toString(0, 36);
        f53403j = Integer.toString(1, 36);
        f53404k = Integer.toString(2, 36);
        f53405l = Integer.toString(3, 36);
        f53406m = Integer.toString(4, 36);
        f53407n = Integer.toString(5, 36);
        f53408o = Integer.toString(6, 36);
        f53409p = Integer.toString(7, 36);
        f53410q = Integer.toString(8, 36);
        f53411r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53412a = i7;
        this.f53413b = 1010001300;
        this.f53414c = 9;
        this.d = str;
        this.f53415e = "";
        this.f53416f = c1Var;
        this.f53417g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53412a == o1Var.f53412a && this.f53413b == o1Var.f53413b && this.f53414c == o1Var.f53414c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53415e, o1Var.f53415e) && Objects.equals(this.f53416f, o1Var.f53416f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53412a), 0, Integer.valueOf(this.f53413b), Integer.valueOf(this.f53414c), this.d, this.f53415e, null, this.f53416f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53413b + " interfaceVersion=" + this.f53414c + " service=" + this.f53415e + " IMediaSession=" + this.f53416f + " extras=" + this.f53417g + "}";
    }
}
