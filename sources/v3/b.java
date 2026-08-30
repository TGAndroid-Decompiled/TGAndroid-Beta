package v3;

import cb.e;
import h5.w;
import r3.h;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public final w f45565a = new w(4);
    public final w f45566b = new w(9);
    public final w f45567c = new w(11);
    public final w d = new w();
    public final c e;
    public m f45568f;
    public int f45569g;
    public boolean h;
    public long f45570i;
    public int f45571j;
    public int f45572k;
    public int f45573l;
    public long f45574m;
    public boolean f45575n;
    public a f45576o;
    public d f45577p;

    public b() {
        ?? eVar = new e(new j());
        eVar.f45578b = -9223372036854775807L;
        eVar.f45579c = new long[0];
        eVar.d = new long[0];
        this.e = eVar;
        this.f45569g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.f45573l;
        w wVar = this.d;
        byte[] bArr = wVar.f7000a;
        if (i10 > bArr.length) {
            wVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.F(0);
        }
        wVar.E(this.f45573l);
        lVar.readFully(wVar.f7000a, 0, this.f45573l);
        return wVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f45569g = 1;
            this.h = false;
        } else {
            this.f45569g = 3;
        }
        this.f45571j = 0;
    }

    @Override
    public final void e(m mVar) {
        this.f45568f = mVar;
    }

    @Override
    public final int h(r3.l r32, org.telegram.ui.Components.jb r33) {
        throw new UnsupportedOperationException("Method not decompiled: v3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f45565a;
        h hVar = (h) lVar;
        hVar.h(wVar.f7000a, 0, 3, false);
        wVar.F(0);
        if (wVar.w() == 4607062) {
            hVar.h(wVar.f7000a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & 250) == 0) {
                hVar.h(wVar.f7000a, 0, 4, false);
                wVar.F(0);
                int g10 = wVar.g();
                hVar.f43223f = 0;
                hVar.a(g10, false);
                hVar.h(wVar.f7000a, 0, 4, false);
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
