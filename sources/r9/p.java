package r9;

import org.telegram.ui.web.c0;
public final class p implements qa.b {
    public static final r.a f45173c = new r.a(6);
    public static final f d = new f(1);
    public qa.a f45174a;
    public volatile qa.b f45175b;

    public p(r.a aVar, qa.b bVar) {
        this.f45174a = aVar;
        this.f45175b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f45175b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.h(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f45175b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f45174a = new c0(5, this.f45174a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.h(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f45175b.get();
    }
}
