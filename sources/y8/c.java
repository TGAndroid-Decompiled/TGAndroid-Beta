package y8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements x9.b {
    public final int f49627a;
    public final Object f49628b;

    public c(Object obj, int i9) {
        this.f49627a = i9;
        this.f49628b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f49627a) {
            case 0:
                String str = (String) this.f49628b;
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
                    throw new RuntimeException(aa.d.o("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(aa.d.o("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(ta.b.d("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(ta.b.d("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f49628b;
            default:
                return new z9.b((s8.h) this.f49628b);
        }
    }
}
