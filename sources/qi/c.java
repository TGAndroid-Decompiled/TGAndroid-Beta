package qi;

import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f45532a;
    public final f f45533b;
    public final e f45534c;

    public c(f fVar, e eVar, int i10) {
        this.f45532a = i10;
        this.f45533b = fVar;
        this.f45534c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f45532a) {
            case 0:
                f fVar = this.f45533b;
                e eVar = (e) fVar.f45542b;
                e eVar2 = this.f45534c;
                if (eVar == eVar2) {
                    fVar.f45543c = null;
                    fVar.j(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f45533b;
                e eVar3 = (e) fVar2.f45542b;
                e eVar4 = this.f45534c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.f45543c;
                    if (cVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        fVar2.f45543c = null;
                    }
                    int i10 = eVar4.d;
                    if (i10 == 0) {
                        fVar2.j(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.d = cVar2;
                    AndroidUtilities.runOnUIThread(cVar2, 20000L);
                    v vVar = eVar4.f45537a;
                    ((ConnectionsManager) vVar.f14538b).checkWebProxyInternal(eVar4.f45538b, i10, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f45533b;
                e eVar5 = (e) fVar3.f45542b;
                e eVar6 = this.f45534c;
                if (eVar5 == eVar6) {
                    fVar3.d = null;
                    fVar3.j(eVar6);
                    return;
                }
                return;
        }
    }
}
