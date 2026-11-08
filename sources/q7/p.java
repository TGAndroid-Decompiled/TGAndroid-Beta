package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f54013c;

    public p(q qVar) {
        this.f54013c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f54013c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f54017c.f54042f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f54013c.d.d.size();
    }
}
