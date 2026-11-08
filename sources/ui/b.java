package ui;

import l2.y;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f56920a;
    public final e f56921b;
    public final d f56922c;

    public b(e eVar, d dVar, int i7) {
        this.f56920a = i7;
        this.f56921b = eVar;
        this.f56922c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f56920a) {
            case 0:
                e eVar = this.f56921b;
                d dVar = (d) eVar.f56931c;
                d dVar2 = this.f56922c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f56921b;
                d dVar3 = (d) eVar2.f56931c;
                d dVar4 = this.f56922c;
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
                    eVar2.f56932e = bVar2;
                    g0.i3(bVar2, 20000L);
                    y yVar = dVar4.f56925a;
                    ((ConnectionsManager) yVar.f18089b).checkWebProxyInternal(dVar4.f56926b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f56921b;
                d dVar5 = (d) eVar3.f56931c;
                d dVar6 = this.f56922c;
                if (dVar5 == dVar6) {
                    eVar3.f56932e = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
