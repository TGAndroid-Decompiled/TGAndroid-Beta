package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f55993b = new q(null);
    public final String f55994a;

    public q(String str) {
        this.f55994a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f55994a, ((q) obj).f55994a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55994a});
    }
}
