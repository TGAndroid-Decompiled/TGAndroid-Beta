package z8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

public final class c implements y9.b {

    public final int f50224a;

    public final Object f50225b;

    public c(Object obj, int i10) {
        this.f50224a = i10;
        this.f50225b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f50224a) {
            case 0:
                String str = (String) this.f50225b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e9) {
                    throw new l(a9.p.m("Could not instantiate ", str, "."), e9);
                } catch (InstantiationException e10) {
                    throw new l(a9.p.m("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new l(s3.c.e("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new l(s3.c.e("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f50225b;
            default:
                return new aa.c((t8.h) this.f50225b);
        }
    }
}
