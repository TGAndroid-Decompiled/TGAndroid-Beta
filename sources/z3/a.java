package z3;

import f9.i0;
import java.util.List;
public final class a {
    public final i0 f52639a;
    public final long f52640b;
    public final long f52641c;
    public final long d;

    public a(long j10, long j11, List list) {
        this.f52639a = i0.u(list);
        this.f52640b = j10;
        this.f52641c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.d = j12;
    }
}
