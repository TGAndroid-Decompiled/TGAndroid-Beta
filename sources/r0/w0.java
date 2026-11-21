package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
public final class w0 extends a1 {
    public static Field f56329e = null;
    public static boolean f56330f = false;
    public static Constructor f56331g = null;
    public static boolean h = false;
    public WindowInsets f56332c;
    public i0.b d;

    public w0() {
        this.f56332c = j();
    }

    private static WindowInsets j() {
        if (!f56330f) {
            try {
                f56329e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f56330f = true;
        }
        Field field = f56329e;
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
                f56331g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = f56331g;
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
    public l1 b() {
        a();
        l1 h7 = l1.h(null, this.f56332c);
        i0.b[] bVarArr = this.f56255b;
        i1 i1Var = h7.f56299a;
        i1Var.q(bVarArr);
        i1Var.s(this.d);
        return h7;
    }

    @Override
    public void e(i0.b bVar) {
        this.d = bVar;
    }

    @Override
    public void g(i0.b bVar) {
        WindowInsets windowInsets = this.f56332c;
        if (windowInsets != null) {
            this.f56332c = windowInsets.replaceSystemWindowInsets(bVar.f15914a, bVar.f15915b, bVar.f15916c, bVar.d);
        }
    }

    public w0(l1 l1Var) {
        super(l1Var);
        this.f56332c = l1Var.g();
    }
}
