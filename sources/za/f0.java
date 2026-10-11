package za;

import java.util.List;
import java.util.Map;
public final class f0 extends ld.j implements sd.p {
    public h0 f54340a;
    public c0 f54341b;
    public k9.h f54342c;
    public a0 d;
    public bb.h f54343e;
    public q f54344f;
    public List h;
    public Map f54345n;
    public int f54346r;
    public final h0 f54347s;
    public final a0 v;

    public f0(h0 h0Var, a0 a0Var, jd.c cVar) {
        super(2, cVar);
        this.f54347s = h0Var;
        this.v = a0Var;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        return new f0(this.f54347s, this.v, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ae.d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: za.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
