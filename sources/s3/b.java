package s3;

import ab.e;
import f5.w;
import o3.h;
import o3.j;
import o3.k;
import o3.l;
import o3.m;
public final class b implements k {
    public final w f47557a = new w(4);
    public final w f47558b = new w(9);
    public final w f47559c = new w(11);
    public final w d = new w();
    public final c f47560e;
    public m f47561f;
    public int f47562g;
    public boolean h;
    public long f47563i;
    public int f47564j;
    public int f47565k;
    public int f47566l;
    public long f47567m;
    public boolean f47568n;
    public a f47569o;
    public d f47570p;

    public b() {
        ?? eVar = new e(new j());
        eVar.f47571b = -9223372036854775807L;
        eVar.f47572c = new long[0];
        eVar.d = new long[0];
        this.f47560e = eVar;
        this.f47562g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.f47566l;
        w wVar = this.d;
        byte[] bArr = wVar.f6640a;
        if (i10 > bArr.length) {
            wVar.A(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.C(0);
        }
        wVar.B(this.f47566l);
        lVar.readFully(wVar.f6640a, 0, this.f47566l);
        return wVar;
    }

    @Override
    public final int d(o3.l r32, o3.n r33) {
        throw new UnsupportedOperationException("Method not decompiled: s3.b.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        w wVar = this.f47557a;
        h hVar = (h) lVar;
        hVar.f(wVar.f6640a, 0, 3, false);
        wVar.C(0);
        if (wVar.t() == 4607062) {
            hVar.f(wVar.f6640a, 0, 2, false);
            wVar.C(0);
            if ((wVar.w() & 250) == 0) {
                hVar.f(wVar.f6640a, 0, 4, false);
                wVar.C(0);
                int e10 = wVar.e();
                hVar.f19097f = 0;
                hVar.b(e10, false);
                hVar.f(wVar.f6640a, 0, 4, false);
                wVar.C(0);
                if (wVar.e() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f47562g = 1;
            this.h = false;
        } else {
            this.f47562g = 3;
        }
        this.f47564j = 0;
    }

    @Override
    public final void i(m mVar) {
        this.f47561f = mVar;
    }

    @Override
    public final void release() {
    }
}
