package y7;

import c8.xd;
import java.util.AbstractMap;
public final class o9 extends l9 {
    public final a f59031c;

    public o9(a aVar) {
        this.f59031c = aVar;
    }

    @Override
    public final Object get(int i7) {
        a aVar = this.f59031c;
        xd.a(i7, aVar.f58881e);
        int i10 = i7 + i7;
        Object[] objArr = aVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f59031c.f58881e;
    }
}
