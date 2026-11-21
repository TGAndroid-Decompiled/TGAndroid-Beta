package xi;

import kg.x1;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f60653a;
    public final e f60654b;
    public final d f60655c;

    public b(e eVar, d dVar, int i7) {
        this.f60653a = i7;
        this.f60654b = eVar;
        this.f60655c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f60653a) {
            case 0:
                e eVar = this.f60654b;
                d dVar = (d) eVar.f60663b;
                d dVar2 = this.f60655c;
                if (dVar == dVar2) {
                    eVar.f60664c = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f60654b;
                d dVar3 = (d) eVar2.f60663b;
                d dVar4 = this.f60655c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f60664c;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.f60664c = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 == 0) {
                        eVar2.m(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    g0.h3(bVar2, 20000L);
                    x1 x1Var = dVar4.f60658a;
                    ((ConnectionsManager) x1Var.f18561b).checkWebProxyInternal(dVar4.f60659b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f60654b;
                d dVar5 = (d) eVar3.f60663b;
                d dVar6 = this.f60655c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
