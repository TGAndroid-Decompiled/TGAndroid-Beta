package u3;

import c3.p;
import ii.n4;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47470a = new byte[8];
    public final ArrayDeque f47471b = new ArrayDeque();
    public final e f47472c = new e();
    public n4 d;
    public int f47473e;
    public int f47474f;
    public long f47475g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f47470a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
