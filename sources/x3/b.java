package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.qf;
public final class b {
    public final byte[] f60347a = new byte[8];
    public final ArrayDeque f60348b = new ArrayDeque();
    public final g f60349c = new g();
    public qf d;
    public int f60350e;
    public int f60351f;
    public long f60352g;

    public final long a(p pVar, int i7) {
        byte[] bArr = this.f60347a;
        pVar.readFully(bArr, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (bArr[i10] & 255);
        }
        return j3;
    }
}
