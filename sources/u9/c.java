package u9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import q5.c0;
public final class c {
    public final String f45261a;
    public final Map f45262b;

    public c(String str, Map map) {
        this.f45261a = str;
        this.f45262b = map;
    }

    public static c0 a(String str) {
        return new c0(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f45262b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45261a.equals(cVar.f45261a) && this.f45262b.equals(cVar.f45262b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45262b.hashCode() + (this.f45261a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f45261a + ", properties=" + this.f45262b.values() + "}";
    }
}
