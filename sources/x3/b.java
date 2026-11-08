package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.n;
public final class b {
    public final byte[] f58541a = new byte[8];
    public final ArrayDeque f58542b = new ArrayDeque();
    public final g f58543c = new g();
    public n d;
    public int f58544e;
    public int f58545f;
    public long f58546g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f58541a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
