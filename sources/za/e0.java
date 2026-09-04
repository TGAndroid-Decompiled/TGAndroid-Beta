package za;

import java.util.List;
import java.util.Map;
public final class e0 extends kd.j implements rd.p {
    public g0 f51406a;
    public b0 f51407b;
    public k9.h f51408c;
    public z d;
    public bb.i f51409e;
    public p f51410f;
    public List h;
    public Map f51411n;
    public int f51412r;
    public final g0 f51413s;
    public final z v;

    public e0(g0 g0Var, z zVar, id.c cVar) {
        super(2, cVar);
        this.f51413s = g0Var;
        this.v = zVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new e0(this.f51413s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10588a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
