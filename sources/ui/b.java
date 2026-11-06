package ui;

import l2.y;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f56829a;
    public final e f56830b;
    public final d f56831c;

    public b(e eVar, d dVar, int i7) {
        this.f56829a = i7;
        this.f56830b = eVar;
        this.f56831c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f56829a) {
            case 0:
                e eVar = this.f56830b;
                d dVar = (d) eVar.f56840c;
                d dVar2 = this.f56831c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f56830b;
                d dVar3 = (d) eVar2.f56840c;
                d dVar4 = this.f56831c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.d;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.d = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 == 0) {
                        eVar2.m(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.f56841e = bVar2;
                    g0.i3(bVar2, 20000L);
                    y yVar = dVar4.f56834a;
                    ((ConnectionsManager) yVar.f18086b).checkWebProxyInternal(dVar4.f56835b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f56830b;
                d dVar5 = (d) eVar3.f56840c;
                d dVar6 = this.f56831c;
                if (dVar5 == dVar6) {
                    eVar3.f56841e = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
