package sa;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends pa.u {
    public final int f44174a = 0;
    public final Object f44175b;
    public final Object f44176c;

    public c(pa.g gVar, Type type, pa.u uVar, ra.m mVar) {
        this.f44175b = new o(gVar, uVar, type);
        this.f44176c = mVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f44174a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((ra.m) this.f44176c).s2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((pa.u) ((o) this.f44175b).f44211c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f44175b;
                Object read = ((x0) this.f44176c).f44236c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        switch (this.f44174a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f44175b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f44176c).f44236c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f44176c = x0Var;
        this.f44175b = cls;
    }
}
