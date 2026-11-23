package w7;

import c8.jd;
import j$.util.Objects;
import java.util.AbstractMap;
public final class h extends d {
    public final i f59620c;

    public h(i iVar) {
        this.f59620c = iVar;
    }

    @Override
    public final Object get(int i7) {
        i iVar = this.f59620c;
        jd.a(i7, iVar.f59622e);
        Object[] objArr = iVar.d;
        int i10 = i7 + i7;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f59620c.f59622e;
    }
}
