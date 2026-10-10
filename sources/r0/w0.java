package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f46851e = null;
    public static boolean f46852f = false;
    public static Constructor f46853g = null;
    public static boolean h = false;
    public WindowInsets f46854c;
    public i0.b d;

    public w0() {
        this.f46854c = j();
    }

    private static WindowInsets j() {
        if (!f46852f) {
            try {
                f46851e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f46852f = true;
        }
        Field field = f46851e;
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
                f46853g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46853g;
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
    public k1 b() {
        a();
        k1 h10 = k1.h(null, this.f46854c);
        i0.b[] bVarArr = this.f46773b;
        h1 h1Var = h10.f46821a;
        h1Var.q(bVarArr);
        h1Var.s(this.d);
        return h10;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f46854c;
        if (windowInsets != null) {
            this.f46854c = windowInsets.replaceSystemWindowInsets(bVar.f11576a, bVar.f11577b, bVar.f11578c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f46854c = k1Var.g();
    }
}
