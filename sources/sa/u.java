package sa;

import java.lang.reflect.Field;
import vh.v2;
public final class u extends t {
    public final ra.m f44225b;

    public u(ra.m mVar, v vVar) {
        super(vVar);
        this.f44225b = mVar;
    }

    @Override
    public final Object a() {
        return this.f44225b.s2();
    }

    @Override
    public final void c(Object obj, xa.a aVar, s sVar) {
        Field field = sVar.f44220b;
        Object read = sVar.f44222f.read(aVar);
        if (read == null && sVar.f44223g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(v2.e("Cannot set value of 'static final' ", ua.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
