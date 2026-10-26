package x7;

import java.util.AbstractMap;
public final class wa extends ta {
    public final xa f51661c;

    public wa(xa xaVar) {
        this.f51661c = xaVar;
    }

    @Override
    public final Object get(int i10) {
        xa xaVar = this.f51661c;
        w7.b0.a(i10, xaVar.e);
        Object[] objArr = xaVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f51661c.e;
    }
}
