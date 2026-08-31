package v3;

import cb.e;
import h5.w;
import r3.h;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public final w f48856a = new w(4);
    public final w f48857b = new w(9);
    public final w f48858c = new w(11);
    public final w d = new w();
    public final c f48859e;
    public m f48860f;
    public int f48861g;
    public boolean h;
    public long f48862i;
    public int f48863j;
    public int f48864k;
    public int f48865l;
    public long f48866m;
    public boolean f48867n;
    public a f48868o;
    public d f48869p;

    public b() {
        ?? eVar = new e(new j());
        eVar.f48870b = -9223372036854775807L;
        eVar.f48871c = new long[0];
        eVar.d = new long[0];
        this.f48859e = eVar;
        this.f48861g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.f48865l;
        w wVar = this.d;
        byte[] bArr = wVar.f7308a;
        if (i10 > bArr.length) {
            wVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.F(0);
        }
        wVar.E(this.f48865l);
        lVar.readFully(wVar.f7308a, 0, this.f48865l);
        return wVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f48861g = 1;
            this.h = false;
        } else {
            this.f48861g = 3;
        }
        this.f48863j = 0;
    }

    @Override
    public final void e(m mVar) {
        this.f48860f = mVar;
    }

    @Override
    public final int h(r3.l r32, org.telegram.ui.Components.jb r33) {
        throw new UnsupportedOperationException("Method not decompiled: v3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f48856a;
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
                hVar.f46558f = 0;
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
