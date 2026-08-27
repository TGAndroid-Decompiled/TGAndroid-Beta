package pa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class s {

    public final String f45660a;

    public final Field f45661b;

    public final String f45662c;
    public final Method d;

    public final ma.u f45663e;

    public final ma.u f45664f;

    public final boolean f45665g;
    public final boolean h;

    public s(String str, Field field, Method method, ma.u uVar, ma.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f45663e = uVar;
        this.f45664f = uVar2;
        this.f45665g = z10;
        this.h = z11;
        this.f45660a = str;
        this.f45661b = field;
        this.f45662c = field.getName();
    }

    public final void a(ua.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e9) {
                throw new ma.j(a9.p.m("Accessor ", ra.c.d(method, false), " threw exception"), e9.getCause());
            }
        } else {
            objInvoke = this.f45661b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.g(this.f45660a);
        this.f45663e.write(bVar, objInvoke);
    }
}
