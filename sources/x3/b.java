package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.pf;
public final class b {
    public final byte[] f60312a = new byte[8];
    public final ArrayDeque f60313b = new ArrayDeque();
    public final g f60314c = new g();
    public pf d;
    public int f60315e;
    public int f60316f;
    public long f60317g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f60312a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
