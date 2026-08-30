package q5;

import java.util.Arrays;
public final class p {
    public final long f42845a;

    public p(long j10) {
        this.f42845a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f42845a == ((p) obj).f42845a && b6.m.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f42845a), 0, Boolean.FALSE, null});
    }
}
