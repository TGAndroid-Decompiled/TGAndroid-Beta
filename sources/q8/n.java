package q8;

import i7.o6;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class n extends AbstractSet {
    public final int f46466a;
    public final p f46467b;

    public n(p pVar, int i10) {
        this.f46466a = i10;
        this.f46467b = pVar;
    }

    @Override
    public final void clear() {
        switch (this.f46466a) {
            case 0:
                this.f46467b.clear();
                return;
            default:
                this.f46467b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f46466a) {
            case 0:
                p pVar = this.f46467b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = pVar.d(entry.getKey());
                    if (d != -1 && o6.a(pVar.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f46467b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f46466a) {
            case 0:
                p pVar = this.f46467b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new m(pVar, 1);
            default:
                p pVar2 = this.f46467b;
                Map b11 = pVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new m(pVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f46466a) {
            case 0:
                p pVar = this.f46467b;
                Map b10 = pVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!pVar.f()) {
                        int c3 = pVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = pVar.f46475a;
                        Objects.requireNonNull(obj2);
                        int m10 = l.m(key, value, c3, obj2, pVar.h(), pVar.i(), pVar.j());
                        if (m10 != -1) {
                            pVar.e(m10, c3);
                            pVar.f46479f--;
                            pVar.f46478e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                p pVar2 = this.f46467b;
                Map b11 = pVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (pVar2.g(obj) != p.f46474s) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int size() {
        switch (this.f46466a) {
            case 0:
                return this.f46467b.size();
            default:
                return this.f46467b.size();
        }
    }
}
