package z3;

import e9.i0;
import java.util.List;
public final class a {
    public final i0 f53488a;
    public final long f53489b;
    public final long f53490c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f53488a = i0.v(list);
        this.f53489b = j3;
        this.f53490c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
