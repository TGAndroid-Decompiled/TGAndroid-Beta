package r3;

import o3.c;
import o3.e;
import o3.l;
import o3.n;
public final class a {
    public final o3.a f46920a;
    public final e f46921b;
    public o3.b f46922c;
    public final int d;

    public a(c cVar, e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f46921b = eVar;
        this.d = i10;
        this.f46920a = new o3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j10, n nVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        nVar.f19103a = j10;
        return 1;
    }

    public final int b(o3.l r27, o3.n r28) {
        throw new UnsupportedOperationException("Method not decompiled: r3.a.b(o3.l, o3.n):int");
    }

    public final void d(long j10) {
        o3.b bVar = this.f46922c;
        if (bVar != null && bVar.f19073a == j10) {
            return;
        }
        o3.a aVar = this.f46920a;
        this.f46922c = new o3.b(j10, aVar.f19068a.l(j10), aVar.f19070c, aVar.d, aVar.f19071e, aVar.f19072f);
    }
}
