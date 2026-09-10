package v7;

import java.util.AbstractMap;
public final class k9 extends h9 {
    public final a f43053c;

    public k9(a aVar) {
        this.f43053c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f43053c;
        w7.w7.a(i10, aVar.e);
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
        return this.f43053c.e;
    }
}
