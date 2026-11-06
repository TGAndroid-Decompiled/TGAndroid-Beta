package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class o1 {
    public static final String f53309i;
    public static final String f53310j;
    public static final String f53311k;
    public static final String f53312l;
    public static final String f53313m;
    public static final String f53314n;
    public static final String f53315o;
    public static final String f53316p;
    public static final String f53317q;
    public static final String f53318r;
    public final int f53319a;
    public final int f53320b;
    public final int f53321c;
    public final String d;
    public final String f53322e;
    public final IBinder f53323f;
    public final Bundle f53324g;
    public final MediaSession.Token h;

    static {
        String str = h2.m0.f14112a;
        f53309i = Integer.toString(0, 36);
        f53310j = Integer.toString(1, 36);
        f53311k = Integer.toString(2, 36);
        f53312l = Integer.toString(3, 36);
        f53313m = Integer.toString(4, 36);
        f53314n = Integer.toString(5, 36);
        f53315o = Integer.toString(6, 36);
        f53316p = Integer.toString(7, 36);
        f53317q = Integer.toString(8, 36);
        f53318r = Integer.toString(9, 36);
    }

    public o1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f53319a = i7;
        this.f53320b = 1010001300;
        this.f53321c = 9;
        this.d = str;
        this.f53322e = "";
        this.f53323f = c1Var;
        this.f53324g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (this.f53319a == o1Var.f53319a && this.f53320b == o1Var.f53320b && this.f53321c == o1Var.f53321c && TextUtils.equals(this.d, o1Var.d) && TextUtils.equals(this.f53322e, o1Var.f53322e) && Objects.equals(this.f53323f, o1Var.f53323f) && Objects.equals(this.h, o1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f53319a), 0, Integer.valueOf(this.f53320b), Integer.valueOf(this.f53321c), this.d, this.f53322e, null, this.f53323f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f53320b + " interfaceVersion=" + this.f53321c + " service=" + this.f53322e + " IMediaSession=" + this.f53323f + " extras=" + this.f53324g + "}";
    }
}
