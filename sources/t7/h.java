package t7;

import j$.util.Objects;
import java.util.AbstractMap;
import w7.l7;
public final class h extends d {
    public final i f43310c;

    public h(i iVar) {
        this.f43310c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f43310c;
        l7.a(i10, iVar.e);
        Object[] objArr = iVar.d;
        int i11 = i10 + i10;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f43310c.e;
    }
}
