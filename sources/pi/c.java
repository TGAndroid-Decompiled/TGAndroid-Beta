package pi;

import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f45963a;
    public final f f45964b;
    public final e f45965c;

    public c(f fVar, e eVar, int i10) {
        this.f45963a = i10;
        this.f45964b = fVar;
        this.f45965c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f45963a) {
            case 0:
                f fVar = this.f45964b;
                e eVar = (e) fVar.f45973b;
                e eVar2 = this.f45965c;
                if (eVar == eVar2) {
                    fVar.f45974c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f45964b;
                e eVar3 = (e) fVar2.f45973b;
                e eVar4 = this.f45965c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f45974c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f45974c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    w wVar = eVar4.f45968a;
                    ((ConnectionsManager) wVar.f16308b).checkWebProxyInternal(eVar4.f45969b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f45964b;
                e eVar5 = (e) fVar3.f45973b;
                e eVar6 = this.f45965c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
