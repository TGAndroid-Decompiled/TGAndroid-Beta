package p3;

import m3.c;
import m3.e;
import m3.l;
import m3.n;
public final class a {
    public final m3.a f45339a;
    public final e f45340b;
    public m3.b f45341c;
    public final int d;

    public a(c cVar, e eVar, long j10, long j11, long j12, long j13, long j14, int i9) {
        this.f45340b = eVar;
        this.d = i9;
        this.f45339a = new m3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i9, byte[] bArr) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j10, n nVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        nVar.f17244a = j10;
        return 1;
    }

    public final int b(m3.l r27, m3.n r28) {
        throw new UnsupportedOperationException("Method not decompiled: p3.a.b(m3.l, m3.n):int");
    }

    public final void d(long j10) {
        m3.b bVar = this.f45341c;
        if (bVar != null && bVar.f17214a == j10) {
            return;
        }
        m3.a aVar = this.f45339a;
        this.f45341c = new m3.b(j10, aVar.f17209a.c(j10), aVar.f17211c, aVar.d, aVar.f17212e, aVar.f17213f);
    }
}
