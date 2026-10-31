package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class v0 extends z0 {
    public static Field e = null;
    public static boolean f46157f = false;
    public static Constructor f46158g = null;
    public static boolean h = false;
    public WindowInsets f46159c;
    public i0.c d;

    public v0() {
        this.f46159c = j();
    }

    private static WindowInsets j() {
        if (!f46157f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f46157f = true;
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
                f46158g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46158g;
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
        j1 h10 = j1.h(null, this.f46159c);
        i0.c[] cVarArr = this.f46166b;
        g1 g1Var = h10.f46132a;
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
        WindowInsets windowInsets = this.f46159c;
        if (windowInsets != null) {
            this.f46159c = windowInsets.replaceSystemWindowInsets(cVar.f7765a, cVar.f7766b, cVar.f7767c, cVar.d);
        }
    }

    public v0(j1 j1Var) {
        super(j1Var);
        this.f46159c = j1Var.g();
    }
}
