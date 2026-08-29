package q8;

import i7.o6;
import java.util.Map;
public abstract class j implements Map.Entry {
    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (o6.a(getKey(), entry.getKey()) && o6.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
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
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
