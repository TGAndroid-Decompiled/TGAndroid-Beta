package ui;

import l2.y;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f56828a;
    public final e f56829b;
    public final d f56830c;

    public b(e eVar, d dVar, int i7) {
        this.f56828a = i7;
        this.f56829b = eVar;
        this.f56830c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f56828a) {
            case 0:
                e eVar = this.f56829b;
                d dVar = (d) eVar.f56839c;
                d dVar2 = this.f56830c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f56829b;
                d dVar3 = (d) eVar2.f56839c;
                d dVar4 = this.f56830c;
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
                    eVar2.f56840e = bVar2;
                    g0.i3(bVar2, 20000L);
                    y yVar = dVar4.f56833a;
                    ((ConnectionsManager) yVar.f18086b).checkWebProxyInternal(dVar4.f56834b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f56829b;
                d dVar5 = (d) eVar3.f56839c;
                d dVar6 = this.f56830c;
                if (dVar5 == dVar6) {
                    eVar3.f56840e = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
