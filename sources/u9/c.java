package u9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import q5.g0;
public final class c {
    public final String f48458a;
    public final Map f48459b;

    public c(String str, Map map) {
        this.f48458a = str;
        this.f48459b = map;
    }

    public static g0 a(String str) {
        return new g0(str, 10);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f48459b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f48458a.equals(cVar.f48458a) && this.f48459b.equals(cVar.f48459b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48459b.hashCode() + (this.f48458a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f48458a + ", properties=" + this.f48459b.values() + "}";
    }
}
