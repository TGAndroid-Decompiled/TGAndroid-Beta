package ra;

import pa.u;
public final class e extends u {
    public volatile u f43427a;
    public final boolean f43428b;
    public final boolean f43429c;
    public final pa.g d;
    public final wa.a e;
    public final f f43430f;

    public e(f fVar, boolean z4, boolean z10, pa.g gVar, wa.a aVar) {
        this.f43430f = fVar;
        this.f43428b = z4;
        this.f43429c = z10;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        if (this.f43428b) {
            aVar.C();
            return null;
        }
        u uVar = this.f43427a;
        if (uVar == null) {
            uVar = this.d.c(this.f43430f, this.e);
            this.f43427a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (this.f43429c) {
            bVar.i();
            return;
        }
        u uVar = this.f43427a;
        if (uVar == null) {
            uVar = this.d.c(this.f43430f, this.e);
            this.f43427a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
