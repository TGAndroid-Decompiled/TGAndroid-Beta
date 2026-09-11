package z7;

import java.util.AbstractMap;
public final class n extends i {
    public final o f51173c;

    public n(o oVar) {
        this.f51173c = oVar;
    }

    @Override
    public final Object get(int i10) {
        o oVar = this.f51173c;
        w7.j9.a(i10, oVar.f51182e);
        Object[] objArr = oVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f51173c.f51182e;
    }
}
