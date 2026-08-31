package ra;

import pa.u;
public final class e extends u {
    public volatile u f46754a;
    public final boolean f46755b;
    public final boolean f46756c;
    public final pa.g d;
    public final wa.a f46757e;
    public final f f46758f;

    public e(f fVar, boolean z4, boolean z10, pa.g gVar, wa.a aVar) {
        this.f46758f = fVar;
        this.f46755b = z4;
        this.f46756c = z10;
        this.d = gVar;
        this.f46757e = aVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        if (this.f46755b) {
            aVar.C();
            return null;
        }
        u uVar = this.f46754a;
        if (uVar == null) {
            uVar = this.d.c(this.f46758f, this.f46757e);
            this.f46754a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (this.f46756c) {
            bVar.i();
            return;
        }
        u uVar = this.f46754a;
        if (uVar == null) {
            uVar = this.d.c(this.f46758f, this.f46757e);
            this.f46754a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
