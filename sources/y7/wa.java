package y7;

import java.util.AbstractMap;
public final class wa extends ta {
    public final xa f59300c;

    public wa(xa xaVar) {
        this.f59300c = xaVar;
    }

    @Override
    public final Object get(int i3) {
        xa xaVar = this.f59300c;
        x7.h6.a(i3, xaVar.f59307e);
        Object[] objArr = xaVar.d;
        int i10 = i3 + i3;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f59300c.f59307e;
    }
}
