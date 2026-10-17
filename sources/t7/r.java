package t7;

import ai.c1;
import android.content.Context;
import java.util.ArrayList;
import v7.v8;
import v7.w8;
import v7.y8;
import w7.ia;
import w7.ka;
import w7.la;
import x7.ba;
import x7.ca;
import x7.fa;
import z7.uf;
import z7.wf;
import z7.yf;
public final class r extends c1 {
    public final int f46923b;

    public r(int i10) {
        super(6);
        this.f46923b = i10;
    }

    @Override
    public final Object Q0(Object obj) {
        switch (this.f46923b) {
            case 0:
                rb.g c10 = rb.g.c();
                Context b10 = rb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                u uVar = new u(22);
                j5.a aVar = j5.a.e;
                l5.t.b(b10);
                l5.t.a().c(aVar);
                j5.a.d.contains(new i5.c("json"));
                arrayList.add(uVar);
                return new q(c10.b(), (rb.k) c10.a(rb.k.class));
            case 1:
                v8 v8Var = (v8) obj;
                rb.g c11 = rb.g.c();
                return new y8(c11.b(), (rb.k) c11.a(rb.k.class), new w8(rb.g.c().b(), v8Var), v8Var.f48185a);
            case 2:
                rb.g c12 = rb.g.c();
                return new la(c12.b(), (rb.k) c12.a(rb.k.class), new ka(rb.g.c().b(), (ia) obj));
            case 3:
                rb.g c13 = rb.g.c();
                return new fa(c13.b(), (rb.k) c13.a(rb.k.class), new ca(rb.g.c().b(), (ba) obj));
            default:
                rb.g c14 = rb.g.c();
                return new yf(c14.b(), (rb.k) c14.a(rb.k.class), new wf(rb.g.c().b(), (uf) obj));
        }
    }
}
