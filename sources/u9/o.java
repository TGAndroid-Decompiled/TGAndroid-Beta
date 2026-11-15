package u9;

import org.telegram.ui.Wallet.k8;
public final class o implements ua.b {
    public static final r2.j f57992c = new r2.j(28);
    public static final ab.m d = new ab.m(2);
    public ua.a f57993a;
    public volatile ua.b f57994b;

    public o(r2.j jVar, ua.b bVar) {
        this.f57993a = jVar;
        this.f57994b = bVar;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f57994b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f57994b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f57993a = new k8(19, this.f57993a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f57994b.get();
    }
}
