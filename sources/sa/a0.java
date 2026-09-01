package sa;
public final class a0 extends y {
    public final pa.o f47152a;
    public final pa.g f47153b;
    public final wa.a f47154c;
    public final pa.v d;
    public final org.telegram.ui.Cells.f1 f47155e = new org.telegram.ui.Cells.f1(this, 18);
    public final boolean f47156f;
    public volatile pa.u f47157g;

    public a0(pa.o oVar, pa.g gVar, wa.a aVar, pa.v vVar, boolean z4) {
        this.f47152a = oVar;
        this.f47153b = gVar;
        this.f47154c = aVar;
        this.d = vVar;
        this.f47156f = z4;
    }

    @Override
    public final pa.u a() {
        if (this.f47152a != null) {
            return this;
        }
        pa.u uVar = this.f47157g;
        if (uVar != null) {
            return uVar;
        }
        pa.u c3 = this.f47153b.c(this.d, this.f47154c);
        this.f47157g = c3;
        return c3;
    }

    @Override
    public final Object read(xa.a aVar) {
        pa.u uVar = this.f47157g;
        if (uVar == null) {
            uVar = this.f47153b.c(this.d, this.f47154c);
            this.f47157g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        pa.o oVar = this.f47152a;
        if (oVar == null) {
            pa.u uVar = this.f47157g;
            if (uVar == null) {
                uVar = this.f47153b.c(this.d, this.f47154c);
                this.f47157g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f47156f && obj == null) {
            bVar.i();
        } else {
            ra.d.l(oVar.serialize(obj, this.f47154c.f49485b, this.f47155e), bVar);
        }
    }
}
