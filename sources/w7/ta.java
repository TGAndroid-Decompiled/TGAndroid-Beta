package w7;

import java.util.AbstractMap;
public final class ta extends qa {
    public final ua f52721c;

    public ta(ua uaVar) {
        this.f52721c = uaVar;
    }

    @Override
    public final Object get(int i10) {
        ua uaVar = this.f52721c;
        n8.a(i10, uaVar.e);
        Object[] objArr = uaVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f52721c.e;
    }
}
