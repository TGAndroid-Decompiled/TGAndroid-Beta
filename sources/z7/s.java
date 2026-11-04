package z7;

import java.util.AbstractMap;
public final class s extends n {
    public final t f60028c;

    public s(t tVar) {
        this.f60028c = tVar;
    }

    @Override
    public final Object get(int i3) {
        t tVar = this.f60028c;
        x7.x6.a(i3, tVar.f60040e);
        int i10 = i3 + i3;
        Object[] objArr = tVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f60028c.f60040e;
    }
}
