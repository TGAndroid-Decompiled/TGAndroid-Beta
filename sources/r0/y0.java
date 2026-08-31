package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class y0 extends c1 {
    public static Field f46485e = null;
    public static boolean f46486f = false;
    public static Constructor f46487g = null;
    public static boolean h = false;
    public WindowInsets f46488c;
    public i0.b d;

    public y0() {
        this.f46488c = i();
    }

    private static WindowInsets i() {
        if (!f46486f) {
            try {
                f46485e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f46486f = true;
        }
        Field field = f46485e;
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
                f46487g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46487g;
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
        m1 h9 = m1.h(null, this.f46488c);
        i0.b[] bVarArr = this.f46404b;
        j1 j1Var = h9.f46452a;
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
        WindowInsets windowInsets = this.f46488c;
        if (windowInsets != null) {
            this.f46488c = windowInsets.replaceSystemWindowInsets(bVar.f7757a, bVar.f7758b, bVar.f7759c, bVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f46488c = m1Var.g();
    }
}
