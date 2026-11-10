package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f54244e = null;
    public static boolean f54245f = false;
    public static Constructor f54246g = null;
    public static boolean h = false;
    public WindowInsets f54247c;
    public i0.b d;

    public w0() {
        this.f54247c = j();
    }

    private static WindowInsets j() {
        if (!f54245f) {
            try {
                f54244e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f54245f = true;
        }
        Field field = f54244e;
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
                f54246g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f54246g;
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
    public k1 b() {
        a();
        k1 h7 = k1.h(null, this.f54247c);
        i0.b[] bVarArr = this.f54171b;
        h1 h1Var = h7.f54213a;
        h1Var.q(bVarArr);
        h1Var.s(this.d);
        return h7;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f54247c;
        if (windowInsets != null) {
            this.f54247c = windowInsets.replaceSystemWindowInsets(bVar.f15122a, bVar.f15123b, bVar.f15124c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f54247c = k1Var.g();
    }
}
