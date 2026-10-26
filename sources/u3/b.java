package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f49497a = new byte[8];
    public final ArrayDeque f49498b = new ArrayDeque();
    public final g f49499c = new g();
    public t6.f d;
    public int e;
    public int f49500f;
    public long f49501g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f49497a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
