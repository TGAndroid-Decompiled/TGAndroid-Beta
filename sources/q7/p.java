package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f53896c;

    public p(q qVar) {
        this.f53896c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f53896c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f53900c.f53925f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f53896c.d.d.size();
    }
}
