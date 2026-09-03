package u9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import q5.c0;
public final class c {
    public final String f48494a;
    public final Map f48495b;

    public c(String str, Map map) {
        this.f48494a = str;
        this.f48495b = map;
    }

    public static c0 a(String str) {
        return new c0(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f48495b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f48494a.equals(cVar.f48494a) && this.f48495b.equals(cVar.f48495b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48495b.hashCode() + (this.f48494a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f48494a + ", properties=" + this.f48495b.values() + "}";
    }
}
