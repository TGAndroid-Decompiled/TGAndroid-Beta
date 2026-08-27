package pa;

import h7.w6;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public abstract class t extends ma.u {

    public final v f45666a;

    public t(v vVar) {
        this.f45666a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, ua.a aVar, s sVar);

    @Override
    public final Object read(ua.a aVar) throws IOException {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object objA = a();
        Map map = this.f45666a.f45669a;
        try {
            aVar.b();
            while (aVar.k()) {
                s sVar = (s) map.get(aVar.r());
                if (sVar == null) {
                    aVar.C();
                } else {
                    c(objA, aVar, sVar);
                }
            }
            aVar.f();
            return b(objA);
        } catch (IllegalAccessException e9) {
            w6 w6Var = ra.c.f46882a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (IllegalStateException e10) {
            throw new ma.j(e10);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.c();
        try {
            Iterator it = this.f45666a.f45670b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e9) {
            w6 w6Var = ra.c.f46882a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        }
    }
}
