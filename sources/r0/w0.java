package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f54232e = null;
    public static boolean f54233f = false;
    public static Constructor f54234g = null;
    public static boolean h = false;
    public WindowInsets f54235c;
    public i0.b d;

    public w0() {
        this.f54235c = j();
    }

    private static WindowInsets j() {
        if (!f54233f) {
            try {
                f54232e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f54233f = true;
        }
        Field field = f54232e;
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
                f54234g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f54234g;
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
        k1 h7 = k1.h(null, this.f54235c);
        i0.b[] bVarArr = this.f54159b;
        h1 h1Var = h7.f54201a;
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
        WindowInsets windowInsets = this.f54235c;
        if (windowInsets != null) {
            this.f54235c = windowInsets.replaceSystemWindowInsets(bVar.f15120a, bVar.f15121b, bVar.f15122c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f54235c = k1Var.g();
    }
}
