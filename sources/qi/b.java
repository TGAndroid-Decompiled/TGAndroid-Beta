package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f44756a;
    public final e f44757b;
    public final d f44758c;

    public b(e eVar, d dVar, int i10) {
        this.f44756a = i10;
        this.f44757b = eVar;
        this.f44758c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f44756a) {
            case 0:
                e eVar = this.f44757b;
                d dVar = (d) eVar.f44765b;
                d dVar2 = this.f44758c;
                if (dVar == dVar2) {
                    eVar.f44766c = null;
                    eVar.k(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f44757b;
                d dVar3 = (d) eVar2.f44765b;
                d dVar4 = this.f44758c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f44766c;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.f44766c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.k(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    j5.b bVar3 = dVar4.f44761a;
                    ((ConnectionsManager) bVar3.f14255b).checkWebProxyInternal(dVar4.f44762b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f44757b;
                d dVar5 = (d) eVar3.f44765b;
                d dVar6 = this.f44758c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.k(dVar6);
                    return;
                }
                return;
        }
    }
}
