package x7;

import java.util.AbstractMap;
public final class t extends o {
    public final u f49666c;

    public t(u uVar) {
        this.f49666c = uVar;
    }

    @Override
    public final Object get(int i10) {
        u uVar = this.f49666c;
        w7.o8.a(i10, uVar.f49676e);
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
        return this.f49666c.f49676e;
    }
}
