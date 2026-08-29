package pa;

import java.util.Map;
public final class k implements Map.Entry {
    public k f45690a;
    public k f45691b;
    public k f45692c;
    public k d;
    public k f45693e;
    public final Object f45694f;
    public final boolean h;
    public Object f45695n;
    public int f45696r;

    public k(boolean z10) {
        this.f45694f = null;
        this.h = z10;
        this.f45693e = this;
        this.d = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f45694f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f45695n;
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
        return this.f45694f;
    }

    @Override
    public final Object getValue() {
        return this.f45695n;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f45694f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f45695n;
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
        Object obj2 = this.f45695n;
        this.f45695n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f45694f + "=" + this.f45695n;
    }

    public k(boolean z10, k kVar, Object obj, k kVar2, k kVar3) {
        this.f45690a = kVar;
        this.f45694f = obj;
        this.h = z10;
        this.f45696r = 1;
        this.d = kVar2;
        this.f45693e = kVar3;
        kVar3.d = this;
        kVar2.f45693e = this;
    }
}
