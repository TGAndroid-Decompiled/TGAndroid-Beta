package u9;

import org.telegram.ui.web.a0;
public final class o implements ua.b {
    public static final s0.b f56368c = new s0.b(26);
    public static final ab.m d = new ab.m(2);
    public ua.a f56369a;
    public volatile ua.b f56370b;

    public o(s0.b bVar, ua.b bVar2) {
        this.f56369a = bVar;
        this.f56370b = bVar2;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f56370b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f56370b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f56369a = new a0(14, this.f56369a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f56370b.get();
    }
}
