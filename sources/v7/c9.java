package v7;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class c9 {
    public static t7.r f46599a;
    public static StaticLayout f46600b;

    public static ji.b0 a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        if (f46600b == null) {
            f46600b = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new ji.b0(f46600b, rect);
    }

    public static synchronized y8 b(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f46599a == null) {
                    f46599a = new t7.r(1);
                }
                y8Var = (y8) f46599a.R0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
