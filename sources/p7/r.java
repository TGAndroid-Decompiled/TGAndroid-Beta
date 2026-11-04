package p7;

import java.util.Iterator;
import java.util.Map;
public final class r extends p {
    public final s d;

    public r(s sVar) {
        this.d = sVar;
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
    public final e0 k() {
        return o().listIterator(0);
    }

    @Override
    public final n p() {
        return new q(this);
    }

    @Override
    public final int size() {
        return this.d.d.size();
    }
}
