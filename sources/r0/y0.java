package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field f46876e = null;
    public static boolean f46877f = false;
    public static Constructor f46878g = null;
    public static boolean h = false;
    public WindowInsets f46879c;
    public i0.b d;

    public y0() {
        this.f46879c = i();
    }

    private static WindowInsets i() {
        if (!f46877f) {
            try {
                f46876e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f46877f = true;
        }
        Field field = f46876e;
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
                f46878g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f46878g;
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
        m1 h10 = m1.h(null, this.f46879c);
        i0.b[] bVarArr = this.f46795b;
        j1 j1Var = h10.f46843a;
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
        WindowInsets windowInsets = this.f46879c;
        if (windowInsets != null) {
            this.f46879c = windowInsets.replaceSystemWindowInsets(bVar.f8186a, bVar.f8187b, bVar.f8188c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f46879c = m1Var.g();
    }
}
