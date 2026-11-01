package t7;

import android.content.Context;
import java.util.ArrayList;
import v7.u8;
import v7.v8;
import v7.x8;
import w7.ga;
import w7.ia;
import w7.ja;
import x7.ca;
import x7.da;
import z7.tf;
import z7.vf;
import z7.xf;
public final class r extends b2.h {
    public final int f48567b;

    public r(int i10) {
        super(3);
        this.f48567b = i10;
    }

    @Override
    public final Object Q0(Object obj) {
        switch (this.f48567b) {
            case 0:
                jb.g c10 = jb.g.c();
                Context b10 = jb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                u uVar = new u(20);
                j5.a aVar = j5.a.e;
                l5.s.b(b10);
                l5.s.a().c(aVar);
                j5.a.d.contains(new i5.c("json"));
                arrayList.add(uVar);
                return new q(c10.b(), (jb.k) c10.a(jb.k.class));
            case 1:
                u8 u8Var = (u8) obj;
                jb.g c11 = jb.g.c();
                return new x8(c11.b(), (jb.k) c11.a(jb.k.class), new v8(jb.g.c().b(), u8Var), u8Var.f50634a);
            case 2:
                jb.g c12 = jb.g.c();
                return new ja(c12.b(), (jb.k) c12.a(jb.k.class), new ia(jb.g.c().b(), (ga) obj));
            case 3:
                jb.g c13 = jb.g.c();
                return new x7.ga(c13.b(), (jb.k) c13.a(jb.k.class), new da(jb.g.c().b(), (ca) obj));
            default:
                jb.g c14 = jb.g.c();
                return new xf(c14.b(), (jb.k) c14.a(jb.k.class), new vf(jb.g.c().b(), (tf) obj));
        }
    }
}
