package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f54820i;
    public static final String f54821j;
    public static final String f54822k;
    public static final String f54823l;
    public static final String f54824m;
    public static final String f54825n;
    public static final String f54826o;
    public static final String f54827p;
    public static final String f54828q;
    public static final String f54829r;
    public final int f54830a;
    public final int f54831b;
    public final int f54832c;
    public final String d;
    public final String f54833e;
    public final IBinder f54834f;
    public final Bundle f54835g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13471a;
        f54820i = Integer.toString(0, 36);
        f54821j = Integer.toString(1, 36);
        f54822k = Integer.toString(2, 36);
        f54823l = Integer.toString(3, 36);
        f54824m = Integer.toString(4, 36);
        f54825n = Integer.toString(5, 36);
        f54826o = Integer.toString(6, 36);
        f54827p = Integer.toString(7, 36);
        f54828q = Integer.toString(8, 36);
        f54829r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f54830a = i7;
        this.f54831b = 1010001300;
        this.f54832c = 9;
        this.d = str;
        this.f54833e = "";
        this.f54834f = c1Var;
        this.f54835g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f54830a == o1Var.f54830a && this.f54831b == o1Var.f54831b && this.f54832c == o1Var.f54832c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f54833e, o1Var.f54833e) && Objects.equals(this.f54834f, o1Var.f54834f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f54830a), 0, Integer.valueOf(this.f54831b), Integer.valueOf(this.f54832c), this.d, this.f54833e, null, this.f54834f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f54831b + " interfaceVersion=" + this.f54832c + " service=" + this.f54833e + " IMediaSession=" + this.f54834f + " extras=" + this.f54835g + "}";
    }
}
