package ti;

import jg.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f49209a;
    public final e f49210b;
    public final d f49211c;

    public b(e eVar, d dVar, int i10) {
        this.f49209a = i10;
        this.f49210b = eVar;
        this.f49211c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f49209a) {
            case 0:
                e eVar = this.f49210b;
                d dVar = (d) eVar.f49220c;
                d dVar2 = this.f49211c;
                if (dVar == dVar2) {
                    eVar.d = null;
                    eVar.e(dVar2);
                    return;
                }
                return;
            case 1:
                e eVar2 = this.f49210b;
                d dVar3 = (d) eVar2.f49220c;
                d dVar4 = this.f49211c;
                if (dVar3 == dVar4) {
                    b bVar = (b) eVar2.d;
                    if (bVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        eVar2.d = null;
                    }
                    int i10 = dVar4.d;
                    if (i10 == 0) {
                        eVar2.e(dVar4);
                        return;
                    }
                    b bVar2 = new b(eVar2, dVar4, 2);
                    eVar2.e = bVar2;
                    AndroidUtilities.runOnUIThread(bVar2, 20000L);
                    e1 e1Var = dVar4.f49214a;
                    ((ConnectionsManager) e1Var.f15689b).checkWebProxyInternal(dVar4.f49215b, i10, new c(eVar2, dVar4));
                    return;
                }
                return;
            default:
                e eVar3 = this.f49210b;
                d dVar5 = (d) eVar3.f49220c;
                d dVar6 = this.f49211c;
                if (dVar5 == dVar6) {
                    eVar3.e = null;
                    eVar3.e(dVar6);
                    return;
                }
                return;
        }
    }
}
