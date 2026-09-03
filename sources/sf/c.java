package sf;

import mh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f47341a;
    public final f f47342b;
    public final e f47343c;

    public c(f fVar, e eVar, int i10) {
        this.f47341a = i10;
        this.f47342b = fVar;
        this.f47343c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f47341a) {
            case 0:
                f fVar = this.f47342b;
                e eVar = (e) fVar.f47352c;
                e eVar2 = this.f47343c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.p(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f47342b;
                e eVar3 = (e) fVar2.f47352c;
                e eVar4 = this.f47343c;
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
                    fVar2.f47353e = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    m5 m5Var = eVar4.f47346a;
                    ((ConnectionsManager) m5Var.f14452b).checkWebProxyInternal(eVar4.f47347b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f47342b;
                e eVar5 = (e) fVar3.f47352c;
                e eVar6 = this.f47343c;
                if (eVar5 == eVar6) {
                    fVar3.f47353e = null;
                    fVar3.p(eVar6);
                    return;
                }
                return;
        }
    }
}
