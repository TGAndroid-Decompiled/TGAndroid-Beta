package ra;

import pa.u;
public final class e extends u {
    public volatile u f43403a;
    public final boolean f43404b;
    public final boolean f43405c;
    public final pa.g d;
    public final wa.a e;
    public final f f43406f;

    public e(f fVar, boolean z4, boolean z10, pa.g gVar, wa.a aVar) {
        this.f43406f = fVar;
        this.f43404b = z4;
        this.f43405c = z10;
        this.d = gVar;
        this.e = aVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        if (this.f43404b) {
            aVar.C();
            return null;
        }
        u uVar = this.f43403a;
        if (uVar == null) {
            uVar = this.d.c(this.f43406f, this.e);
            this.f43403a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (this.f43405c) {
            bVar.i();
            return;
        }
        u uVar = this.f43403a;
        if (uVar == null) {
            uVar = this.d.c(this.f43406f, this.e);
            this.f43403a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
