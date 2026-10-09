package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f46807e = null;
    public static boolean f46808f = false;
    public static Constructor f46809g = null;
    public static boolean h = false;
    public WindowInsets f46810c;
    public i0.b d;

    public w0() {
        this.f46810c = j();
    }

    private static WindowInsets j() {
        if (!f46808f) {
            try {
                f46807e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f46808f = true;
        }
        Field field = f46807e;
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
                f46809g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46809g;
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
        k1 h10 = k1.h(null, this.f46810c);
        i0.b[] bVarArr = this.f46729b;
        h1 h1Var = h10.f46777a;
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
        WindowInsets windowInsets = this.f46810c;
        if (windowInsets != null) {
            this.f46810c = windowInsets.replaceSystemWindowInsets(bVar.f11576a, bVar.f11577b, bVar.f11578c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f46810c = k1Var.g();
    }
}
