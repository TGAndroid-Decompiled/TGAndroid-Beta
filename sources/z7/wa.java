package z7;

import c8.le;
import java.util.AbstractMap;
public final class wa extends ta {
    public final xa f61789c;

    public wa(xa xaVar) {
        this.f61789c = xaVar;
    }

    @Override
    public final Object get(int i7) {
        xa xaVar = this.f61789c;
        le.a(i7, xaVar.f61796e);
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
        return this.f61789c.f61796e;
    }
}
