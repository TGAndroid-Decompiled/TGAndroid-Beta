package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f46865a = new byte[8];
    public final ArrayDeque f46866b = new ArrayDeque();
    public final e f46867c = new e();
    public l.d d;
    public int f46868e;
    public int f46869f;
    public long f46870g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f46865a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
