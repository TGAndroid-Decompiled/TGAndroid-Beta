package sa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f44219a;
    public final Field f44220b;
    public final String f44221c;
    public final Method d;
    public final pa.u e;
    public final pa.u f44222f;
    public final boolean f44223g;
    public final boolean h;

    public s(String str, Field field, Method method, pa.u uVar, pa.u uVar2, boolean z4, boolean z10) {
        this.d = method;
        this.e = uVar;
        this.f44222f = uVar2;
        this.f44223g = z4;
        this.h = z10;
        this.f44219a = str;
        this.f44220b = field;
        this.f44221c = field.getName();
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
            obj2 = this.f44220b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f44219a);
        this.e.write(bVar, obj2);
    }
}
