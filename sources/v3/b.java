package v3;

import cb.e;
import h5.w;
import r3.h;
import r3.j;
import r3.k;
import r3.l;
import r3.m;
public final class b implements k {
    public final w f45629a = new w(4);
    public final w f45630b = new w(9);
    public final w f45631c = new w(11);
    public final w d = new w();
    public final c e;
    public m f45632f;
    public int f45633g;
    public boolean h;
    public long f45634i;
    public int f45635j;
    public int f45636k;
    public int f45637l;
    public long f45638m;
    public boolean f45639n;
    public a f45640o;
    public d f45641p;

    public b() {
        ?? eVar = new e(new j());
        eVar.f45642b = -9223372036854775807L;
        eVar.f45643c = new long[0];
        eVar.d = new long[0];
        this.e = eVar;
        this.f45633g = 1;
    }

    public final w a(l lVar) {
        int i10 = this.f45637l;
        w wVar = this.d;
        byte[] bArr = wVar.f6987a;
        if (i10 > bArr.length) {
            wVar.D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            wVar.F(0);
        }
        wVar.E(this.f45637l);
        lVar.readFully(wVar.f6987a, 0, this.f45637l);
        return wVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f45633g = 1;
            this.h = false;
        } else {
            this.f45633g = 3;
        }
        this.f45635j = 0;
    }

    @Override
    public final void e(m mVar) {
        this.f45632f = mVar;
    }

    @Override
    public final int h(r3.l r32, org.telegram.ui.Components.jb r33) {
        throw new UnsupportedOperationException("Method not decompiled: v3.b.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        w wVar = this.f45629a;
        h hVar = (h) lVar;
        hVar.f(wVar.f6987a, 0, 3, false);
        wVar.F(0);
        if (wVar.w() == 4607062) {
            hVar.f(wVar.f6987a, 0, 2, false);
            wVar.F(0);
            if ((wVar.z() & 250) == 0) {
                hVar.f(wVar.f6987a, 0, 4, false);
                wVar.F(0);
                int g10 = wVar.g();
                hVar.f43247f = 0;
                hVar.a(g10, false);
                hVar.f(wVar.f6987a, 0, 4, false);
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
