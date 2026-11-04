package v7;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import b8.ng;
public abstract class q {
    public static ng f56471a;

    public static synchronized p f(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (f56471a == null) {
                    f56471a = new ng(1);
                }
                pVar = (p) f56471a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public abstract void a(Rect rect, RectF rectF);

    public abstract void b();

    public abstract void c(Canvas canvas);

    public abstract boolean d();

    public abstract void e(float f10);
}
