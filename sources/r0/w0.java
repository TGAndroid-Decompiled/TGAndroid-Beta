package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f54139e = null;
    public static boolean f54140f = false;
    public static Constructor f54141g = null;
    public static boolean h = false;
    public WindowInsets f54142c;
    public i0.b d;

    public w0() {
        this.f54142c = j();
    }

    private static WindowInsets j() {
        if (!f54140f) {
            try {
                f54139e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f54140f = true;
        }
        Field field = f54139e;
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
                f54141g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f54141g;
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
        k1 h7 = k1.h(null, this.f54142c);
        i0.b[] bVarArr = this.f54066b;
        h1 h1Var = h7.f54108a;
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
        WindowInsets windowInsets = this.f54142c;
        if (windowInsets != null) {
            this.f54142c = windowInsets.replaceSystemWindowInsets(bVar.f15117a, bVar.f15118b, bVar.f15119c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f54142c = k1Var.g();
    }
}
