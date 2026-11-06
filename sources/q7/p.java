package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f53921c;

    public p(q qVar) {
        this.f53921c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f53921c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f53925c.f53950f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f53921c.d.d.size();
    }
}
