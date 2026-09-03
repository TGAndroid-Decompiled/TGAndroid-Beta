package rf;

import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f43480a;
    public final f f43481b;
    public final e f43482c;

    public c(f fVar, e eVar, int i10) {
        this.f43480a = i10;
        this.f43481b = fVar;
        this.f43482c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f43480a) {
            case 0:
                f fVar = this.f43481b;
                e eVar = (e) fVar.f43491c;
                e eVar2 = this.f43482c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.p(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f43481b;
                e eVar3 = (e) fVar2.f43491c;
                e eVar4 = this.f43482c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.d;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.d = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.p(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.e = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    m5 m5Var = eVar4.f43485a;
                    ((ConnectionsManager) m5Var.f12783b).checkWebProxyInternal(eVar4.f43486b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f43481b;
                e eVar5 = (e) fVar3.f43491c;
                e eVar6 = this.f43482c;
                if (eVar5 == eVar6) {
                    fVar3.e = null;
                    fVar3.p(eVar6);
                    return;
                }
                return;
        }
    }
}
