package pa;

public final class a0 extends y {

    public final ma.o f45605a;

    public final ma.g f45606b;

    public final ta.a f45607c;
    public final ma.v d;

    public final m5.o f45608e = new m5.o(this, 14);

    public final boolean f45609f;

    public volatile ma.u f45610g;

    public a0(ma.o oVar, ma.g gVar, ta.a aVar, ma.v vVar, boolean z10) {
        this.f45605a = oVar;
        this.f45606b = gVar;
        this.f45607c = aVar;
        this.d = vVar;
        this.f45609f = z10;
    }

    @Override
    public final ma.u a() {
        if (this.f45605a != null) {
            return this;
        }
        ma.u uVar = this.f45610g;
        if (uVar != null) {
            return uVar;
        }
        ma.u uVarC = this.f45606b.c(this.d, this.f45607c);
        this.f45610g = uVarC;
        return uVarC;
    }

    @Override
    public final Object read(ua.a aVar) {
        ma.u uVarC = this.f45610g;
        if (uVarC == null) {
            uVarC = this.f45606b.c(this.d, this.f45607c);
            this.f45610g = uVarC;
        }
        return uVarC.read(aVar);
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        ma.o oVar = this.f45605a;
        if (oVar == null) {
            ma.u uVarC = this.f45610g;
            if (uVarC == null) {
                uVarC = this.f45606b.c(this.d, this.f45607c);
                this.f45610g = uVarC;
            }
            uVarC.write(bVar, obj);
            return;
        }
        if (this.f45609f && obj == null) {
            bVar.i();
        } else {
            oa.d.l(oVar.serialize(obj, this.f45607c.f48152b, this.f45608e), bVar);
        }
    }
}
