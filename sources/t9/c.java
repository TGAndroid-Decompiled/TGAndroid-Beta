package t9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements ta.b {
    public final int f55047a;
    public final Object f55048b;

    public c(Object obj, int i3) {
        this.f55047a = i3;
        this.f55048b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f55047a) {
            case 0:
                String str = (String) this.f55048b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(a1.g.q("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(a1.g.q("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(t4.c.f("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(t4.c.f("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f55048b;
            default:
                return new va.c((n9.h) this.f55048b);
        }
    }
}
