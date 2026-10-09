package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import sc.v;
public final class c implements pa.b {
    public final int f46011a;
    public final Object f46012b;

    public c(Object obj, int i10) {
        this.f46011a = i10;
        this.f46012b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f46011a) {
            case 0:
                String str = (String) this.f46012b;
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
                    throw new RuntimeException(a1.g.q("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e10) {
                    throw new RuntimeException(a1.g.q("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(v.i("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(v.i("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f46012b;
            default:
                return new ra.c((k9.h) this.f46012b);
        }
    }
}
