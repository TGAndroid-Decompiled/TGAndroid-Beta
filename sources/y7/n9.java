package y7;

import c8.fe;
import java.util.AbstractMap;
public final class n9 extends k9 {
    public final a f60946c;

    public n9(a aVar) {
        this.f60946c = aVar;
    }

    @Override
    public final Object get(int i7) {
        a aVar = this.f60946c;
        fe.a(i7, aVar.f60803e);
        int i10 = i7 + i7;
        Object[] objArr = aVar.d;
        Object obj = objArr[i10];
        obj.getClass();
        Object obj2 = objArr[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.f60946c.f60803e;
    }
}
