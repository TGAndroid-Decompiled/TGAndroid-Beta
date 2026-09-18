package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field e = null;
    public static boolean f42138f = false;
    public static Constructor f42139g = null;
    public static boolean h = false;
    public WindowInsets f42140c;
    public i0.b d;

    public y0() {
        this.f42140c = i();
    }

    private static WindowInsets i() {
        if (!f42138f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f42138f = true;
        }
        Field field = e;
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
                f42139g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f42139g;
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
    public m1 b() {
        a();
        m1 h10 = m1.h(null, this.f42140c);
        i0.b[] bVarArr = this.f42068b;
        j1 j1Var = h10.f42109a;
        j1Var.q(bVarArr);
        j1Var.s(this.d);
        return h10;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f42140c;
        if (windowInsets != null) {
            this.f42140c = windowInsets.replaceSystemWindowInsets(bVar.f10591a, bVar.f10592b, bVar.f10593c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f42140c = m1Var.g();
    }
}
