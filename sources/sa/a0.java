package sa;
public final class a0 extends y {
    public final pa.o f44166a;
    public final pa.g f44167b;
    public final wa.a f44168c;
    public final pa.v d;
    public final org.telegram.ui.Cells.f1 e = new org.telegram.ui.Cells.f1(this, 19);
    public final boolean f44169f;
    public volatile pa.u f44170g;

    public a0(pa.o oVar, pa.g gVar, wa.a aVar, pa.v vVar, boolean z4) {
        this.f44166a = oVar;
        this.f44167b = gVar;
        this.f44168c = aVar;
        this.d = vVar;
        this.f44169f = z4;
    }

    @Override
    public final pa.u a() {
        if (this.f44166a != null) {
            return this;
        }
        pa.u uVar = this.f44170g;
        if (uVar != null) {
            return uVar;
        }
        pa.u c3 = this.f44167b.c(this.d, this.f44168c);
        this.f44170g = c3;
        return c3;
    }

    @Override
    public final Object read(xa.a aVar) {
        pa.u uVar = this.f44170g;
        if (uVar == null) {
            uVar = this.f44167b.c(this.d, this.f44168c);
            this.f44170g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        pa.o oVar = this.f44166a;
        if (oVar == null) {
            pa.u uVar = this.f44170g;
            if (uVar == null) {
                uVar = this.f44167b.c(this.d, this.f44168c);
                this.f44170g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f44169f && obj == null) {
            bVar.i();
        } else {
            ra.d.l(oVar.serialize(obj, this.f44168c.f46506b, this.e), bVar);
        }
    }
}
