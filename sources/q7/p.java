package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f55462c;

    public p(q qVar) {
        this.f55462c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f55462c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f55466c.f55491f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f55462c.d.d.size();
    }
}
