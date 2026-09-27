package za;

import java.util.List;
import java.util.Map;
public final class e0 extends kd.j implements rd.p {
    public g0 f49081a;
    public b0 f49082b;
    public k9.h f49083c;
    public z d;
    public bb.h e;
    public p f49084f;
    public List h;
    public Map f49085n;
    public int f49086r;
    public final g0 f49087s;
    public final z v;

    public e0(g0 g0Var, z zVar, id.c cVar) {
        super(2, cVar);
        this.f49087s = g0Var;
        this.v = zVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new e0(this.f49087s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9608a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
