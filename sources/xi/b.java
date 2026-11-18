package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f60612a;
    public final e f60613b;
    public final d f60614c;

    public b(e eVar, d dVar, int i7) {
        this.f60612a = i7;
        this.f60613b = eVar;
        this.f60614c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f60612a) {
            case 0:
                e eVar = this.f60613b;
                d dVar = (d) eVar.f60622b;
                d dVar2 = this.f60614c;
                if (dVar == dVar2) {
                    eVar.f60623c = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f60613b;
                d dVar3 = (d) eVar2.f60622b;
                d dVar4 = this.f60614c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f60623c;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.f60623c = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 == 0) {
                        eVar2.m(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    g0.h3(bVar2, 20000L);
                    ki.e eVar3 = dVar4.f60617a;
                    ((ConnectionsManager) eVar3.f18629b).checkWebProxyInternal(dVar4.f60618b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar4 = this.f60613b;
                d dVar5 = (d) eVar4.f60622b;
                d dVar6 = this.f60614c;
                if (dVar5 == dVar6) {
                    eVar4.d = null;
                    eVar4.m(dVar6);
                    return;
                }
                return;
        }
    }
}
