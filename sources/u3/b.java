package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f46864a = new byte[8];
    public final ArrayDeque f46865b = new ArrayDeque();
    public final e f46866c = new e();
    public l.d d;
    public int f46867e;
    public int f46868f;
    public long f46869g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f46864a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
