package sa;

import java.lang.reflect.Field;
import org.telegram.ui.yh;
public final class u extends t {
    public final ra.m f47245b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.f47245b = mVar;
    }

    @Override
    public final Object a() {
        return this.f47245b.y2();
    }

    @Override
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.f47239b;
        Object read = sVar.f47242f.read(aVar);
        if (read == null && sVar.f47243g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(yh.k("Cannot set value of 'static final' ", ua.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
