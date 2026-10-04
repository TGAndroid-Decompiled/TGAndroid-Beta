package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements pa.b {
    public final int f44842a;
    public final Object f44843b;

    public c(Object obj, int i10) {
        this.f44842a = i10;
        this.f44843b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f44842a) {
            case 0:
                String str = (String) this.f44843b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(a4.a.p("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e10) {
                    throw new RuntimeException(a4.a.p("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(t8.b.i("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(t8.b.i("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f44843b;
            default:
                return new ra.c((k9.h) this.f44843b);
        }
    }
}
