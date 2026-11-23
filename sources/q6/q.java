package q6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f55958b = new q(null);
    public final String f55959a;

    public q(String str) {
        this.f55959a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f55959a, ((q) obj).f55959a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55959a});
    }
}
