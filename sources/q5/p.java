package q5;

import java.util.Arrays;
public final class p {
    public final long f44602a;

    public p(long j10) {
        this.f44602a = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p) && this.f44602a == ((p) obj).f44602a && b6.m.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44602a), 0, Boolean.FALSE, null});
    }
}
