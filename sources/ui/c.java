package ui;

import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
public final class c implements Runnable {
    public final int f56380a;
    public final f f56381b;
    public final e f56382c;

    public c(f fVar, e eVar, int i3) {
        this.f56380a = i3;
        this.f56381b = fVar;
        this.f56382c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f56380a) {
            case 0:
                f fVar = this.f56381b;
                e eVar = (e) fVar.f56391c;
                e eVar2 = this.f56382c;
                if (eVar == eVar2) {
                    fVar.d = null;
                    fVar.h(eVar2);
                    return;
                }
                return;
            case 1:
                f fVar2 = this.f56381b;
                e eVar3 = (e) fVar2.f56391c;
                e eVar4 = this.f56382c;
                if (eVar3 == eVar4) {
                    c cVar = (c) fVar2.d;
                    if (cVar != null) {
                        g0.r(cVar);
                        fVar2.d = null;
                    }
                    int i3 = eVar4.d;
                    if (i3 == 0) {
                        fVar2.h(eVar4);
                        return;
                    }
                    c cVar2 = new c(fVar2, eVar4, 2);
                    fVar2.f56392e = cVar2;
                    g0.i3(cVar2, 20000L);
                    l5.b bVar = eVar4.f56385a;
                    ((ConnectionsManager) bVar.f18041b).checkWebProxyInternal(eVar4.f56386b, i3, new d(fVar2, eVar4));
                    return;
                }
                return;
            default:
                f fVar3 = this.f56381b;
                e eVar5 = (e) fVar3.f56391c;
                e eVar6 = this.f56382c;
                if (eVar5 == eVar6) {
                    fVar3.f56392e = null;
                    fVar3.h(eVar6);
                    return;
                }
                return;
        }
    }
}
