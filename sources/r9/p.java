package r9;

import org.telegram.ui.web.c0;
public final class p implements qa.b {
    public static final r0.h f44058c = new r0.h(5);
    public static final f d = new f(1);
    public qa.a f44059a;
    public volatile qa.b f44060b;

    public p(r0.h hVar, qa.b bVar) {
        this.f44059a = hVar;
        this.f44060b = bVar;
    }

    public final void a(qa.a aVar) {
        qa.b bVar;
        qa.b bVar2;
        qa.b bVar3 = this.f44060b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f44060b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f44059a = new c0(5, this.f44059a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f44060b.get();
    }
}
