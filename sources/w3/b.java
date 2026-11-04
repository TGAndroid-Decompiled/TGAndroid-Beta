package w3;

import e3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.y00;
public final class b {
    public final byte[] f57297a = new byte[8];
    public final ArrayDeque f57298b = new ArrayDeque();
    public final g f57299c = new g();
    public y00 d;
    public int f57300e;
    public int f57301f;
    public long f57302g;

    public final long a(p pVar, int i3) {
        byte[] bArr = this.f57297a;
        pVar.readFully(bArr, 0, i3);
        long j10 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j10 = (j10 << 8) | (bArr[i10] & 255);
        }
        return j10;
    }
}
