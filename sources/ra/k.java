package ra;

import java.util.Map;
public final class k implements Map.Entry {
    public k f46770a;
    public k f46771b;
    public k f46772c;
    public k d;
    public k f46773e;
    public final Object f46774f;
    public final boolean h;
    public Object f46775n;
    public int f46776r;

    public k(boolean z4) {
        this.f46774f = null;
        this.h = z4;
        this.f46773e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f46774f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f46775n;
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
        return this.f46774f;
    }

    @Override
    public final Object getValue() {
        return this.f46775n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f46774f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f46775n;
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
        Object obj2 = this.f46775n;
        this.f46775n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f46774f + "=" + this.f46775n;
    }

    public k(boolean z4, k kVar, Object obj, k kVar2, k kVar3) {
        this.f46770a = kVar;
        this.f46774f = obj;
        this.h = z4;
        this.f46776r = 1;
        this.d = kVar2;
        this.f46773e = kVar3;
        kVar3.d = this;
        kVar2.f46773e = this;
    }
}
