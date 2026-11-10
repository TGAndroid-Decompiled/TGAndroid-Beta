package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f54025c;

    public p(q qVar) {
        this.f54025c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f54025c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f54029c.f54054f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f54025c.d.d.size();
    }
}
