package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f60740a;
    public final e f60741b;
    public final d f60742c;

    public b(e eVar, d dVar, int i7) {
        this.f60740a = i7;
        this.f60741b = eVar;
        this.f60742c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f60740a) {
            case 0:
                e eVar = this.f60741b;
                d dVar = (d) eVar.f60750b;
                d dVar2 = this.f60742c;
                if (dVar == dVar2) {
                    eVar.f60751c = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f60741b;
                d dVar3 = (d) eVar2.f60750b;
                d dVar4 = this.f60742c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f60751c;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.f60751c = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 == 0) {
                        eVar2.m(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    g0.h3(bVar2, 20000L);
                    org.telegram.tgnet.g gVar = dVar4.f60745a;
                    ((ConnectionsManager) gVar.f28679b).checkWebProxyInternal(dVar4.f60746b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f60741b;
                d dVar5 = (d) eVar3.f60750b;
                d dVar6 = this.f60742c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
