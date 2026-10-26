package u7;

import j$.util.Objects;
import java.util.AbstractMap;
public final class h extends d {
    public final i f49603c;

    public h(i iVar) {
        this.f49603c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f49603c;
        w7.m.a(i10, iVar.e);
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
        return this.f49603c.e;
    }
}
