package sa;
public final class a0 extends y {
    public final pa.o f47183a;
    public final pa.g f47184b;
    public final wa.a f47185c;
    public final pa.v d;
    public final org.telegram.ui.Cells.f1 f47186e = new org.telegram.ui.Cells.f1(this, 18);
    public final boolean f47187f;
    public volatile pa.u f47188g;

    public a0(pa.o oVar, pa.g gVar, wa.a aVar, pa.v vVar, boolean z4) {
        this.f47183a = oVar;
        this.f47184b = gVar;
        this.f47185c = aVar;
        this.d = vVar;
        this.f47187f = z4;
    }

    @Override
    public final pa.u a() {
        if (this.f47183a != null) {
            return this;
        }
        pa.u uVar = this.f47188g;
        if (uVar != null) {
            return uVar;
        }
        pa.u c3 = this.f47184b.c(this.d, this.f47185c);
        this.f47188g = c3;
        return c3;
    }

    @Override
    public final Object read(xa.a aVar) {
        pa.u uVar = this.f47188g;
        if (uVar == null) {
            uVar = this.f47184b.c(this.d, this.f47185c);
            this.f47188g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        pa.o oVar = this.f47183a;
        if (oVar == null) {
            pa.u uVar = this.f47188g;
            if (uVar == null) {
                uVar = this.f47184b.c(this.d, this.f47185c);
                this.f47188g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f47187f && obj == null) {
            bVar.i();
        } else {
            ra.d.l(oVar.serialize(obj, this.f47185c.f49521b, this.f47186e), bVar);
        }
    }
}
