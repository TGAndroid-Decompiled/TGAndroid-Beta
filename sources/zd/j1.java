package zd;
public final class j1 extends kd.i implements rd.p {
    public o1 f59961b;
    public q f59962c;
    public int d;
    public Object f59963e;
    public final n1 f59964f;

    public j1(id.c cVar, n1 n1Var) {
        super(2, cVar);
        this.f59964f = n1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        j1 j1Var = new j1(cVar, this.f59964f);
        j1Var.f59963e = obj;
        return j1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.k.f13829a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: zd.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
