package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f55713e = null;
    public static boolean f55714f = false;
    public static Constructor f55715g = null;
    public static boolean h = false;
    public WindowInsets f55716c;
    public i0.c d;

    public w0() {
        this.f55716c = j();
    }

    private static WindowInsets j() {
        if (!f55714f) {
            try {
                f55713e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f55714f = true;
        }
        Field field = f55713e;
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
                f55715g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f55715g;
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
        k1 h7 = k1.h(null, this.f55716c);
        i0.c[] cVarArr = this.f55640b;
        h1 h1Var = h7.f55682a;
        h1Var.q(cVarArr);
        h1Var.s(this.d);
        return h7;
    }

    @Override
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.f55716c;
        if (windowInsets != null) {
            this.f55716c = windowInsets.replaceSystemWindowInsets(cVar.f15574a, cVar.f15575b, cVar.f15576c, cVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f55716c = k1Var.g();
    }
}
