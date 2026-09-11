package q9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.Cells.p6;
public final class c implements pa.b {
    public final int f44215a;
    public final Object f44216b;

    public c(Object obj, int i10) {
        this.f44215a = i10;
        this.f44216b = obj;
    }

    @Override
    public final Object get() {
        switch (this.f44215a) {
            case 0:
                String str = (String) this.f44216b;
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
                    throw new RuntimeException(p6.i("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(p6.i("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f44216b;
            default:
                return new ra.c((k9.h) this.f44216b);
        }
    }
}
