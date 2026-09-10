package x7;

import java.util.Map;
public abstract class d implements Map.Entry {
    public final int f44718a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.f44718a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!w7.l8.a(getKey(), entry.getKey()) || !w7.l8.a(getValue(), entry.getValue())) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!w7.i9.a(getKey(), entry2.getKey()) || !w7.i9.a(getValue(), entry2.getValue())) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f44718a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                int i10 = 0;
                if (key == null) {
                    hashCode = 0;
                } else {
                    hashCode = key.hashCode();
                }
                if (value != null) {
                    i10 = value.hashCode();
                }
                return hashCode ^ i10;
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                int i11 = 0;
                if (key2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = key2.hashCode();
                }
                if (value2 != null) {
                    i11 = value2.hashCode();
                }
                return hashCode2 ^ i11;
        }
    }

    public final String toString() {
        switch (this.f44718a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return a4.a.C(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public d(int i10, boolean z10) {
        this.f44718a = i10;
    }
}
