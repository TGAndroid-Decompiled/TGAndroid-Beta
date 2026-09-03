package x3;

import java.util.ArrayDeque;
import r3.l;
public final class b {
    public final byte[] f46775a = new byte[8];
    public final ArrayDeque f46776b = new ArrayDeque();
    public final e f46777c = new e();
    public o3.c d;
    public int e;
    public int f46778f;
    public long f46779g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f46775a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
