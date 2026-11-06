package z7;

import c8.ie;
import java.util.AbstractMap;
public final class wa extends ta {
    public final xa f59876c;

    public wa(xa xaVar) {
        this.f59876c = xaVar;
    }

    @Override
    public final Object get(int i7) {
        xa xaVar = this.f59876c;
        ie.a(i7, xaVar.f59883e);
        Object[] objArr = xaVar.d;
        int i10 = i7 + i7;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f59876c.f59883e;
    }
}
