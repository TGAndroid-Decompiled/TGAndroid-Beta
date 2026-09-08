package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f46892a = new byte[8];
    public final ArrayDeque f46893b = new ArrayDeque();
    public final e f46894c = new e();
    public l.d d;
    public int f46895e;
    public int f46896f;
    public long f46897g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f46892a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
