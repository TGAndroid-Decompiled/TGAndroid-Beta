package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f46805e = null;
    public static boolean f46806f = false;
    public static Constructor f46807g = null;
    public static boolean h = false;
    public WindowInsets f46808c;
    public i0.b d;

    public w0() {
        this.f46808c = j();
    }

    private static WindowInsets j() {
        if (!f46806f) {
            try {
                f46805e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f46806f = true;
        }
        Field field = f46805e;
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
                f46807g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46807g;
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
        k1 h10 = k1.h(null, this.f46808c);
        i0.b[] bVarArr = this.f46727b;
        h1 h1Var = h10.f46775a;
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
        WindowInsets windowInsets = this.f46808c;
        if (windowInsets != null) {
            this.f46808c = windowInsets.replaceSystemWindowInsets(bVar.f11576a, bVar.f11577b, bVar.f11578c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f46808c = k1Var.g();
    }
}
