package sa;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends pa.u {
    public static final a f47189c = new a();
    public final Class f47190a;
    public final o f47191b;

    public b(pa.g gVar, pa.u uVar, Class cls) {
        this.f47191b = new o(gVar, uVar, cls);
        this.f47190a = cls;
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
            arrayList.add(((pa.u) this.f47191b.f47230c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f47190a;
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
            this.f47191b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
