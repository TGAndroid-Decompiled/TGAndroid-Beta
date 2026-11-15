package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f55374b = new q(null);
    public final String f55375a;

    public q(String str) {
        this.f55375a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.k(this.f55375a, ((q) obj).f55375a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55375a});
    }
}
