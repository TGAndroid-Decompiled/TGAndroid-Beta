package rh;

import org.telegram.messenger.r20;
public final class m1 implements r20 {
    public final int f47208a;
    public final e4 f47209b;
    public final Long f47210c;
    public final mg.i2[] d;

    public m1(e4 e4Var, Long l4, mg.i2[] i2VarArr, int i10) {
        this.f47208a = i10;
        this.f47209b = e4Var;
        this.f47210c = l4;
        this.d = i2VarArr;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47208a) {
            case 0:
                gf.e eVar = (gf.e) obj;
                eVar.d();
                long longValue = this.f47210c.longValue();
                e4 e4Var = this.f47209b;
                e4Var.s1(longValue, new kg.d0(e4Var, eVar, this.d, 8));
                return;
            default:
                e4 e4Var2 = this.f47209b;
                e4Var2.getClass();
                e4Var2.r1(this.f47210c.longValue(), null, (gf.e) obj, this.d[0]);
                return;
        }
    }
}
