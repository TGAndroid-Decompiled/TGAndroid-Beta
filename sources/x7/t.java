package x7;

import java.util.AbstractMap;
public final class t extends o {
    public final u f44925c;

    public t(u uVar) {
        this.f44925c = uVar;
    }

    @Override
    public final Object get(int i10) {
        u uVar = this.f44925c;
        w7.m8.a(i10, uVar.e);
        int i11 = i10 + i10;
        Object[] objArr = uVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f44925c.e;
    }
}
