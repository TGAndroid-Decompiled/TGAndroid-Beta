package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class p1 {
    public static final String f55389b;
    public static final String f55390c;
    public final q1 f55391a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.f13786a;
        f55389b = Integer.toString(0, 36);
        f55390c = Integer.toString(1, 36);
    }

    public p1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        this.f55391a = new q1(i7, str, e1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f55391a.equals(((p1) obj).f55391a);
    }

    public final int hashCode() {
        return this.f55391a.hashCode();
    }

    public final String toString() {
        return this.f55391a.toString();
    }
}
