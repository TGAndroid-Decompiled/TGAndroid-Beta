package r9;

import qg.f0;
public final class p implements qa.b {
    public static final f0 f45155c = new f0(7);
    public static final f d = new f(1);
    public qa.a f45156a;
    public volatile qa.b f45157b;

    public p(f0 f0Var, qa.b bVar) {
        this.f45156a = f0Var;
        this.f45157b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45157b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45157b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45156a = new org.telegram.ui.web.m(6, this.f45156a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45157b.get();
    }
}
