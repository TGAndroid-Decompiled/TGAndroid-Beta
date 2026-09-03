package sa;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends pa.u {
    public final int f44239a = 0;
    public final Object f44240b;
    public final Object f44241c;

    public c(pa.g gVar, Type type, pa.u uVar, ra.m mVar) {
        this.f44240b = new o(gVar, uVar, type);
        this.f44241c = mVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f44239a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((ra.m) this.f44241c).u2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((pa.u) ((o) this.f44240b).f44276c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f44240b;
                Object read = ((x0) this.f44241c).f44301c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        switch (this.f44239a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f44240b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f44241c).f44301c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f44241c = x0Var;
        this.f44240b = cls;
    }
}
