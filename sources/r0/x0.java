package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class x0 extends b1 {
    public static Field f45657e = null;
    public static boolean f45658f = false;
    public static Constructor f45659g = null;
    public static boolean h = false;
    public WindowInsets f45660c;
    public i0.b d;

    public x0() {
        this.f45660c = i();
    }

    private static WindowInsets i() {
        if (!f45658f) {
            try {
                f45657e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f45658f = true;
        }
        Field field = f45657e;
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
                f45659g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f45659g;
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
        l1 h10 = l1.h(null, this.f45660c);
        i0.b[] bVarArr = this.f45578b;
        i1 i1Var = h10.f45624a;
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
        WindowInsets windowInsets = this.f45660c;
        if (windowInsets != null) {
            this.f45660c = windowInsets.replaceSystemWindowInsets(bVar.f11526a, bVar.f11527b, bVar.f11528c, bVar.d);
        }
    }

    public x0(l1 l1Var) {
        super(l1Var);
        this.f45660c = l1Var.g();
    }
}
