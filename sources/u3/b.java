package u3;

import c3.p;
import java.util.ArrayDeque;
import l2.g;
public final class b {
    public final byte[] f49004a = new byte[8];
    public final ArrayDeque f49005b = new ArrayDeque();
    public final e f49006c = new e();
    public g d;
    public int f49007e;
    public int f49008f;
    public long f49009g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f49004a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
