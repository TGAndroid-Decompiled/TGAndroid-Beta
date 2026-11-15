package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class n1 {
    public static final String f54808b;
    public static final String f54809c;
    public final o1 f54810a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.f13471a;
        f54808b = Integer.toString(0, 36);
        f54809c = Integer.toString(1, 36);
    }

    public n1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        this.f54810a = new o1(i7, str, c1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f54810a.equals(((n1) obj).f54810a);
    }

    public final int hashCode() {
        return this.f54810a.hashCode();
    }

    public final String toString() {
        return this.f54810a.toString();
    }
}
