package zi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.widget.FrameLayout;
import java.util.concurrent.CountDownLatch;
import ki.j2;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.q40;
import org.telegram.ui.pk;
public final class e implements Runnable {
    public final int f61486a;
    public final Object f61487b;
    public final Object f61488c;

    public e(int i7, Object obj, Object obj2) {
        this.f61486a = i7;
        this.f61487b = obj;
        this.f61488c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f61486a) {
            case 0:
                l lVar = (l) this.f61487b;
                HandlerThread handlerThread = (HandlerThread) this.f61488c;
                lVar.j();
                o oVar = lVar.f61611w;
                if (oVar != null) {
                    long p10 = oVar.p();
                    u uVar = lVar.v;
                    if (uVar != null && p10 != Long.MAX_VALUE) {
                        uVar.f61720q = Math.max(0L, p10) * 1000;
                        Handler handler = uVar.f61728u;
                        if (handler != null) {
                            handler.removeCallbacks(uVar.f61736y0);
                        }
                    }
                }
                lVar.n();
                o oVar2 = lVar.f61611w;
                if (oVar2 != null) {
                    oVar2.u();
                    lVar.f61611w = null;
                }
                if (lVar.f61612w0 > 0) {
                    lVar.f61579j.b("release waits for camera open results: pending=" + lVar.f61612w0);
                    lVar.f61614x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 1:
                u uVar2 = (u) this.f61487b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f61488c;
                uVar2.getClass();
                try {
                    try {
                        uVar2.f();
                        uVar2.f61723r0 = true;
                    } catch (RuntimeException e10) {
                        uVar2.f61734x0 = e10;
                        uVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                n0 n0Var = (n0) this.f61488c;
                v0 v0Var = (v0) ((u7.i) this.f61487b).f57880a;
                v0Var.R++;
                v0Var.f61767y = true;
                v0Var.f61756m.b("camera switch started: target=" + n0Var);
                q40 q40Var = (q40) v0Var.d.f34590b;
                FrameLayout frameLayout = q40Var.f38514x;
                q40Var.f38510u0++;
                ValueAnimator valueAnimator = q40Var.f38489d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q40Var.f38489d0.cancel();
                    q40Var.f38489d0 = null;
                }
                q40Var.f38503p0 = true;
                q40Var.f38504q0 = false;
                q40Var.f38506r0 = false;
                q40Var.f38508s0 = false;
                q40Var.f38509t0 = SystemClock.elapsedRealtime();
                pk pkVar = q40Var.E;
                q40Var.A(false);
                Bitmap bitmap = q40Var.f38511v0;
                if (bitmap != null) {
                    pkVar.setImageBitmap(bitmap);
                    q40Var.f38502o0 = true;
                    pkVar.animate().cancel();
                    pkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i7 = q40Var.f38510u0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q40Var.f38489d0 = ofFloat;
                ofFloat.setDuration(580L);
                q40Var.f38489d0.setInterpolator(er.h);
                q40Var.f38489d0.addUpdateListener(new h2(q40Var, i7, 4));
                q40Var.f38489d0.addListener(new j2(q40Var, i7, 10));
                q40Var.f38489d0.start();
                a8.b("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                q40Var.D();
                v0Var.o();
                return;
        }
    }
}
