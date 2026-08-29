package qa;

import java.lang.reflect.Type;
import java.util.Collection;
public final class c extends na.u {
    public final int f46521a = 0;
    public final Object f46522b;
    public final Object f46523c;

    public c(na.g gVar, Type type, na.u uVar, pa.m mVar) {
        this.f46522b = new o(gVar, uVar, type);
        this.f46523c = mVar;
    }

    @Override
    public final Object read(va.a aVar) {
        switch (this.f46521a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((pa.m) this.f46523c).p2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((na.u) ((o) this.f46522b).f46559c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f46522b;
                Object read = ((x0) this.f46523c).f46586c.read(aVar);
                if (read != null && !cls.isInstance(read)) {
                    throw new RuntimeException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
                }
                return read;
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        switch (this.f46521a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.i();
                    return;
                }
                bVar.b();
                for (Object obj2 : collection) {
                    ((o) this.f46522b).write(bVar, obj2);
                }
                bVar.e();
                return;
            default:
                ((x0) this.f46523c).f46586c.write(bVar, obj);
                return;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f46523c = x0Var;
        this.f46522b = cls;
    }
}
