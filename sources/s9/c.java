package s9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import oc.i;
public final class c {
    public final String f47689a;
    public final Map f47690b;

    public c(String str, Map map) {
        this.f47689a = str;
        this.f47690b = map;
    }

    public static i a(String str) {
        return new i(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f47690b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f47689a.equals(cVar.f47689a) && this.f47690b.equals(cVar.f47690b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47690b.hashCode() + (this.f47689a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f47689a + ", properties=" + this.f47690b.values() + "}";
    }
}
