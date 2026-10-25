package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f49494a = new byte[8];
    public final ArrayDeque f49495b = new ArrayDeque();
    public final g f49496c = new g();
    public t6.f d;
    public int e;
    public int f49497f;
    public long f49498g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f49494a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
