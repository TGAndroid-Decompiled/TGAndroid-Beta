package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class q1 {
    public static final String f55407i;
    public static final String f55408j;
    public static final String f55409k;
    public static final String f55410l;
    public static final String f55411m;
    public static final String f55412n;
    public static final String f55413o;
    public static final String f55414p;
    public static final String f55415q;
    public static final String f55416r;
    public final int f55417a;
    public final int f55418b;
    public final int f55419c;
    public final String d;
    public final String f55420e;
    public final IBinder f55421f;
    public final Bundle f55422g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13778a;
        f55407i = Integer.toString(0, 36);
        f55408j = Integer.toString(1, 36);
        f55409k = Integer.toString(2, 36);
        f55410l = Integer.toString(3, 36);
        f55411m = Integer.toString(4, 36);
        f55412n = Integer.toString(5, 36);
        f55413o = Integer.toString(6, 36);
        f55414p = Integer.toString(7, 36);
        f55415q = Integer.toString(8, 36);
        f55416r = Integer.toString(9, 36);
    }

    public q1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f55417a = i7;
        this.f55418b = 1010001300;
        this.f55419c = 9;
        this.d = str;
        this.f55420e = "";
        this.f55421f = e1Var;
        this.f55422g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f55417a == q1Var.f55417a && this.f55418b == q1Var.f55418b && this.f55419c == q1Var.f55419c && TextUtils.equals(this.d, q1Var.d) && TextUtils.equals(this.f55420e, q1Var.f55420e) && Objects.equals(this.f55421f, q1Var.f55421f) && Objects.equals(this.h, q1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55417a), 0, Integer.valueOf(this.f55418b), Integer.valueOf(this.f55419c), this.d, this.f55420e, null, this.f55421f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f55418b + " interfaceVersion=" + this.f55419c + " service=" + this.f55420e + " IMediaSession=" + this.f55421f + " extras=" + this.f55422g + "}";
    }
}
