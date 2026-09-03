package v3;

import cb.e;
import h5.w;
import r3.h;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public final w f48892a = new w(4);
    public final w f48893b = new w(9);
    public final w f48894c = new w(11);
    public final w d = new w();
    public final c f48895e;
    public m f48896f;
    public int f48897g;
    public boolean h;
    public long f48898i;
    public int f48899j;
    public int f48900k;
    public int f48901l;
    public long f48902m;
    public boolean f48903n;
    public a f48904o;
    public d f48905p;

    public b() {
        ?? eVar = new e(new j());
        eVar.f48906b = -9223372036854775807L;
        eVar.f48907c = new long[0];
        eVar.d = new long[0];
        this.f48895e = eVar;
        this.f48897g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.f48901l;
        w wVar = this.d;
        byte[] bArr = wVar.f7308a;
        if (i10 > bArr.length) {
            wVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.F(0);
        }
        wVar.E(this.f48901l);
        lVar.readFully(wVar.f7308a, 0, this.f48901l);
        return wVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f48897g = 1;
            this.h = false;
        } else {
            this.f48897g = 3;
        }
        this.f48899j = 0;
    }

    @Override
    public final void e(m mVar) {
        this.f48896f = mVar;
    }

    @Override
    public final int h(r3.l r32, org.telegram.ui.Components.jb r33) {
        throw new UnsupportedOperationException("Method not decompiled: v3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f48892a;
        h hVar = (h) lVar;
        hVar.f(wVar.f7308a, 0, 3, false);
        wVar.F(0);
        if (wVar.w() == 4607062) {
            hVar.f(wVar.f7308a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & 250) == 0) {
                hVar.f(wVar.f7308a, 0, 4, false);
                wVar.F(0);
                int g10 = wVar.g();
                hVar.f46589f = 0;
                hVar.a(g10, false);
                hVar.f(wVar.f7308a, 0, 4, false);
                wVar.F(0);
                if (wVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
