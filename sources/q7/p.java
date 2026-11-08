package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f54014c;

    public p(q qVar) {
        this.f54014c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f54014c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f54018c.f54043f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f54014c.d.d.size();
    }
}
