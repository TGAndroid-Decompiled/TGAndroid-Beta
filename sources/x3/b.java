package x3;

import java.util.ArrayDeque;
import org.telegram.ui.web.e0;
import r3.l;
public final class b {
    public final byte[] f50302a = new byte[8];
    public final ArrayDeque f50303b = new ArrayDeque();
    public final e f50304c = new e();
    public e0 d;
    public int f50305e;
    public int f50306f;
    public long f50307g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f50302a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
