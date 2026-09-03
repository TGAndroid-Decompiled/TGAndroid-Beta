package sa;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends pa.u {
    public final int f47192a = 0;
    public final Object f47193b;
    public final Object f47194c;

    public c(pa.g gVar, Type type, pa.u uVar, ra.m mVar) {
        this.f47193b = new o(gVar, uVar, type);
        this.f47194c = mVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f47192a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((ra.m) this.f47194c).y2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((pa.u) ((o) this.f47193b).f47230c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f47193b;
                Object read = ((x0) this.f47194c).f47257c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        switch (this.f47192a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f47193b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f47194c).f47257c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f47194c = x0Var;
        this.f47193b = cls;
    }
}
