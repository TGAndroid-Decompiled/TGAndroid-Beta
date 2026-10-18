package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47544a = new byte[8];
    public final ArrayDeque f47545b = new ArrayDeque();
    public final h f47546c = new h();
    public c d;
    public int e;
    public int f47547f;
    public long f47548g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f47544a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
