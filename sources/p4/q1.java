package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
public final class q1 {
    public static final String f55442i;
    public static final String f55443j;
    public static final String f55444k;
    public static final String f55445l;
    public static final String f55446m;
    public static final String f55447n;
    public static final String f55448o;
    public static final String f55449p;
    public static final String f55450q;
    public static final String f55451r;
    public final int f55452a;
    public final int f55453b;
    public final int f55454c;
    public final String d;
    public final String f55455e;
    public final IBinder f55456f;
    public final Bundle f55457g;
    public final MediaSession.Token h;

    static {
        String str = h2.l0.f13815a;
        f55442i = Integer.toString(0, 36);
        f55443j = Integer.toString(1, 36);
        f55444k = Integer.toString(2, 36);
        f55445l = Integer.toString(3, 36);
        f55446m = Integer.toString(4, 36);
        f55447n = Integer.toString(5, 36);
        f55448o = Integer.toString(6, 36);
        f55449p = Integer.toString(7, 36);
        f55450q = Integer.toString(8, 36);
        f55451r = Integer.toString(9, 36);
    }

    public q1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.f55452a = i7;
        this.f55453b = 1010001300;
        this.f55454c = 9;
        this.d = str;
        this.f55455e = "";
        this.f55456f = e1Var;
        this.f55457g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f55452a == q1Var.f55452a && this.f55453b == q1Var.f55453b && this.f55454c == q1Var.f55454c && TextUtils.equals(this.d, q1Var.d) && TextUtils.equals(this.f55455e, q1Var.f55455e) && Objects.equals(this.f55456f, q1Var.f55456f) && Objects.equals(this.h, q1Var.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55452a), 0, Integer.valueOf(this.f55453b), Integer.valueOf(this.f55454c), this.d, this.f55455e, null, this.f55456f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.f55453b + " interfaceVersion=" + this.f55454c + " service=" + this.f55455e + " IMediaSession=" + this.f55456f + " extras=" + this.f55457g + "}";
    }
}
