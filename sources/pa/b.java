package pa;

import j$.util.Objects;
import java.lang.reflect.Field;
public final class b {
    public final Field f41071a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f41071a = field;
    }

    public final String toString() {
        return this.f41071a.toString();
    }
}
