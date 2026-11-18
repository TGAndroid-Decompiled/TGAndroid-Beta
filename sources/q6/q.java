package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f55948b = new q(null);
    public final String f55949a;

    public q(String str) {
        this.f55949a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f55949a, ((q) obj).f55949a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55949a});
    }
}
