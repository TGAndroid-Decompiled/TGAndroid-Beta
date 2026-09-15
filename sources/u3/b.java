package u3;

import c3.p;
import java.util.ArrayDeque;
import k2.c0;
public final class b {
    public final byte[] f43540a = new byte[8];
    public final ArrayDeque f43541b = new ArrayDeque();
    public final e f43542c = new e();
    public c0 d;
    public int e;
    public int f43543f;
    public long f43544g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f43540a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
