package r9;

import qg.e0;
public final class p implements qa.b {
    public static final e0 f45147c = new e0(7);
    public static final f d = new f(1);
    public qa.a f45148a;
    public volatile qa.b f45149b;

    public p(e0 e0Var, qa.b bVar) {
        this.f45148a = e0Var;
        this.f45149b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45149b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45149b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45148a = new org.telegram.ui.web.n(6, this.f45148a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45149b.get();
    }
}
