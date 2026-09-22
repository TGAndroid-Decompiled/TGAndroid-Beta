package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f43863a = new byte[8];
    public final ArrayDeque f43864b = new ArrayDeque();
    public final e f43865c = new e();
    public o0.b d;
    public int e;
    public int f43866f;
    public long f43867g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f43863a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
