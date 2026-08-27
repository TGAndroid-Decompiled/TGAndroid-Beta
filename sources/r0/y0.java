package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class y0 extends c1 {

    public static Field f46652e = null;

    public static boolean f46653f = false;

    public static Constructor f46654g = null;
    public static boolean h = false;

    public WindowInsets f46655c;
    public i0.c d;

    public y0() {
        this.f46655c = i();
    }

    private static WindowInsets i() {
        if (!f46653f) {
            try {
                f46652e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f46653f = true;
        }
        Field field = f46652e;
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
                f46654g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f46654g;
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
    public m1 b() {
        a();
        m1 m1VarH = m1.h(null, this.f46655c);
        i0.c[] cVarArr = this.f46571b;
        j1 j1Var = m1VarH.f46619a;
        j1Var.q(cVarArr);
        j1Var.s(this.d);
        return m1VarH;
    }

    @Override
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.f46655c;
        if (windowInsets != null) {
            this.f46655c = windowInsets.replaceSystemWindowInsets(cVar.f10489a, cVar.f10490b, cVar.f10491c, cVar.d);
        }
    }

    public y0(m1 m1Var) {
        super(m1Var);
        this.f46655c = m1Var.g();
    }
}
