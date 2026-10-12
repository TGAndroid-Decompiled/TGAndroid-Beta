package qi;

import ji.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f43654a;
    public final e f43655b;
    public final d f43656c;

    public b(e eVar, d dVar, int i10) {
        this.f43654a = i10;
        this.f43655b = eVar;
        this.f43656c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f43654a) {
            case 0:
                e eVar = this.f43655b;
                d dVar = (d) eVar.f43663b;
                d dVar2 = this.f43656c;
                if (dVar == dVar2) {
                    eVar.f43664c = null;
                    eVar.h(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f43655b;
                d dVar3 = (d) eVar2.f43663b;
                d dVar4 = this.f43656c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f43664c;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.f43664c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.h(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    m5 m5Var = dVar4.f43659a;
                    ((ConnectionsManager) m5Var.f13411b).checkWebProxyInternal(dVar4.f43660b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f43655b;
                d dVar5 = (d) eVar3.f43663b;
                d dVar6 = this.f43656c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.h(dVar6);
                    return;
                }
                return;
        }
    }
}
