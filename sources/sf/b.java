package sf;

import mh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f47305a;
    public final e f47306b;
    public final d f47307c;

    public b(e eVar, d dVar, int i10) {
        this.f47305a = i10;
        this.f47306b = eVar;
        this.f47307c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f47305a) {
            case 0:
                e eVar = this.f47306b;
                d dVar = (d) eVar.f47316c;
                d dVar2 = this.f47307c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.p(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f47306b;
                d dVar3 = (d) eVar2.f47316c;
                d dVar4 = this.f47307c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.d = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.p(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.f47317e = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    m5 m5Var = dVar4.f47310a;
                    ((ConnectionsManager) m5Var.f14450b).checkWebProxyInternal(dVar4.f47311b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f47306b;
                d dVar5 = (d) eVar3.f47316c;
                d dVar6 = this.f47307c;
                if (dVar5 == dVar6) {
                    eVar3.f47317e = null;
                    eVar3.p(dVar6);
                    return;
                }
                return;
        }
    }
}
