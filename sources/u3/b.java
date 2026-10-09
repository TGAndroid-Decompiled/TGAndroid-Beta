package u3;

import c3.p;
import java.util.ArrayDeque;
import l2.f;
public final class b {
    public final byte[] f48766a = new byte[8];
    public final ArrayDeque f48767b = new ArrayDeque();
    public final e f48768c = new e();
    public f d;
    public int f48769e;
    public int f48770f;
    public long f48771g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f48766a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
