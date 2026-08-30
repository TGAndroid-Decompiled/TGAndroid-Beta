package u9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import q5.g0;
public final class c {
    public final String f45199a;
    public final Map f45200b;

    public c(String str, Map map) {
        this.f45199a = str;
        this.f45200b = map;
    }

    public static g0 a(String str) {
        return new g0(str, 10);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f45200b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45199a.equals(cVar.f45199a) && this.f45200b.equals(cVar.f45200b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45200b.hashCode() + (this.f45199a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f45199a + ", properties=" + this.f45200b.values() + "}";
    }
}
