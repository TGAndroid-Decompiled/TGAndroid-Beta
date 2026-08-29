package u3;

import java.util.ArrayDeque;
import o3.l;
public final class b {
    public final byte[] f48963a = new byte[8];
    public final ArrayDeque f48964b = new ArrayDeque();
    public final f f48965c = new f();
    public o1.a d;
    public int f48966e;
    public int f48967f;
    public long f48968g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f48963a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
