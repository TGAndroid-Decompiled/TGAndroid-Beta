package u3;

import c3.p;
import java.util.ArrayDeque;
import l2.g;
public final class b {
    public final byte[] f48996a = new byte[8];
    public final ArrayDeque f48997b = new ArrayDeque();
    public final e f48998c = new e();
    public g d;
    public int f48999e;
    public int f49000f;
    public long f49001g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f48996a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
