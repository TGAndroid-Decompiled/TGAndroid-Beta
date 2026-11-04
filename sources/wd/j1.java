package wd;
public final class j1 extends hd.i implements od.p {
    public o1 f57504b;
    public q f57505c;
    public int d;
    public Object f57506e;
    public final n1 f57507f;

    public j1(fd.c cVar, n1 n1Var) {
        super(2, cVar);
        this.f57507f = n1Var;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        j1 j1Var = new j1(cVar, this.f57507f);
        j1Var.f57506e = obj;
        return j1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((td.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: wd.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
