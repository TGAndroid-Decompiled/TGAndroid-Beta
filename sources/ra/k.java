package ra;

import java.util.Map;
public final class k implements Map.Entry {
    public k f43441a;
    public k f43442b;
    public k f43443c;
    public k d;
    public k e;
    public final Object f43444f;
    public final boolean h;
    public Object f43445n;
    public int f43446r;

    public k(boolean z4) {
        this.f43444f = null;
        this.h = z4;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f43444f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f43445n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f43444f;
    }

    @Override
    public final Object getValue() {
        return this.f43445n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f43444f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f43445n;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f43445n;
        this.f43445n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f43444f + "=" + this.f43445n;
    }

    public k(boolean z4, k kVar, Object obj, k kVar2, k kVar3) {
        this.f43441a = kVar;
        this.f43444f = obj;
        this.h = z4;
        this.f43446r = 1;
        this.d = kVar2;
        this.e = kVar3;
        kVar3.d = this;
        kVar2.e = this;
    }
}
