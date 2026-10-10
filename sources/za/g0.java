package za;

import java.util.List;
import java.util.Map;
public final class g0 extends ld.j implements sd.p {
    public i0 f54269a;
    public d0 f54270b;
    public k9.h f54271c;
    public b0 d;
    public bb.h f54272e;
    public q f54273f;
    public List h;
    public Map f54274n;
    public int f54275r;
    public final i0 f54276s;
    public final b0 v;

    public g0(i0 i0Var, b0 b0Var, jd.c cVar) {
        super(2, cVar);
        this.f54276s = i0Var;
        this.v = b0Var;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        return new g0(this.f54276s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ae.d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
