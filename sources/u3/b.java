package u3;

import c3.r;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47953a = new byte[8];
    public final ArrayDeque f47954b = new ArrayDeque();
    public final g f47955c = new g();
    public l2.f d;
    public int e;
    public int f47956f;
    public long f47957g;

    public final long a(r rVar, int i10) {
        byte[] bArr = this.f47953a;
        rVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
