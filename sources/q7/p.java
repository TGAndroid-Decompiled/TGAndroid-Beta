package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f53920c;

    public p(q qVar) {
        this.f53920c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f53920c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f53924c.f53949f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f53920c.d.d.size();
    }
}
