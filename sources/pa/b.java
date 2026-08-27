package pa;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class b extends ma.u {

    public static final a f45611c = new a();

    public final Class f45612a;

    public final o f45613b;

    public b(ma.g gVar, ma.u uVar, Class cls) {
        this.f45613b = new o(gVar, uVar, cls);
        this.f45612a = cls;
    }

    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((ma.u) this.f45613b.f45652c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f45612a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f45613b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
