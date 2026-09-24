package za;

import java.util.List;
import java.util.Map;
public final class g0 extends kd.j implements rd.p {
    public i0 f49038a;
    public d0 f49039b;
    public k9.h f49040c;
    public b0 d;
    public bb.h e;
    public r f49041f;
    public List h;
    public Map f49042n;
    public int f49043r;
    public final i0 f49044s;
    public final b0 v;

    public g0(i0 i0Var, b0 b0Var, id.c cVar) {
        super(2, cVar);
        this.f49044s = i0Var;
        this.v = b0Var;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        return new g0(this.f49044s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((zd.c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9602a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
