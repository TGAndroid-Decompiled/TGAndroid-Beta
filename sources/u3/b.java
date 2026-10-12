package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f46115a = new byte[8];
    public final ArrayDeque f46116b = new ArrayDeque();
    public final g f46117c = new g();
    public l2.f d;
    public int e;
    public int f46118f;
    public long f46119g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f46115a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
