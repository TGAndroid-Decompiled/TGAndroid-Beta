package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f54057e = null;
    public static boolean f54058f = false;
    public static Constructor f54059g = null;
    public static boolean h = false;
    public WindowInsets f54060c;
    public i0.b d;

    public w0() {
        this.f54060c = j();
    }

    private static WindowInsets j() {
        if (!f54058f) {
            try {
                f54057e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f54058f = true;
        }
        Field field = f54057e;
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
                f54059g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f54059g;
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
        k1 h7 = k1.h(null, this.f54060c);
        i0.b[] bVarArr = this.f53984b;
        h1 h1Var = h7.f54026a;
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
        WindowInsets windowInsets = this.f54060c;
        if (windowInsets != null) {
            this.f54060c = windowInsets.replaceSystemWindowInsets(bVar.f14495a, bVar.f14496b, bVar.f14497c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f54060c = k1Var.g();
    }
}
