package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53285i;
    public static final String f53286j;
    public static final String f53287k;
    public static final String f53288l;
    public static final String f53289m;
    public static final String f53290n;
    public static final String f53291o;
    public static final String f53292p;
    public static final String f53293q;
    public static final String f53294r;
    public final int f53295a;
    public final int f53296b;
    public final int f53297c;
    public final String d;
    public final String f53298e;
    public final IBinder f53299f;
    public final Bundle f53300g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53285i = Integer.toString(0, 36);
        f53286j = Integer.toString(1, 36);
        f53287k = Integer.toString(2, 36);
        f53288l = Integer.toString(3, 36);
        f53289m = Integer.toString(4, 36);
        f53290n = Integer.toString(5, 36);
        f53291o = Integer.toString(6, 36);
        f53292p = Integer.toString(7, 36);
        f53293q = Integer.toString(8, 36);
        f53294r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53295a = i7;
        this.f53296b = 1010001300;
        this.f53297c = 9;
        this.d = str;
        this.f53298e = "";
        this.f53299f = c1Var;
        this.f53300g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53295a == o1Var.f53295a && this.f53296b == o1Var.f53296b && this.f53297c == o1Var.f53297c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53298e, o1Var.f53298e) && Objects.equals(this.f53299f, o1Var.f53299f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53295a), 0, Integer.valueOf(this.f53296b), Integer.valueOf(this.f53297c), this.d, this.f53298e, null, this.f53299f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53296b + " interfaceVersion=" + this.f53297c + " service=" + this.f53298e + " IMediaSession=" + this.f53299f + " extras=" + this.f53300g + "}";
    }
}
