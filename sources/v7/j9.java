package v7;

import java.util.AbstractMap;
public final class j9 extends g9 {
    public final a f50501c;

    public j9(a aVar) {
        this.f50501c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f50501c;
        w7.h8.a(i10, aVar.e);
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
        return this.f50501c.e;
    }
}
