package x3;

import f5.d0;
import f5.w;
import i7.w5;
import j3.t1;
import o3.k;
import o3.l;
import o3.m;
public final class d implements k {
    public m f50062a;
    public i f50063b;
    public boolean f50064c;

    public final boolean a(l lVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f50069a & 2) == 2) {
            int min = Math.min(fVar.f50072e, 8);
            w wVar = new w(min);
            lVar.a(0, min, wVar.f6640a);
            wVar.C(0);
            if (wVar.a() >= 5 && wVar.r() == 127 && wVar.s() == 1179402563) {
                this.f50063b = new i();
                return true;
            }
            wVar.C(0);
            try {
                z10 = w5.c(1, wVar, true);
            } catch (t1 unused) {
                z10 = false;
            }
            if (z10) {
                this.f50063b = new i();
            } else {
                wVar.C(0);
                if (h.e(wVar, h.f50075o)) {
                    this.f50063b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int d(o3.l r21, o3.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        try {
            return a(lVar);
        } catch (t1 unused) {
            return false;
        }
    }

    @Override
    public final void f(long j10, long j11) {
        i iVar = this.f50063b;
        if (iVar != null) {
            e eVar = iVar.f50078a;
            f fVar = eVar.f50065a;
            fVar.f50069a = 0;
            fVar.f50070b = 0L;
            fVar.f50071c = 0;
            fVar.d = 0;
            fVar.f50072e = 0;
            eVar.f50066b.z(0);
            eVar.f50067c = -1;
            eVar.f50068e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f50087l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f50084i * j11) / 1000000;
                iVar.f50081e = j12;
                g gVar = iVar.d;
                int i10 = d0.f6579a;
                gVar.z(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final void i(m mVar) {
        this.f50062a = mVar;
    }

    @Override
    public final void release() {
    }
}
