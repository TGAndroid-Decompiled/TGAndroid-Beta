package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f47522a = new byte[8];
    public final ArrayDeque f47523b = new ArrayDeque();
    public final h f47524c = new h();
    public c d;
    public int e;
    public int f47525f;
    public long f47526g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f47522a;
        pVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
