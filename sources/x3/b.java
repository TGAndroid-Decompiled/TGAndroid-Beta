package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.of;
public final class b {
    public final byte[] f60301a = new byte[8];
    public final ArrayDeque f60302b = new ArrayDeque();
    public final g f60303c = new g();
    public of d;
    public int f60304e;
    public int f60305f;
    public long f60306g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f60301a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
