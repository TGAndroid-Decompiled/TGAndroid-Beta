package w7;

import java.util.AbstractMap;
public final class n9 extends k9 {
    public final a f50940c;

    public n9(a aVar) {
        this.f50940c = aVar;
    }

    @Override
    public final Object get(int i10) {
        a aVar = this.f50940c;
        y.a(i10, aVar.e);
        int i11 = i10 + i10;
        Object[] objArr = aVar.d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f50940c.e;
    }
}
