package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class v0 extends z0 {
    public static Field e = null;
    public static boolean f46168f = false;
    public static Constructor f46169g = null;
    public static boolean h = false;
    public WindowInsets f46170c;
    public i0.c d;

    public v0() {
        this.f46170c = j();
    }

    private static WindowInsets j() {
        if (!f46168f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f46168f = true;
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
                f46169g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46169g;
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
    public j1 b() {
        a();
        j1 h10 = j1.h(null, this.f46170c);
        i0.c[] cVarArr = this.f46177b;
        g1 g1Var = h10.f46143a;
        g1Var.q(cVarArr);
        g1Var.s(this.d);
        return h10;
    }

    @Override
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.f46170c;
        if (windowInsets != null) {
            this.f46170c = windowInsets.replaceSystemWindowInsets(cVar.f7766a, cVar.f7767b, cVar.f7768c, cVar.d);
        }
    }

    public v0(j1 j1Var) {
        super(j1Var);
        this.f46170c = j1Var.g();
    }
}
