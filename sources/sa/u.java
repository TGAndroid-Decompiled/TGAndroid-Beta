package sa;

import java.lang.reflect.Field;
import vh.w2;
public final class u extends t {
    public final ra.m f44290b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.f44290b = mVar;
    }

    @Override
    public final Object a() {
        return this.f44290b.u2();
    }

    @Override
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.f44285b;
        Object read = sVar.f44287f.read(aVar);
        if (read == null && sVar.f44288g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(w2.e("Cannot set value of 'static final' ", ua.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
