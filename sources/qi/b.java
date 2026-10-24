package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f45167a;
    public final e f45168b;
    public final d f45169c;

    public b(e eVar, d dVar, int i10) {
        this.f45167a = i10;
        this.f45168b = eVar;
        this.f45169c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f45167a) {
            case 0:
                e eVar = this.f45168b;
                d dVar = (d) eVar.f45176b;
                d dVar2 = this.f45169c;
                if (dVar == dVar2) {
                    eVar.f45177c = null;
                    eVar.k(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f45168b;
                d dVar3 = (d) eVar2.f45176b;
                d dVar4 = this.f45169c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f45177c;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.f45177c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.k(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    j5.b bVar3 = dVar4.f45172a;
                    ((ConnectionsManager) bVar3.f14300b).checkWebProxyInternal(dVar4.f45173b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f45168b;
                d dVar5 = (d) eVar3.f45176b;
                d dVar6 = this.f45169c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.k(dVar6);
                    return;
                }
                return;
        }
    }
}
