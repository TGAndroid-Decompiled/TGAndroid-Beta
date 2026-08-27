package y6;

import java.util.AbstractMap;

public final class p extends m {

    public final q f49766c;

    public p(q qVar) {
        this.f49766c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f49766c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f49770c.f49795f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f49766c.d.d.size();
    }
}
