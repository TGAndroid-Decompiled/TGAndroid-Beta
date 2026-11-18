package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f56036c;

    public p(q qVar) {
        this.f56036c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f56036c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f56040c.f56065f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f56036c.d.d.size();
    }
}
