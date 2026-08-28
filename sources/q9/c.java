package q9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import org.telegram.ui.Cells.e3;
public final class c {
    public final String f46118a;
    public final Map f46119b;

    public c(String str, Map map) {
        this.f46118a = str;
        this.f46119b = map;
    }

    public static e3 a(String str) {
        return new e3(str);
    }

    public static c c(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.f46119b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f46118a.equals(cVar.f46118a) && this.f46119b.equals(cVar.f46119b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46119b.hashCode() + (this.f46118a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f46118a + ", properties=" + this.f46119b.values() + "}";
    }
}
