package qa;

import i7.r7;
import java.util.Map;
public abstract class t extends na.u {
    public final v f46573a;

    public t(v vVar) {
        this.f46573a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, va.a aVar, s sVar);

    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object a2 = a();
        Map map = this.f46573a.f46576a;
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
        } catch (IllegalAccessException e10) {
            r7 r7Var = sa.c.f47694a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.c();
        try {
            for (s sVar : this.f46573a.f46577b) {
                sVar.a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e10) {
            r7 r7Var = sa.c.f47694a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }
}
