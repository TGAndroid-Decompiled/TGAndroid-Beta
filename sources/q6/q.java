package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f53832b = new q(null);
    public final String f53833a;

    public q(String str) {
        this.f53833a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.k(this.f53833a, ((q) obj).f53833a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53833a});
    }
}
