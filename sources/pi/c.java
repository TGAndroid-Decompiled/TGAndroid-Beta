package pi;

import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f45929a;
    public final f f45930b;
    public final e f45931c;

    public c(f fVar, e eVar, int i10) {
        this.f45929a = i10;
        this.f45930b = fVar;
        this.f45931c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f45929a) {
            case 0:
                f fVar = this.f45930b;
                e eVar = (e) fVar.f45939b;
                e eVar2 = this.f45931c;
                if (eVar == eVar2) {
                    fVar.f45940c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f45930b;
                e eVar3 = (e) fVar2.f45939b;
                e eVar4 = this.f45931c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f45940c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f45940c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    w wVar = eVar4.f45934a;
                    ((ConnectionsManager) wVar.f16272b).checkWebProxyInternal(eVar4.f45935b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f45930b;
                e eVar5 = (e) fVar3.f45939b;
                e eVar6 = this.f45931c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
