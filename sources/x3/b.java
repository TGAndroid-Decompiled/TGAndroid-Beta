package x3;

import f3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f60430a = new byte[8];
    public final ArrayDeque f60431b = new ArrayDeque();
    public final g f60432c = new g();
    public v4.b d;
    public int f60433e;
    public int f60434f;
    public long f60435g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f60430a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
