package x3;

import java.util.ArrayDeque;
import org.telegram.ui.web.e0;
import r3.l;
public final class b {
    public final byte[] f50303a = new byte[8];
    public final ArrayDeque f50304b = new ArrayDeque();
    public final e f50305c = new e();
    public e0 d;
    public int f50306e;
    public int f50307f;
    public long f50308g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f50303a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
