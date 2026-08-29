package qa;
public final class a0 extends y {
    public final na.o f46512a;
    public final na.g f46513b;
    public final ua.a f46514c;
    public final na.v d;
    public final org.telegram.ui.Components.n f46515e = new org.telegram.ui.Components.n(this, 12);
    public final boolean f46516f;
    public volatile na.u f46517g;

    public a0(na.o oVar, na.g gVar, ua.a aVar, na.v vVar, boolean z10) {
        this.f46512a = oVar;
        this.f46513b = gVar;
        this.f46514c = aVar;
        this.d = vVar;
        this.f46516f = z10;
    }

    @Override
    public final na.u a() {
        if (this.f46512a != null) {
            return this;
        }
        na.u uVar = this.f46517g;
        if (uVar != null) {
            return uVar;
        }
        na.u c3 = this.f46513b.c(this.d, this.f46514c);
        this.f46517g = c3;
        return c3;
    }

    @Override
    public final Object read(va.a aVar) {
        na.u uVar = this.f46517g;
        if (uVar == null) {
            uVar = this.f46513b.c(this.d, this.f46514c);
            this.f46517g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        na.o oVar = this.f46512a;
        if (oVar == null) {
            na.u uVar = this.f46517g;
            if (uVar == null) {
                uVar = this.f46513b.c(this.d, this.f46514c);
                this.f46517g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f46516f && obj == null) {
            bVar.i();
        } else {
            pa.d.l(oVar.serialize(obj, this.f46514c.f49164b, this.f46515e), bVar);
        }
    }
}
