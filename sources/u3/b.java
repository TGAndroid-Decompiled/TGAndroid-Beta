package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47499a = new byte[8];
    public final ArrayDeque f47500b = new ArrayDeque();
    public final g f47501c = new g();
    public l2.f d;
    public int e;
    public int f47502f;
    public long f47503g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f47499a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
