package r9;

import org.telegram.ui.web.k0;
import org.telegram.utils.twidget.t;
public final class p implements qa.b {
    public static final t f46450c = new t(22);
    public static final f d = new f(1);
    public qa.a f46451a;
    public volatile qa.b f46452b;

    public p(t tVar, qa.b bVar) {
        this.f46451a = tVar;
        this.f46452b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f46452b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.i(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f46452b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f46451a = new k0(12, this.f46451a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.i(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f46452b.get();
    }
}
