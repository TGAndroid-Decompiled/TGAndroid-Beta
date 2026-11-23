package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f56081c;

    public p(q qVar) {
        this.f56081c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f56081c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f56085c.f56110f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f56081c.d.d.size();
    }
}
