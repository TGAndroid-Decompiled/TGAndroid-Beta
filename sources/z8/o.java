package z8;

import org.telegram.ui.di1;

public final class o implements y9.b {

    public static final u3.k f50249c = new u3.k(16);
    public static final a9.l d = new a9.l(5);

    public y9.a f50250a;

    public volatile y9.b f50251b;

    public o(u3.k kVar, y9.b bVar) {
        this.f50250a = kVar;
        this.f50251b = bVar;
    }

    public final void a(y9.a aVar) {
        y9.b bVar;
        y9.b bVar2;
        y9.b bVar3 = this.f50251b;
        a9.l lVar = d;
        if (bVar3 != lVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f50251b;
            if (bVar != lVar) {
                bVar2 = bVar;
            } else {
                this.f50250a = new di1(13, this.f50250a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override
    public final Object get() {
        return this.f50251b.get();
    }
}
