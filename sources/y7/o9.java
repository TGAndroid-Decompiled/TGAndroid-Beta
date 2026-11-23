package y7;

import c8.ge;
import java.util.AbstractMap;
public final class o9 extends l9 {
    public final a f61037c;

    public o9(a aVar) {
        this.f61037c = aVar;
    }

    @Override
    public final Object get(int i7) {
        a aVar = this.f61037c;
        ge.a(i7, aVar.f60890e);
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
        return this.f61037c.f60890e;
    }
}
