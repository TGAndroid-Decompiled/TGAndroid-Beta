package sa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f44284a;
    public final Field f44285b;
    public final String f44286c;
    public final Method d;
    public final pa.u e;
    public final pa.u f44287f;
    public final boolean f44288g;
    public final boolean h;

    public s(String str, Field field, Method method, pa.u uVar, pa.u uVar2, boolean z4, boolean z10) {
        this.d = method;
        this.e = uVar;
        this.f44287f = uVar2;
        this.f44288g = z4;
        this.h = z10;
        this.f44284a = str;
        this.f44285b = field;
        this.f44286c = field.getName();
    }

    public final void a(xa.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(android.support.v4.media.a.o("Accessor ", ua.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.f44285b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f44284a);
        this.e.write(bVar, obj2);
    }
}
