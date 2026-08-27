package s3;

import java.util.ArrayDeque;
import m3.l;
import n2.b0;

public final class b {

    public final byte[] f47663a = new byte[8];

    public final ArrayDeque f47664b = new ArrayDeque();

    public final f f47665c = new f();
    public b0 d;

    public int f47666e;

    public int f47667f;

    public long f47668g;

    public final long a(l lVar, int i10) {
        byte[] bArr = this.f47663a;
        lVar.readFully(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }
}
