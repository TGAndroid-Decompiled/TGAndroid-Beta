package u3;

import c3.p;
import java.util.ArrayDeque;
import m.g3;
public final class b {
    public final byte[] f42511a = new byte[8];
    public final ArrayDeque f42512b = new ArrayDeque();
    public final e f42513c = new e();
    public g3 d;
    public int e;
    public int f42514f;
    public long f42515g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f42511a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
