package z6;

import java.util.Iterator;
import java.util.Map;
public final class q extends o {
    public final r d;

    public q(r rVar) {
        this.d = rVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return a.b(this.d.entrySet());
    }

    @Override
    public final Iterator iterator() {
        return t().listIterator(0);
    }

    @Override
    public final d0 p() {
        return t().listIterator(0);
    }

    @Override
    public final int size() {
        return this.d.d.size();
    }

    @Override
    public final m u() {
        return new p(this);
    }
}
