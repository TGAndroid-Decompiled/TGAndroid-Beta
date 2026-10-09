package u3;

import c3.p;
import java.util.ArrayDeque;
import l2.f;
public final class b {
    public final byte[] f48768a = new byte[8];
    public final ArrayDeque f48769b = new ArrayDeque();
    public final e f48770c = new e();
    public f d;
    public int f48771e;
    public int f48772f;
    public long f48773g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f48768a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
