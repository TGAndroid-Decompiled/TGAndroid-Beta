package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class q1 {
    public static final String f55397i;
    public static final String f55398j;
    public static final String f55399k;
    public static final String f55400l;
    public static final String f55401m;
    public static final String f55402n;
    public static final String f55403o;
    public static final String f55404p;
    public static final String f55405q;
    public static final String f55406r;
    public final int f55407a;
    public final int f55408b;
    public final int f55409c;
    public final String d;
    public final String f55410e;
    public final IBinder f55411f;
    public final Bundle f55412g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13783a;
        f55397i = Integer.toString(0, 36);
        f55398j = Integer.toString(1, 36);
        f55399k = Integer.toString(2, 36);
        f55400l = Integer.toString(3, 36);
        f55401m = Integer.toString(4, 36);
        f55402n = Integer.toString(5, 36);
        f55403o = Integer.toString(6, 36);
        f55404p = Integer.toString(7, 36);
        f55405q = Integer.toString(8, 36);
        f55406r = Integer.toString(9, 36);
    }

    public q1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f55407a = i7;
        this.f55408b = 1010001300;
        this.f55409c = 9;
        this.d = str;
        this.f55410e = "";
        this.f55411f = e1Var;
        this.f55412g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f55407a == q1Var.f55407a && this.f55408b == q1Var.f55408b && this.f55409c == q1Var.f55409c && TextUtils.equals(this.d, q1Var.d) && TextUtils.equals(this.f55410e, q1Var.f55410e) && Objects.equals(this.f55411f, q1Var.f55411f) && Objects.equals(this.h, q1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55407a), 0, Integer.valueOf(this.f55408b), Integer.valueOf(this.f55409c), this.d, this.f55410e, null, this.f55411f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f55408b + " interfaceVersion=" + this.f55409c + " service=" + this.f55410e + " IMediaSession=" + this.f55411f + " extras=" + this.f55412g + "}";
    }
}
