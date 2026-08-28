package v3;

import d5.f0;
import d5.y;
import g7.t;
import h3.t1;
import m3.k;
import m3.l;
import m3.m;
public final class d implements k {
    public m f48324a;
    public i f48325b;
    public boolean f48326c;

    public final boolean a(l lVar) {
        boolean z10;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f48331a & 2) == 2) {
            int min = Math.min(fVar.f48334e, 8);
            y yVar = new y(min);
            lVar.c(0, min, yVar.f4410a);
            yVar.C(0);
            if (yVar.a() >= 5 && yVar.r() == 127 && yVar.s() == 1179402563) {
                this.f48325b = new i();
                return true;
            }
            yVar.C(0);
            try {
                z10 = t.c(1, yVar, true);
            } catch (t1 unused) {
                z10 = false;
            }
            if (z10) {
                this.f48325b = new i();
            } else {
                yVar.C(0);
                if (h.e(yVar, h.f48337o)) {
                    this.f48325b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int b(m3.l r21, m3.n r22) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f48324a = mVar;
    }

    @Override
    public final boolean f(l lVar) {
        try {
            return a(lVar);
        } catch (t1 unused) {
            return false;
        }
    }

    @Override
    public final void g(long j10, long j11) {
        i iVar = this.f48325b;
        if (iVar != null) {
            e eVar = iVar.f48340a;
            f fVar = eVar.f48327a;
            fVar.f48331a = 0;
            fVar.f48332b = 0L;
            fVar.f48333c = 0;
            fVar.d = 0;
            fVar.f48334e = 0;
            eVar.f48328b.z(0);
            eVar.f48329c = -1;
            eVar.f48330e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f48349l);
            } else if (iVar.h != 0) {
                long j12 = (iVar.f48346i * j11) / 1000000;
                iVar.f48343e = j12;
                g gVar = iVar.d;
                int i9 = f0.f4349a;
                gVar.O(j12);
                iVar.h = 2;
            }
        }
    }

    @Override
    public final void release() {
    }
}
