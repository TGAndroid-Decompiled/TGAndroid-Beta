package za;

import java.util.List;
import java.util.Map;
public final class e0 extends kd.j implements rd.p {
    public g0 f49065a;
    public b0 f49066b;
    public k9.h f49067c;
    public z d;
    public bb.h e;
    public p f49068f;
    public List h;
    public Map f49069n;
    public int f49070r;
    public final g0 f49071s;
    public final z v;

    public e0(g0 g0Var, z zVar, id.c cVar) {
        super(2, cVar);
        this.f49071s = g0Var;
        this.v = zVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new e0(this.f49071s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9621a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
