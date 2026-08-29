package pa;

import na.u;
public final class e extends u {
    public volatile u f45674a;
    public final boolean f45675b;
    public final boolean f45676c;
    public final na.g d;
    public final ua.a f45677e;
    public final f f45678f;

    public e(f fVar, boolean z10, boolean z11, na.g gVar, ua.a aVar) {
        this.f45678f = fVar;
        this.f45675b = z10;
        this.f45676c = z11;
        this.d = gVar;
        this.f45677e = aVar;
    }

    @Override
    public final Object read(va.a aVar) {
        if (this.f45675b) {
            aVar.C();
            return null;
        }
        u uVar = this.f45674a;
        if (uVar == null) {
            uVar = this.d.c(this.f45678f, this.f45677e);
            this.f45674a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        if (this.f45676c) {
            bVar.i();
            return;
        }
        u uVar = this.f45674a;
        if (uVar == null) {
            uVar = this.d.c(this.f45678f, this.f45677e);
            this.f45674a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
