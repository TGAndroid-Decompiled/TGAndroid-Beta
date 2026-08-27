package pa;

import java.lang.reflect.Field;

public final class u extends t {

    public final oa.m f45667b;

    public u(oa.m mVar, v vVar) {
        super(vVar);
        this.f45667b = mVar;
    }

    @Override
    public final Object a() {
        return this.f45667b.f2();
    }

    @Override
    public final void c(Object obj, ua.a aVar, s sVar) throws IllegalAccessException {
        Field field = sVar.f45661b;
        Object obj2 = sVar.f45664f.read(aVar);
        if (obj2 == null && sVar.f45665g) {
            return;
        }
        if (sVar.h) {
            throw new ma.j(s3.c.e("Cannot set value of 'static final' ", ra.c.d(field, false)));
        }
        field.set(obj, obj2);
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
