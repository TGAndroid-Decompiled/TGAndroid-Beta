package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f44742a;
    public final e f44743b;
    public final d f44744c;

    public b(e eVar, d dVar, int i10) {
        this.f44742a = i10;
        this.f44743b = eVar;
        this.f44744c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f44742a) {
            case 0:
                e eVar = this.f44743b;
                d dVar = (d) eVar.f44751b;
                d dVar2 = this.f44744c;
                if (dVar == dVar2) {
                    eVar.f44752c = null;
                    eVar.k(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f44743b;
                d dVar3 = (d) eVar2.f44751b;
                d dVar4 = this.f44744c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.f44752c;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.f44752c = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.k(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.d = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    j5.b bVar3 = dVar4.f44747a;
                    ((ConnectionsManager) bVar3.f14257b).checkWebProxyInternal(dVar4.f44748b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f44743b;
                d dVar5 = (d) eVar3.f44751b;
                d dVar6 = this.f44744c;
                if (dVar5 == dVar6) {
                    eVar3.d = null;
                    eVar3.k(dVar6);
                    return;
                }
                return;
        }
    }
}
