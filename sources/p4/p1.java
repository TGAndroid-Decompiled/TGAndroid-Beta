package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class p1 {
    public static final String f55519i;
    public static final String f55520j;
    public static final String f55521k;
    public static final String f55522l;
    public static final String f55523m;
    public static final String f55524n;
    public static final String f55525o;
    public static final String f55526p;
    public static final String f55527q;
    public static final String f55528r;
    public final int f55529a;
    public final int f55530b;
    public final int f55531c;
    public final String d;
    public final String f55532e;
    public final IBinder f55533f;
    public final Bundle f55534g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13778a;
        f55519i = Integer.toString(0, 36);
        f55520j = Integer.toString(1, 36);
        f55521k = Integer.toString(2, 36);
        f55522l = Integer.toString(3, 36);
        f55523m = Integer.toString(4, 36);
        f55524n = Integer.toString(5, 36);
        f55525o = Integer.toString(6, 36);
        f55526p = Integer.toString(7, 36);
        f55527q = Integer.toString(8, 36);
        f55528r = Integer.toString(9, 36);
    }

    public p1(int i7, String str, d1 d1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f55529a = i7;
        this.f55530b = 1010001300;
        this.f55531c = 9;
        this.d = str;
        this.f55532e = "";
        this.f55533f = d1Var;
        this.f55534g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            if (this.f55529a == p1Var.f55529a && this.f55530b == p1Var.f55530b && this.f55531c == p1Var.f55531c && TextUtils.equals(this.d, p1Var.d) && TextUtils.equals(this.f55532e, p1Var.f55532e) && Objects.equals(this.f55533f, p1Var.f55533f) && Objects.equals(this.h, p1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55529a), 0, Integer.valueOf(this.f55530b), Integer.valueOf(this.f55531c), this.d, this.f55532e, null, this.f55533f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f55530b + " interfaceVersion=" + this.f55531c + " service=" + this.f55532e + " IMediaSession=" + this.f55533f + " extras=" + this.f55534g + "}";
    }
}
