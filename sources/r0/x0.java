package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class x0 extends b1 {
    public static Field f44744e = null;
    public static boolean f44745f = false;
    public static Constructor f44746g = null;
    public static boolean h = false;
    public WindowInsets f44747c;
    public i0.c d;

    public x0() {
        this.f44747c = i();
    }

    private static WindowInsets i() {
        if (!f44745f) {
            try {
                f44744e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f44745f = true;
        }
        Field field = f44744e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!h) {
            try {
                f44746g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f44746g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override
    public l1 b() {
        a();
        l1 h10 = l1.h(null, this.f44747c);
        i0.c[] cVarArr = this.f44665b;
        i1 i1Var = h10.f44711a;
        i1Var.q(cVarArr);
        i1Var.s(this.d);
        return h10;
    }

    @Override
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.f44747c;
        if (windowInsets != null) {
            this.f44747c = windowInsets.replaceSystemWindowInsets(cVar.f11425a, cVar.f11426b, cVar.f11427c, cVar.d);
        }
    }

    public x0(l1 l1Var) {
        super(l1Var);
        this.f44747c = l1Var.g();
    }
}
