package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class x0 extends b1 {
    public static Field f45642e = null;
    public static boolean f45643f = false;
    public static Constructor f45644g = null;
    public static boolean h = false;
    public WindowInsets f45645c;
    public i0.b d;

    public x0() {
        this.f45645c = i();
    }

    private static WindowInsets i() {
        if (!f45643f) {
            try {
                f45642e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f45643f = true;
        }
        Field field = f45642e;
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
                f45644g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f45644g;
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
    public l1 b() {
        a();
        l1 h10 = l1.h(null, this.f45645c);
        i0.b[] bVarArr = this.f45563b;
        i1 i1Var = h10.f45609a;
        i1Var.q(bVarArr);
        i1Var.s(this.d);
        return h10;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f45645c;
        if (windowInsets != null) {
            this.f45645c = windowInsets.replaceSystemWindowInsets(bVar.f11525a, bVar.f11526b, bVar.f11527c, bVar.d);
        }
    }

    public x0(l1 l1Var) {
        super(l1Var);
        this.f45645c = l1Var.g();
    }
}
