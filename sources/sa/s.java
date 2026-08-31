package sa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f47207a;
    public final Field f47208b;
    public final String f47209c;
    public final Method d;
    public final pa.u f47210e;
    public final pa.u f47211f;
    public final boolean f47212g;
    public final boolean h;

    public s(String str, Field field, Method method, pa.u uVar, pa.u uVar2, boolean z4, boolean z10) {
        this.d = method;
        this.f47210e = uVar;
        this.f47211f = uVar2;
        this.f47212g = z4;
        this.h = z10;
        this.f47207a = str;
        this.f47208b = field;
        this.f47209c = field.getName();
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
            obj2 = this.f47208b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f47207a);
        this.f47210e.write(bVar, obj2);
    }
}
