package sa;

import org.telegram.ui.Components.zz;
public final class a0 extends y {
    public final pa.o f44231a;
    public final pa.g f44232b;
    public final wa.a f44233c;
    public final pa.v d;
    public final zz e = new zz(this, 14);
    public final boolean f44234f;
    public volatile pa.u f44235g;

    public a0(pa.o oVar, pa.g gVar, wa.a aVar, pa.v vVar, boolean z4) {
        this.f44231a = oVar;
        this.f44232b = gVar;
        this.f44233c = aVar;
        this.d = vVar;
        this.f44234f = z4;
    }

    @Override
    public final pa.u a() {
        if (this.f44231a != null) {
            return this;
        }
        pa.u uVar = this.f44235g;
        if (uVar != null) {
            return uVar;
        }
        pa.u c3 = this.f44232b.c(this.d, this.f44233c);
        this.f44235g = c3;
        return c3;
    }

    @Override
    public final Object read(xa.a aVar) {
        pa.u uVar = this.f44235g;
        if (uVar == null) {
            uVar = this.f44232b.c(this.d, this.f44233c);
            this.f44235g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        pa.o oVar = this.f44231a;
        if (oVar == null) {
            pa.u uVar = this.f44235g;
            if (uVar == null) {
                uVar = this.f44232b.c(this.d, this.f44233c);
                this.f44235g = uVar;
            }
            uVar.write(bVar, obj);
        } else if (this.f44234f && obj == null) {
            bVar.i();
        } else {
            ra.d.l(oVar.serialize(obj, this.f44233c.f46588b, this.e), bVar);
        }
    }
}
