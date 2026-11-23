package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f56046c;

    public p(q qVar) {
        this.f56046c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f56046c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f56050c.f56075f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f56046c.d.d.size();
    }
}
