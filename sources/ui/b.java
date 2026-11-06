package ui;

import l2.y;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f56804a;
    public final e f56805b;
    public final d f56806c;

    public b(e eVar, d dVar, int i7) {
        this.f56804a = i7;
        this.f56805b = eVar;
        this.f56806c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f56804a) {
            case 0:
                e eVar = this.f56805b;
                d dVar = (d) eVar.f56815c;
                d dVar2 = this.f56806c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.m(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f56805b;
                d dVar3 = (d) eVar2.f56815c;
                d dVar4 = this.f56806c;
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
                    eVar2.f56816e = bVar2;
                    g0.i3(bVar2, 20000L);
                    y yVar = dVar4.f56809a;
                    ((ConnectionsManager) yVar.f18086b).checkWebProxyInternal(dVar4.f56810b, i7, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f56805b;
                d dVar5 = (d) eVar3.f56815c;
                d dVar6 = this.f56806c;
                if (dVar5 == dVar6) {
                    eVar3.f56816e = null;
                    eVar3.m(dVar6);
                    return;
                }
                return;
        }
    }
}
