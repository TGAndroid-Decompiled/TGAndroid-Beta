package v7;

import j$.util.Objects;
import java.util.AbstractMap;
import x7.j5;
public final class h extends d {
    public final i f56459c;

    public h(i iVar) {
        this.f56459c = iVar;
    }

    @Override
    public final Object get(int i3) {
        i iVar = this.f56459c;
        j5.a(i3, iVar.f56461e);
        Object[] objArr = iVar.d;
        int i10 = i3 + i3;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f56459c.f56461e;
    }
}
