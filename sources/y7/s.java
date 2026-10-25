package y7;

import java.util.AbstractMap;
public final class s extends n {
    public final t f52284c;

    public s(t tVar) {
        this.f52284c = tVar;
    }

    @Override
    public final Object get(int i10) {
        t tVar = this.f52284c;
        w7.h5.a(i10, tVar.e);
        int i11 = i10 + i10;
        Object[] objArr = tVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f52284c.e;
    }
}
