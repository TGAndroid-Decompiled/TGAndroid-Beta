package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class x0 extends b1 {
    public static Field f44773e = null;
    public static boolean f44774f = false;
    public static Constructor f44775g = null;
    public static boolean h = false;
    public WindowInsets f44776c;
    public i0.c d;

    public x0() {
        this.f44776c = i();
    }

    private static WindowInsets i() {
        if (!f44774f) {
            try {
                f44773e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f44774f = true;
        }
        Field field = f44773e;
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
                f44775g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f44775g;
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
        l1 h10 = l1.h(null, this.f44776c);
        i0.c[] cVarArr = this.f44694b;
        i1 i1Var = h10.f44740a;
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
        WindowInsets windowInsets = this.f44776c;
        if (windowInsets != null) {
            this.f44776c = windowInsets.replaceSystemWindowInsets(cVar.f11451a, cVar.f11452b, cVar.f11453c, cVar.d);
        }
    }

    public x0(l1 l1Var) {
        super(l1Var);
        this.f44776c = l1Var.g();
    }
}
