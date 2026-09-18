package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements pa.b {
    public final int f41440a;
    public final Object f41441b;

    public c(Object obj, int i10) {
        this.f41440a = i10;
        this.f41441b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f41440a) {
            case 0:
                String str = (String) this.f41441b;
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
                    throw new RuntimeException(a4.a.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(a4.a.p("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(t8.b.i("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(t8.b.i("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f41441b;
            default:
                return new ra.c((k9.h) this.f41441b);
        }
    }
}
