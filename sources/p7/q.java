package p7;

import java.util.AbstractMap;
public final class q extends n {
    public final r f53396c;

    public q(r rVar) {
        this.f53396c = rVar;
    }

    @Override
    public final Object get(int i3) {
        r rVar = this.f53396c;
        return new AbstractMap.SimpleImmutableEntry(rVar.d.f53400c.f53338f.get(i3), rVar.d.d.get(i3));
    }

    @Override
    public final int size() {
        return this.f53396c.d.d.size();
    }
}
