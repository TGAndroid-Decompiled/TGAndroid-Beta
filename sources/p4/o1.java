package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53311i;
    public static final String f53312j;
    public static final String f53313k;
    public static final String f53314l;
    public static final String f53315m;
    public static final String f53316n;
    public static final String f53317o;
    public static final String f53318p;
    public static final String f53319q;
    public static final String f53320r;
    public final int f53321a;
    public final int f53322b;
    public final int f53323c;
    public final String d;
    public final String f53324e;
    public final IBinder f53325f;
    public final Bundle f53326g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53311i = Integer.toString(0, 36);
        f53312j = Integer.toString(1, 36);
        f53313k = Integer.toString(2, 36);
        f53314l = Integer.toString(3, 36);
        f53315m = Integer.toString(4, 36);
        f53316n = Integer.toString(5, 36);
        f53317o = Integer.toString(6, 36);
        f53318p = Integer.toString(7, 36);
        f53319q = Integer.toString(8, 36);
        f53320r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53321a = i7;
        this.f53322b = 1010001300;
        this.f53323c = 9;
        this.d = str;
        this.f53324e = "";
        this.f53325f = c1Var;
        this.f53326g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53321a == o1Var.f53321a && this.f53322b == o1Var.f53322b && this.f53323c == o1Var.f53323c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53324e, o1Var.f53324e) && Objects.equals(this.f53325f, o1Var.f53325f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53321a), 0, Integer.valueOf(this.f53322b), Integer.valueOf(this.f53323c), this.d, this.f53324e, null, this.f53325f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53322b + " interfaceVersion=" + this.f53323c + " service=" + this.f53324e + " IMediaSession=" + this.f53325f + " extras=" + this.f53326g + "}";
    }
}
