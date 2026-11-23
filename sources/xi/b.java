package xi;

import kg.y1;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f60622a;
    public final e f60623b;
    public final d f60624c;

    public b(e eVar, d dVar, int i7) {
        this.f60622a = i7;
        this.f60623b = eVar;
        this.f60624c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f60622a) {
            case 0:
                e eVar = this.f60623b;
                d dVar = (d) eVar.f60632b;
                d dVar2 = this.f60624c;
                if (dVar == dVar2) {
                    eVar.f60633c = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f60623b;
                d dVar3 = (d) eVar2.f60632b;
                d dVar4 = this.f60624c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f60633c;
                    if (bVar != null) {
                        g0.r(bVar);
                        eVar2.f60633c = null;
                    }
                    int i7 = dVar4.d;
                    if (i7 == 0) {
                        eVar2.m(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    g0.h3(bVar2, 20000L);
                    y1 y1Var = dVar4.f60627a;
                    ((ConnectionsManager) y1Var.f18538b).checkWebProxyInternal(dVar4.f60628b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f60623b;
                d dVar5 = (d) eVar3.f60632b;
                d dVar6 = this.f60624c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
