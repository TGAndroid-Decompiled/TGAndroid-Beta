package v7;

import java.util.AbstractMap;
public final class k9 extends h9 {
    public final a f47541c;

    public k9(a aVar) {
        this.f47541c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f47541c;
        w7.w7.a(i10, aVar.f47399e);
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
        return this.f47541c.f47399e;
    }
}
