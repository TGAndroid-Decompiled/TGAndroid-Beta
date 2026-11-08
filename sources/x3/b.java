package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.n;
public final class b {
    public final byte[] f58540a = new byte[8];
    public final ArrayDeque f58541b = new ArrayDeque();
    public final g f58542c = new g();
    public n d;
    public int f58543e;
    public int f58544f;
    public long f58545g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f58540a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
