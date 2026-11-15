package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.ff;
public final class b {
    public final byte[] f59731a = new byte[8];
    public final ArrayDeque f59732b = new ArrayDeque();
    public final g f59733c = new g();
    public ff d;
    public int f59734e;
    public int f59735f;
    public long f59736g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f59731a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
