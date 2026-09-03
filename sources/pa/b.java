package pa;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f41094a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f41094a = field;
    }

    public final String toString() {
        return this.f41094a.toString();
    }
}
