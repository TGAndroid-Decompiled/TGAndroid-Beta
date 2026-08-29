package qa;

import java.lang.reflect.Field;
public final class u extends t {
    public final pa.m f46574b;

    public u(pa.m mVar, v vVar) {
        super(vVar);
        this.f46574b = mVar;
    }

    @Override
    public final Object a() {
        return this.f46574b.p2();
    }

    @Override
    public final void c(Object obj, va.a aVar, s sVar) {
        Field field = sVar.f46568b;
        Object read = sVar.f46571f.read(aVar);
        if (read == null && sVar.f46572g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(u3.c.e("Cannot set value of 'static final' ", sa.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
