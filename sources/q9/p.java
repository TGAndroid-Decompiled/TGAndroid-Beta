package q9;

import org.telegram.ui.fs0;
import org.telegram.ui.web.w;
public final class p implements pa.b {
    public static final w f44882c = new w(13);
    public static final f d = new f(1);
    public pa.a f44883a;
    public volatile pa.b f44884b;

    public p(w wVar, pa.b bVar) {
        this.f44883a = wVar;
        this.f44884b = bVar;
    }

    public final void a(pa.a aVar) {
        pa.b bVar;
        pa.b bVar2;
        pa.b bVar3 = this.f44884b;
        f fVar = d;
        if (bVar3 != fVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f44884b;
            if (bVar != fVar) {
                bVar2 = bVar;
            } else {
                this.f44883a = new fs0(26, this.f44883a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f44884b.get();
    }
}
