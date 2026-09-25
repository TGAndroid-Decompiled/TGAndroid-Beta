package v7;

import java.util.AbstractMap;
public final class l9 extends i9 {
    public final a f44329c;

    public l9(a aVar) {
        this.f44329c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f44329c;
        w7.x7.a(i10, aVar.e);
        int i11 = i10 + i10;
        Object[] objArr = aVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f44329c.e;
    }
}
