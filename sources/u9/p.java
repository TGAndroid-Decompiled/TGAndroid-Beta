package u9;

import org.telegram.ui.web.a0;
public final class p implements ua.b {
    public static final s0.b f56484c = new s0.b(27);
    public static final ab.m d = new ab.m(2);
    public ua.a f56485a;
    public volatile ua.b f56486b;

    public p(s0.b bVar, ua.b bVar2) {
        this.f56485a = bVar;
        this.f56486b = bVar2;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f56486b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f56486b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f56485a = new a0(13, this.f56485a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f56486b.get();
    }
}
