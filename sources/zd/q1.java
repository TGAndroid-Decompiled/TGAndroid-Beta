package zd;
public final class q1 extends kd.i implements rd.p {
    public v1 f53266b;
    public q f53267c;
    public int d;
    public Object f53268e;
    public final u1 f53269f;

    public q1(id.c cVar, u1 u1Var) {
        super(cVar);
        this.f53269f = u1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        q1 q1Var = new q1(cVar, this.f53269f);
        q1Var.f53268e = obj;
        return q1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.i.f10453a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: zd.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
