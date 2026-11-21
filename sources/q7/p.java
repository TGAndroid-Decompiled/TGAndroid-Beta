package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f56077c;

    public p(q qVar) {
        this.f56077c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f56077c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f56081c.f56106f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f56077c.d.d.size();
    }
}
