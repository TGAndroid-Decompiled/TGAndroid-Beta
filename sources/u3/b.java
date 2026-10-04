package u3;

import c3.p;
import ii.n4;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47463a = new byte[8];
    public final ArrayDeque f47464b = new ArrayDeque();
    public final e f47465c = new e();
    public n4 d;
    public int f47466e;
    public int f47467f;
    public long f47468g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f47463a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
