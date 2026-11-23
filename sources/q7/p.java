package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f56159c;

    public p(q qVar) {
        this.f56159c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f56159c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f56163c.f56188f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f56159c.d.d.size();
    }
}
