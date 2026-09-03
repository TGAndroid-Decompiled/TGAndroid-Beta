package ra;

import pa.u;
public final class e extends u {
    public volatile u f46785a;
    public final boolean f46786b;
    public final boolean f46787c;
    public final pa.g d;
    public final wa.a f46788e;
    public final f f46789f;

    public e(f fVar, boolean z4, boolean z10, pa.g gVar, wa.a aVar) {
        this.f46789f = fVar;
        this.f46786b = z4;
        this.f46787c = z10;
        this.d = gVar;
        this.f46788e = aVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        if (this.f46786b) {
            aVar.C();
            return null;
        }
        u uVar = this.f46785a;
        if (uVar == null) {
            uVar = this.d.c(this.f46789f, this.f46788e);
            this.f46785a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (this.f46787c) {
            bVar.i();
            return;
        }
        u uVar = this.f46785a;
        if (uVar == null) {
            uVar = this.d.c(this.f46789f, this.f46788e);
            this.f46785a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
