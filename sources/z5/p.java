package z5;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f50663b = new p(null);
    public final String f50664a;

    public p(String str) {
        this.f50664a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f50664a, ((p) obj).f50664a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50664a});
    }
}
