package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field e = null;
    public static boolean f43182f = false;
    public static Constructor f43183g = null;
    public static boolean h = false;
    public WindowInsets f43184c;
    public i0.b d;

    public y0() {
        this.f43184c = i();
    }

    private static WindowInsets i() {
        if (!f43182f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f43182f = true;
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
                f43183g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f43183g;
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
        m1 h9 = m1.h(null, this.f43184c);
        i0.b[] bVarArr = this.f43111b;
        j1 j1Var = h9.f43154a;
        j1Var.q(bVarArr);
        j1Var.s(this.d);
        return h9;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f43184c;
        if (windowInsets != null) {
            this.f43184c = windowInsets.replaceSystemWindowInsets(bVar.f7196a, bVar.f7197b, bVar.f7198c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f43184c = m1Var.g();
    }
}
