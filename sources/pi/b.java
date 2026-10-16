package pi;

import ji.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f42936a;
    public final e f42937b;
    public final d f42938c;

    public b(e eVar, d dVar, int i10) {
        this.f42936a = i10;
        this.f42937b = eVar;
        this.f42938c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f42936a) {
            case 0:
                e eVar = this.f42937b;
                d dVar = (d) eVar.f42945b;
                d dVar2 = this.f42938c;
                if (dVar == dVar2) {
                    eVar.f42946c = null;
                    eVar.h(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f42937b;
                d dVar3 = (d) eVar2.f42945b;
                d dVar4 = this.f42938c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f42946c;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.f42946c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.h(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    m5 m5Var = dVar4.f42941a;
                    ((ConnectionsManager) m5Var.f13414b).checkWebProxyInternal(dVar4.f42942b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f42937b;
                d dVar5 = (d) eVar3.f42945b;
                d dVar6 = this.f42938c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.h(dVar6);
                    return;
                }
                return;
        }
    }
}
