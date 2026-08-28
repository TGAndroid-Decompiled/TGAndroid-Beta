package s3;

import java.util.ArrayDeque;
import m3.l;
import n2.p;
public final class b {
    public final byte[] f47299a = new byte[8];
    public final ArrayDeque f47300b = new ArrayDeque();
    public final e f47301c = new e();
    public p d;
    public int f47302e;
    public int f47303f;
    public long f47304g;

    public final long a(l lVar, int i9) {
        byte[] bArr = this.f47299a;
        lVar.readFully(bArr, 0, i9);
        long j10 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }
}
