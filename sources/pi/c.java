package pi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f41357a;
    public final f f41358b;
    public final e f41359c;

    public c(f fVar, e eVar, int i10) {
        this.f41357a = i10;
        this.f41358b = fVar;
        this.f41359c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f41357a) {
            case 0:
                f fVar = this.f41358b;
                e eVar = (e) fVar.f41366b;
                e eVar2 = this.f41359c;
                if (eVar == eVar2) {
                    fVar.f41367c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f41358b;
                e eVar3 = (e) fVar2.f41366b;
                e eVar4 = this.f41359c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f41367c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f41367c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    le.b bVar = eVar4.f41362a;
                    ((ConnectionsManager) bVar.f14199b).checkWebProxyInternal(eVar4.f41363b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f41358b;
                e eVar5 = (e) fVar3.f41366b;
                e eVar6 = this.f41359c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
