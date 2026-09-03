package sa;

import java.util.Map;
import k7.a8;
public abstract class t extends pa.u {
    public final v f44289a;

    public t(v vVar) {
        this.f44289a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, xa.a aVar, s sVar);

    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object a2 = a();
        Map map = this.f44289a.f44292a;
        try {
            aVar.b();
            while (aVar.k()) {
                s sVar = (s) map.get(aVar.r());
                if (sVar == null) {
                    aVar.C();
                } else {
                    c(a2, aVar, sVar);
                }
            }
            aVar.f();
            return b(a2);
        } catch (IllegalAccessException e) {
            a8 a8Var = ua.c.f45266a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.c();
        try {
            for (s sVar : this.f44289a.f44293b) {
                sVar.a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e) {
            a8 a8Var = ua.c.f45266a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
