package u9;

import a8.p0;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
public final class c implements ua.b {
    public final int f56458a;
    public final Object f56459b;

    public c(Object obj, int i7) {
        this.f56458a = i7;
        this.f56459b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f56458a) {
            case 0:
                String str = (String) this.f56459b;
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
                    throw new RuntimeException(p0.p("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(p0.p("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(rf.b.i("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(rf.b.i("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f56459b;
            default:
                return new wa.c((o9.g) this.f56459b);
        }
    }
}
