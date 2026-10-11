package z3;

import e9.i0;
import java.util.List;
public final class a {
    public final i0 f53575a;
    public final long f53576b;
    public final long f53577c;
    public final long d;

    public a(long j3, long j10, List list) {
        this.f53575a = i0.v(list);
        this.f53576b = j3;
        this.f53577c = j10;
        long j11 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j3 + j10;
        }
        this.d = j11;
    }
}
