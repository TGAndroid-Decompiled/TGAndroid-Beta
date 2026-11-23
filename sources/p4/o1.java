package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
public final class o1 {
    public static final String f55513b;
    public static final String f55514c;
    public final p1 f55515a;

    static {
        e2.m0.a("media3.session");
        String str = h2.l0.f13778a;
        f55513b = Integer.toString(0, 36);
        f55514c = Integer.toString(1, 36);
    }

    public o1(int i7, String str, d1 d1Var, Bundle bundle, MediaSession.Token token) {
        this.f55515a = new p1(i7, str, d1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        return this.f55515a.equals(((o1) obj).f55515a);
    }

    public final int hashCode() {
        return this.f55515a.hashCode();
    }

    public final String toString() {
        return this.f55515a.toString();
    }
}
