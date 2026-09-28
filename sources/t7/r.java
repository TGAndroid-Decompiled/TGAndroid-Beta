package t7;

import android.content.Context;
import java.util.ArrayList;
import v7.w8;
import v7.x8;
import v7.z8;
import w7.ia;
import w7.ka;
import w7.la;
import x7.ba;
import x7.ca;
import x7.fa;
import z7.sf;
import z7.uf;
import z7.wf;
public final class r extends b2.g {
    public final int f43321b;

    public r(int i10) {
        super(4);
        this.f43321b = i10;
    }

    @Override
    public final Object N0(Object obj) {
        switch (this.f43321b) {
            case 0:
                qb.g c10 = qb.g.c();
                Context b10 = qb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                qb.b bVar = new qb.b(22);
                j5.a aVar = j5.a.e;
                l5.s.b(b10);
                l5.s.a().c(aVar);
                j5.a.d.contains(new i5.c("json"));
                arrayList.add(bVar);
                return new q(c10.b(), (qb.k) c10.a(qb.k.class));
            case 1:
                w8 w8Var = (w8) obj;
                qb.g c11 = qb.g.c();
                return new z8(c11.b(), (qb.k) c11.a(qb.k.class), new x8(qb.g.c().b(), w8Var), w8Var.f44414a);
            case 2:
                qb.g c12 = qb.g.c();
                return new la(c12.b(), (qb.k) c12.a(qb.k.class), new ka(qb.g.c().b(), (ia) obj));
            case 3:
                qb.g c13 = qb.g.c();
                return new fa(c13.b(), (qb.k) c13.a(qb.k.class), new ca(qb.g.c().b(), (ba) obj));
            default:
                qb.g c14 = qb.g.c();
                return new wf(c14.b(), (qb.k) c14.a(qb.k.class), new uf(qb.g.c().b(), (sf) obj));
        }
    }
}
