package sa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f47238a;
    public final Field f47239b;
    public final String f47240c;
    public final Method d;
    public final pa.u f47241e;
    public final pa.u f47242f;
    public final boolean f47243g;
    public final boolean h;

    public s(String str, Field field, Method method, pa.u uVar, pa.u uVar2, boolean z4, boolean z10) {
        this.d = method;
        this.f47241e = uVar;
        this.f47242f = uVar2;
        this.f47243g = z4;
        this.h = z10;
        this.f47238a = str;
        this.f47239b = field;
        this.f47240c = field.getName();
    }

    public final void a(xa.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(android.support.v4.media.a.o("Accessor ", ua.c.d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            obj2 = this.f47239b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f47238a);
        this.f47241e.write(bVar, obj2);
    }
}
