package zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c0 implements Runnable {
    public final int f51938a;
    public final d0 f51939b;

    public c0(d0 d0Var, int i10) {
        this.f51938a = i10;
        this.f51939b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f51938a) {
            case 0:
                d0 d0Var = this.f51939b;
                d0Var.e();
                m0 m0Var = (m0) d0Var.f51946a.f16003b;
                FrameLayout frameLayout = m0Var.f52055f;
                if (frameLayout != null) {
                    frameLayout.removeView(d0Var);
                }
                if (m0Var.E == d0Var) {
                    m0Var.E = null;
                }
                b1 b1Var = m0Var.d;
                if (b1Var != null) {
                    b1Var.setScanHidden(false);
                    return;
                }
                return;
            case 1:
                d0 d0Var2 = this.f51939b;
                r8.n nVar = d0Var2.f51953e0;
                if (nVar != null) {
                    nVar.X0();
                    d0Var2.f51953e0 = null;
                }
                Bitmap bitmap = d0Var2.f51956g0;
                if (bitmap != null) {
                    bitmap.recycle();
                    d0Var2.f51956g0 = null;
                }
                d0Var2.f51949b0.quitSafely();
                return;
            default:
                d0 d0Var3 = this.f51939b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    ?? obj = new Object();
                    obj.f7391a = 256;
                    d0Var3.f51953e0 = new r8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                d0Var3.f51955f0 = new a6.i(23);
                return;
        }
    }
}
