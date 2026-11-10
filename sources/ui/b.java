package ui;

import l2.x;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f56929a;
    public final e f56930b;
    public final d f56931c;

    public b(e eVar, d dVar, int i7) {
        this.f56929a = i7;
        this.f56930b = eVar;
        this.f56931c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f56929a) {
            case 0:
                e eVar = this.f56930b;
                d dVar = (d) eVar.f56940c;
                d dVar2 = this.f56931c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f56930b;
                d dVar3 = (d) eVar2.f56940c;
                d dVar4 = this.f56931c;
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
                    eVar2.f56941e = bVar2;
                    g0.i3(bVar2, 20000L);
                    x xVar = dVar4.f56934a;
                    ((ConnectionsManager) xVar.f18074b).checkWebProxyInternal(dVar4.f56935b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f56930b;
                d dVar5 = (d) eVar3.f56940c;
                d dVar6 = this.f56931c;
                if (dVar5 == dVar6) {
                    eVar3.f56941e = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
