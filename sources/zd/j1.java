package zd;
public final class j1 extends kd.i implements rd.p {
    public o1 f61857b;
    public q f61858c;
    public int d;
    public Object f61859e;
    public final n1 f61860f;

    public j1(id.c cVar, n1 n1Var) {
        super(2, cVar);
        this.f61860f = n1Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        j1 j1Var = new j1(cVar, this.f61860f);
        j1Var.f61859e = obj;
        return j1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.k.f13488a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: zd.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
