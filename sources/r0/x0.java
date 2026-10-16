package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class x0 extends b1 {
    public static Field e = null;
    public static boolean f43523f = false;
    public static Constructor f43524g = null;
    public static boolean h = false;
    public WindowInsets f43525c;
    public i0.b d;

    public x0() {
        this.f43525c = j();
    }

    private static WindowInsets j() {
        if (!f43523f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f43523f = true;
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
                f43524g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f43524g;
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
        l1 h10 = l1.h(null, this.f43525c);
        i0.b[] bVarArr = this.f43456b;
        i1 i1Var = h10.f43497a;
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
        WindowInsets windowInsets = this.f43525c;
        if (windowInsets != null) {
            this.f43525c = windowInsets.replaceSystemWindowInsets(bVar.f10892a, bVar.f10893b, bVar.f10894c, bVar.d);
        }
    }

    public x0(l1 l1Var) {
        super(l1Var);
        this.f43525c = l1Var.g();
    }
}
