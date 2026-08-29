package z6;

import java.util.AbstractMap;
public final class p extends m {
    public final q f50749c;

    public p(q qVar) {
        this.f50749c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f50749c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f50753c.f50778f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f50749c.d.d.size();
    }
}
