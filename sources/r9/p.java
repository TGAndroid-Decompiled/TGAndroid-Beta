package r9;

import qg.f0;
public final class p implements qa.b {
    public static final f0 f45158c = new f0(7);
    public static final f d = new f(1);
    public qa.a f45159a;
    public volatile qa.b f45160b;

    public p(f0 f0Var, qa.b bVar) {
        this.f45159a = f0Var;
        this.f45160b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45160b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45160b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45159a = new org.telegram.ui.web.m(6, this.f45159a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45160b.get();
    }
}
