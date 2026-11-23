package zi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.widget.FrameLayout;
import bi.p6;
import ki.e2;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.y40;
import org.telegram.ui.qk;
import y7.h7;
public final class k0 implements Runnable {
    public final int f62311a;
    public final Object f62312b;
    public final Object f62313c;

    public k0(int i7, Object obj, Object obj2) {
        this.f62311a = i7;
        this.f62312b = obj;
        this.f62313c = obj2;
    }

    @Override
    public final void run() {
        int i7 = this.f62311a;
        Object obj = this.f62313c;
        Object obj2 = this.f62312b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj;
                u0 u0Var = (u0) ((h7) obj2).f60952a;
                u0Var.R++;
                u0Var.f62462y = true;
                u0Var.f62451m.b("camera switch started: target=" + n0Var);
                y40 y40Var = (y40) u0Var.d.f30491b;
                FrameLayout frameLayout = y40Var.f42350x;
                y40Var.f42346u0++;
                ValueAnimator valueAnimator = y40Var.f42325d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y40Var.f42325d0.cancel();
                    y40Var.f42325d0 = null;
                }
                y40Var.f42339p0 = true;
                y40Var.f42340q0 = false;
                y40Var.f42342r0 = false;
                y40Var.f42344s0 = false;
                y40Var.f42345t0 = SystemClock.elapsedRealtime();
                qk qkVar = y40Var.E;
                y40Var.A(false);
                Bitmap bitmap = y40Var.f42347v0;
                if (bitmap != null) {
                    qkVar.setImageBitmap(bitmap);
                    y40Var.f42338o0 = true;
                    qkVar.animate().cancel();
                    qkVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i10 = y40Var.f42346u0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                y40Var.f42325d0 = ofFloat;
                ofFloat.setDuration(580L);
                y40Var.f42325d0.setInterpolator(kr.h);
                y40Var.f42325d0.addUpdateListener(new j2(y40Var, i10, 4));
                y40Var.f42325d0.addListener(new e2(y40Var, i10, 10));
                y40Var.f42325d0.start();
                a8.b("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                y40Var.D();
                u0Var.o();
                return;
            default:
                org.telegram.messenger.g0.g((String) obj);
                kc.b0(((p6) obj2).f3966a.f4148a).k(false).j();
                return;
        }
    }
}
