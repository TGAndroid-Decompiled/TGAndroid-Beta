package r9;

import org.telegram.ui.web.k0;
import org.telegram.utils.twidget.t;
public final class p implements qa.b {
    public static final t f46461c = new t(22);
    public static final f d = new f(1);
    public qa.a f46462a;
    public volatile qa.b f46463b;

    public p(t tVar, qa.b bVar) {
        this.f46462a = tVar;
        this.f46463b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f46463b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f46463b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f46462a = new k0(12, this.f46462a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f46463b.get();
    }
}
