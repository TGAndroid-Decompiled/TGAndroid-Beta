package pa;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f44260a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f44260a = field;
    }

    public final String toString() {
        return this.f44260a.toString();
    }
}
