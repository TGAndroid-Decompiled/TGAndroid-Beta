package x6;

import java.util.AbstractMap;
public final class p extends m {
    public final q f49049c;

    public p(q qVar) {
        this.f49049c = qVar;
    }

    @Override
    public final Object get(int i9) {
        q qVar = this.f49049c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f49053c.f49078f.get(i9), qVar.d.d.get(i9));
    }

    @Override
    public final int size() {
        return this.f49049c.d.d.size();
    }
}
