package q7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f54026c;

    public p(q qVar) {
        this.f54026c = qVar;
    }

    @Override
    public final Object get(int i7) {
        q qVar = this.f54026c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f54030c.f54055f.get(i7), qVar.d.d.get(i7));
    }

    @Override
    public final int size() {
        return this.f54026c.d.d.size();
    }
}
