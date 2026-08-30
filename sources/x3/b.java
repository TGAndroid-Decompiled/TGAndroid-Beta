package x3;

import java.util.ArrayDeque;
import org.telegram.ui.Components.qk0;
import r3.l;
public final class b {
    public final byte[] f46706a = new byte[8];
    public final ArrayDeque f46707b = new ArrayDeque();
    public final e f46708c = new e();
    public qk0 d;
    public int e;
    public int f46709f;
    public long f46710g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f46706a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
