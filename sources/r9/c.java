package r9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import org.telegram.ui.i6;

public final class c {

    public final String f46877a;

    public final Map f46878b;

    public c(String str, Map map) {
        this.f46877a = str;
        this.f46878b = map;
    }

    public static i6 a(String str) {
        return new i6(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f46878b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f46877a.equals(cVar.f46877a) && this.f46878b.equals(cVar.f46878b);
    }

    public final int hashCode() {
        return this.f46878b.hashCode() + (this.f46877a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f46877a + ", properties=" + this.f46878b.values() + "}";
    }
}
