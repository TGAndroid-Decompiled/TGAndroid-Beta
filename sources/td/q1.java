package td;
public final class q1 extends ed.i implements ld.p {
    public v1 f48665b;
    public q f48666c;
    public int d;
    public Object e;
    public final u1 f48667f;

    public q1(cd.c cVar, u1 u1Var) {
        super(cVar);
        this.f48667f = u1Var;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        q1 q1Var = new q1(cVar, this.f48667f);
        q1Var.e = obj;
        return q1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((qd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: td.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
