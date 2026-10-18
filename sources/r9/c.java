package r9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements qa.b {
    public final int f45123a;
    public final Object f45124b;

    public c(Object obj, int i10) {
        this.f45123a = i10;
        this.f45124b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f45123a) {
            case 0:
                String str = (String) this.f45124b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(a1.g.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(a1.g.p("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(r4.c.h("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(r4.c.h("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f45124b;
            default:
                return new sa.b((l9.h) this.f45124b);
        }
    }
}
