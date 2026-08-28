package x5;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f48963b = new p(null);
    public final String f48964a;

    public p(String str) {
        this.f48964a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f48964a, ((p) obj).f48964a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48964a});
    }
}
