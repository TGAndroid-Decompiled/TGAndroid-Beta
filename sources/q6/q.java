package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f56071b = new q(null);
    public final String f56072a;

    public q(String str) {
        this.f56072a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f56072a, ((q) obj).f56072a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56072a});
    }
}
