package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements pa.b {
    public final int f41468a;
    public final Object f41469b;

    public c(Object obj, int i10) {
        this.f41468a = i10;
        this.f41469b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f41468a) {
            case 0:
                String str = (String) this.f41469b;
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
                    throw new RuntimeException(a4.a.q("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(a4.a.q("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(v7.j.g("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(v7.j.g("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f41469b;
            default:
                return new ra.c((k9.h) this.f41469b);
        }
    }
}
