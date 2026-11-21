package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class q1 {
    public static final String f55438i;
    public static final String f55439j;
    public static final String f55440k;
    public static final String f55441l;
    public static final String f55442m;
    public static final String f55443n;
    public static final String f55444o;
    public static final String f55445p;
    public static final String f55446q;
    public static final String f55447r;
    public final int f55448a;
    public final int f55449b;
    public final int f55450c;
    public final String d;
    public final String f55451e;
    public final IBinder f55452f;
    public final Bundle f55453g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13812a;
        f55438i = Integer.toString(0, 36);
        f55439j = Integer.toString(1, 36);
        f55440k = Integer.toString(2, 36);
        f55441l = Integer.toString(3, 36);
        f55442m = Integer.toString(4, 36);
        f55443n = Integer.toString(5, 36);
        f55444o = Integer.toString(6, 36);
        f55445p = Integer.toString(7, 36);
        f55446q = Integer.toString(8, 36);
        f55447r = Integer.toString(9, 36);
    }

    public q1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f55448a = i7;
        this.f55449b = 1010001300;
        this.f55450c = 9;
        this.d = str;
        this.f55451e = "";
        this.f55452f = e1Var;
        this.f55453g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f55448a == q1Var.f55448a && this.f55449b == q1Var.f55449b && this.f55450c == q1Var.f55450c && TextUtils.equals(this.d, q1Var.d) && TextUtils.equals(this.f55451e, q1Var.f55451e) && Objects.equals(this.f55452f, q1Var.f55452f) && Objects.equals(this.h, q1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55448a), 0, Integer.valueOf(this.f55449b), Integer.valueOf(this.f55450c), this.d, this.f55451e, null, this.f55452f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f55449b + " interfaceVersion=" + this.f55450c + " service=" + this.f55451e + " IMediaSession=" + this.f55452f + " extras=" + this.f55453g + "}";
    }
}
