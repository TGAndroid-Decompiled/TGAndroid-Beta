package q5;

import java.util.Arrays;
public final class p {
    public final long f44633a;

    public p(long j10) {
        this.f44633a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f44633a == ((p) obj).f44633a && b6.m.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44633a), 0, Boolean.FALSE, null});
    }
}
