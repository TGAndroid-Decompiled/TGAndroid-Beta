package qa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f46567a;
    public final Field f46568b;
    public final String f46569c;
    public final Method d;
    public final na.u f46570e;
    public final na.u f46571f;
    public final boolean f46572g;
    public final boolean h;

    public s(String str, Field field, Method method, na.u uVar, na.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f46570e = uVar;
        this.f46571f = uVar2;
        this.f46572g = z10;
        this.h = z11;
        this.f46567a = str;
        this.f46568b = field;
        this.f46569c = field.getName();
    }

    public final void a(va.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(a4.w.n("Accessor ", sa.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = this.f46568b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f46567a);
        this.f46570e.write(bVar, obj2);
    }
}
