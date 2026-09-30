package w7;

import java.util.AbstractMap;
public final class va extends sa {
    public final wa f45242c;

    public va(wa waVar) {
        this.f45242c = waVar;
    }

    @Override
    public final Object get(int i10) {
        wa waVar = this.f45242c;
        b8.a(i10, waVar.e);
        Object[] objArr = waVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f45242c.e;
    }
}
