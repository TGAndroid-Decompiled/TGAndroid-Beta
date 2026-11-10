package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.m;
public final class b {
    public final byte[] f58548a = new byte[8];
    public final ArrayDeque f58549b = new ArrayDeque();
    public final g f58550c = new g();
    public m d;
    public int f58551e;
    public int f58552f;
    public long f58553g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f58548a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
