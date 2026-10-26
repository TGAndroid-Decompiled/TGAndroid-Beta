package s9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.Components.b10;
public final class c implements ra.b {
    public final int f47988a;
    public final Object f47989b;

    public c(Object obj, int i10) {
        this.f47988a = i10;
        this.f47989b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f47988a) {
            case 0:
                String str = (String) this.f47989b;
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
                } catch (InstantiationException e10) {
                    throw new RuntimeException(a1.g.p("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(b10.j("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(b10.j("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f47989b;
            default:
                return new ta.b((m9.h) this.f47989b);
        }
    }
}
