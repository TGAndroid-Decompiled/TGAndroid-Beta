package pa;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

public final class c extends ma.u {

    public final int f45614a = 0;

    public final Object f45615b;

    public final Object f45616c;

    public c(ma.g gVar, Type type, ma.u uVar, oa.m mVar) {
        this.f45615b = new o(gVar, uVar, type);
        this.f45616c = mVar;
    }

    @Override
    public final Object read(ua.a aVar) {
        switch (this.f45614a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((oa.m) this.f45616c).f2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((ma.u) ((o) this.f45615b).f45652c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.f45615b;
                Object obj = ((x0) this.f45616c).f45679c.read(aVar);
                if (obj == null || cls.isInstance(obj)) {
                    return obj;
                }
                throw new ma.j("Expected a " + cls.getName() + " but was " + obj.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        switch (this.f45614a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((o) this.f45615b).write(bVar, it.next());
                    }
                    bVar.e();
                } else {
                    bVar.i();
                }
                break;
            default:
                ((x0) this.f45616c).f45679c.write(bVar, obj);
                break;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.f45616c = x0Var;
        this.f45615b = cls;
    }
}
