package u3;

import c3.p;
import java.util.ArrayDeque;
public final class b {
    public final byte[] f43795a = new byte[8];
    public final ArrayDeque f43796b = new ArrayDeque();
    public final e f43797c = new e();
    public ka.c d;
    public int e;
    public int f43798f;
    public long f43799g;

    public final long a(p pVar, int i10) {
        byte[] bArr = this.f43795a;
        pVar.readFully(bArr, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }
}
