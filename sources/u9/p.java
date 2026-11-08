package u9;

import org.telegram.ui.web.a0;
public final class p implements ua.b {
    public static final s0.b f56485c = new s0.b(27);
    public static final ab.m d = new ab.m(2);
    public ua.a f56486a;
    public volatile ua.b f56487b;

    public p(s0.b bVar, ua.b bVar2) {
        this.f56486a = bVar;
        this.f56487b = bVar2;
    }

    public final void a(ua.a aVar) {
        ua.b bVar;
        ua.b bVar2;
        ua.b bVar3 = this.f56487b;
        ab.m mVar = d;
        if (bVar3 != mVar) {
            aVar.c(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f56487b;
            if (bVar != mVar) {
                bVar2 = bVar;
            } else {
                this.f56486a = new a0(13, this.f56486a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.c(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f56487b.get();
    }
}
