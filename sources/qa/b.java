package qa;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends na.u {
    public static final a f46518c = new a();
    public final Class f46519a;
    public final o f46520b;

    public b(na.g gVar, na.u uVar, Class cls) {
        this.f46520b = new o(gVar, uVar, cls);
        this.f46519a = cls;
    }

    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((na.u) this.f46520b.f46559c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f46519a;
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
    public final void write(va.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f46520b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
