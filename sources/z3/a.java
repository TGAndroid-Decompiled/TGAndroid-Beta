package z3;

import f9.i0;
import java.util.List;
public final class a {
    public final i0 f52700a;
    public final long f52701b;
    public final long f52702c;
    public final long d;

    public a(long j10, long j11, List list) {
        this.f52700a = i0.u(list);
        this.f52701b = j10;
        this.f52702c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.d = j12;
    }
}
