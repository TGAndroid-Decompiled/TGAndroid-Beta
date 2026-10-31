package r9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements qa.b {
    public final int f46425a;
    public final Object f46426b;

    public c(Object obj, int i10) {
        this.f46425a = i10;
        this.f46426b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f46425a) {
            case 0:
                String str = (String) this.f46426b;
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
                    throw new RuntimeException(a1.g.n("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(a1.g.n("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(sc.e.h("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(sc.e.h("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f46426b;
            default:
                return new sa.b((l9.h) this.f46426b);
        }
    }
}
