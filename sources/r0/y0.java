package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field f46516e = null;
    public static boolean f46517f = false;
    public static Constructor f46518g = null;
    public static boolean h = false;
    public WindowInsets f46519c;
    public i0.b d;

    public y0() {
        this.f46519c = i();
    }

    private static WindowInsets i() {
        if (!f46517f) {
            try {
                f46516e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f46517f = true;
        }
        Field field = f46516e;
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
                f46518g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46518g;
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
        m1 h9 = m1.h(null, this.f46519c);
        i0.b[] bVarArr = this.f46435b;
        j1 j1Var = h9.f46483a;
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
        WindowInsets windowInsets = this.f46519c;
        if (windowInsets != null) {
            this.f46519c = windowInsets.replaceSystemWindowInsets(bVar.f7757a, bVar.f7758b, bVar.f7759c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f46519c = m1Var.g();
    }
}
