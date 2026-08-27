package y5;

import java.util.Arrays;

public final class p implements com.google.android.gms.common.api.b {

    public static final p f49680b = new p(null);

    public final String f49681a;

    public p(String str) {
        this.f49681a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return l.l(this.f49681a, ((p) obj).f49681a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49681a});
    }
}
