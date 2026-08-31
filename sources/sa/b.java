package sa;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends pa.u {
    public static final a f47158c = new a();
    public final Class f47159a;
    public final o f47160b;

    public b(pa.g gVar, pa.u uVar, Class cls) {
        this.f47160b = new o(gVar, uVar, cls);
        this.f47159a = cls;
    }

    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((pa.u) this.f47160b.f47199c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f47159a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f47160b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
