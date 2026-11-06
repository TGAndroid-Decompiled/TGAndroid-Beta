package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f54115e = null;
    public static boolean f54116f = false;
    public static Constructor f54117g = null;
    public static boolean h = false;
    public WindowInsets f54118c;
    public i0.b d;

    public w0() {
        this.f54118c = j();
    }

    private static WindowInsets j() {
        if (!f54116f) {
            try {
                f54115e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f54116f = true;
        }
        Field field = f54115e;
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
                f54117g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f54117g;
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
        k1 h7 = k1.h(null, this.f54118c);
        i0.b[] bVarArr = this.f54042b;
        h1 h1Var = h7.f54084a;
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
        WindowInsets windowInsets = this.f54118c;
        if (windowInsets != null) {
            this.f54118c = windowInsets.replaceSystemWindowInsets(bVar.f15117a, bVar.f15118b, bVar.f15119c, bVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.f54118c = k1Var.g();
    }
}
