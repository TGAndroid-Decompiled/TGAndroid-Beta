package t7;

import j$.util.Objects;
import java.util.AbstractMap;
import w7.m7;
public final class h extends d {
    public final i f46911c;

    public h(i iVar) {
        this.f46911c = iVar;
    }

    @Override
    public final Object get(int i10) {
        i iVar = this.f46911c;
        m7.a(i10, iVar.f46913e);
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
        return this.f46911c.f46913e;
    }
}
