package r9;
public final class p implements qa.b {
    public static final r.a f45193c = new r.a(6);
    public static final f d = new f(1);
    public qa.a f45194a;
    public volatile qa.b f45195b;

    public p(r.a aVar, qa.b bVar) {
        this.f45194a = aVar;
        this.f45195b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45195b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45195b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45194a = new org.telegram.ui.web.m(6, this.f45194a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45195b.get();
    }
}
