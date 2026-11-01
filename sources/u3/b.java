package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f50090a = new byte[8];
    public final ArrayDeque f50091b = new ArrayDeque();
    public final g f50092c = new g();
    public s9.g d;
    public int e;
    public int f50093f;
    public long f50094g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f50090a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
