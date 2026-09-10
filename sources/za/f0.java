package za;

import java.util.List;
import java.util.Map;
public final class f0 extends kd.j implements rd.p {
    public h0 f47888a;
    public c0 f47889b;
    public k9.h f47890c;
    public a0 d;
    public bb.h e;
    public p f47891f;
    public List h;
    public Map f47892n;
    public int f47893r;
    public final h0 f47894s;
    public final a0 v;

    public f0(h0 h0Var, a0 a0Var, id.c cVar) {
        super(2, cVar);
        this.f47894s = h0Var;
        this.v = a0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new f0(this.f47894s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f8748a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
