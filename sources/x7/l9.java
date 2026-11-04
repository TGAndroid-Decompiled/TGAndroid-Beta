package x7;

import java.util.AbstractMap;
public final class l9 extends i9 {
    public final a f58364c;

    public l9(a aVar) {
        this.f58364c = aVar;
    }

    @Override
    public final Object get(int i3) {
        a aVar = this.f58364c;
        w5.a(i3, aVar.f58229e);
        int i10 = i3 + i3;
        Object[] objArr = aVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f58364c.f58229e;
    }
}
