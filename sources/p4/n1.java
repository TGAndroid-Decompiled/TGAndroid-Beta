package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class n1 {
    public static final String f53273b;
    public static final String f53274c;
    public final o1 f53275a;

    static {
        e2.m0.a("media3.session");
        String str = h2.m0.f14112a;
        f53273b = Integer.toString(0, 36);
        f53274c = Integer.toString(1, 36);
    }

    public n1(int i7, String str, c1 c1Var, Bundle bundle, MediaSession.Token token) {
        this.f53275a = new o1(i7, str, c1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f53275a.equals(((n1) obj).f53275a);
    }

    public final int hashCode() {
        return this.f53275a.hashCode();
    }

    public final String toString() {
        return this.f53275a.toString();
    }
}
