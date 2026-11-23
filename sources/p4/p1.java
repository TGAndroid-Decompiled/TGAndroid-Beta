package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class p1 {
    public static final String f55399b;
    public static final String f55400c;
    public final q1 f55401a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.f13778a;
        f55399b = Integer.toString(0, 36);
        f55400c = Integer.toString(1, 36);
    }

    public p1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        this.f55401a = new q1(i7, str, e1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f55401a.equals(((p1) obj).f55401a);
    }

    public final int hashCode() {
        return this.f55401a.hashCode();
    }

    public final String toString() {
        return this.f55401a.toString();
    }
}
