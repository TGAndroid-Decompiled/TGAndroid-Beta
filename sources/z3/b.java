package z3;

import e9.i0;
import java.util.List;
public final class b {
    public final i0 f48073a;
    public final long f48074b;
    public final long f48075c;
    public final long d;

    public b(long j3, long j10, List list) {
        this.f48073a = i0.v(list);
        this.f48074b = j3;
        this.f48075c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
