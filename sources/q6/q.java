package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f53833b = new q(null);
    public final String f53834a;

    public q(String str) {
        this.f53834a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.k(this.f53834a, ((q) obj).f53834a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53834a});
    }
}
