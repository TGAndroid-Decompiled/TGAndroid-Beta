package q7;

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
        return o().listIterator(0);
    }

    @Override
    public final d0 k() {
        return o().listIterator(0);
    }

    @Override
    public final m p() {
        return new p(this);
    }

    @Override
    public final int size() {
        return this.d.d.size();
    }
}
