package rh;

import org.telegram.messenger.q20;
public final class m1 implements q20 {
    public final int f47194a;
    public final e4 f47195b;
    public final Long f47196c;
    public final mg.i2[] d;

    public m1(e4 e4Var, Long l4, mg.i2[] i2VarArr, int i10) {
        this.f47194a = i10;
        this.f47195b = e4Var;
        this.f47196c = l4;
        this.d = i2VarArr;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47194a) {
            case 0:
                gf.e eVar = (gf.e) obj;
                eVar.d();
                long longValue = this.f47196c.longValue();
                e4 e4Var = this.f47195b;
                e4Var.s1(longValue, new kg.d0(e4Var, eVar, this.d, 8));
                return;
            default:
                e4 e4Var2 = this.f47195b;
                e4Var2.getClass();
                e4Var2.r1(this.f47196c.longValue(), null, (gf.e) obj, this.d[0]);
                return;
        }
    }
}
