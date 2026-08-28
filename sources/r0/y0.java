package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field f46962e = null;
    public static boolean f46963f = false;
    public static Constructor f46964g = null;
    public static boolean h = false;
    public WindowInsets f46965c;
    public i0.b d;

    public y0() {
        this.f46965c = i();
    }

    private static WindowInsets i() {
        if (!f46963f) {
            try {
                f46962e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f46963f = true;
        }
        Field field = f46962e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!h) {
            try {
                f46964g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f46964g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override
    public m1 b() {
        a();
        m1 h10 = m1.h(null, this.f46965c);
        i0.b[] bVarArr = this.f46881b;
        j1 j1Var = h10.f46929a;
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
        WindowInsets windowInsets = this.f46965c;
        if (windowInsets != null) {
            this.f46965c = windowInsets.replaceSystemWindowInsets(bVar.f10848a, bVar.f10849b, bVar.f10850c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f46965c = m1Var.g();
    }
}
