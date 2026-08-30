package ra;

import java.util.Map;
public final class k implements Map.Entry {
    public k f43417a;
    public k f43418b;
    public k f43419c;
    public k d;
    public k e;
    public final Object f43420f;
    public final boolean h;
    public Object f43421n;
    public int f43422r;

    public k(boolean z4) {
        this.f43420f = null;
        this.h = z4;
        this.e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f43420f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f43421n;
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
        return this.f43420f;
    }

    @Override
    public final Object getValue() {
        return this.f43421n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f43420f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f43421n;
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
        Object obj2 = this.f43421n;
        this.f43421n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f43420f + "=" + this.f43421n;
    }

    public k(boolean z4, k kVar, Object obj, k kVar2, k kVar3) {
        this.f43417a = kVar;
        this.f43420f = obj;
        this.h = z4;
        this.f43422r = 1;
        this.d = kVar2;
        this.e = kVar3;
        kVar3.d = this;
        kVar2.e = this;
    }
}
