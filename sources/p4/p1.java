package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class p1 {
    public static final String f55434b;
    public static final String f55435c;
    public final q1 f55436a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.f13815a;
        f55434b = Integer.toString(0, 36);
        f55435c = Integer.toString(1, 36);
    }

    public p1(int i7, String str, e1 e1Var, Bundle bundle, MediaSession.Token token) {
        this.f55436a = new q1(i7, str, e1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        return this.f55436a.equals(((p1) obj).f55436a);
    }

    public final int hashCode() {
        return this.f55436a.hashCode();
    }

    public final String toString() {
        return this.f55436a.toString();
    }
}
