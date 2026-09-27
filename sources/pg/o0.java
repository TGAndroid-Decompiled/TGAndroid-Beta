package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.sr;
public final class o0 implements Runnable {
    public final int f41190a;
    public final s0 f41191b;
    public final i1 f41192c;

    public o0(s0 s0Var, i1 i1Var, int i10) {
        this.f41190a = i10;
        this.f41191b = s0Var;
        this.f41192c = i1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f41190a;
        i1 i1Var = this.f41192c;
        s0 s0Var = this.f41191b;
        switch (i10) {
            case 0:
                s0Var.f41221c = i1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f41221c.a(s0Var.h);
                o0.c cVar = s0Var.f41219a;
                if (cVar != null) {
                    cVar.v();
                    return;
                }
                return;
            default:
                if (i1Var != null && s0Var.f41232q == 0) {
                    s0Var.f41232q = u1.b(s0Var.f41223g);
                }
                boolean z12 = s0Var.H;
                if (i1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (i1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s0Var.H = z11;
                    ValueAnimator valueAnimator = s0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        s0Var.K = null;
                    }
                    float f10 = s0Var.I;
                    if (s0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    s0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new n0(s0Var, 0));
                    s0Var.K.addListener(new r0(s0Var, 0));
                    s0Var.K.setInterpolator(sr.h);
                    s0Var.K.start();
                    s0Var.d = i1Var;
                    o0.c cVar2 = s0Var.f41219a;
                    if (cVar2 != null) {
                        cVar2.v();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (i1Var != s0Var.d) {
                    s0Var.d = i1Var;
                    o0.c cVar3 = s0Var.f41219a;
                    if (cVar3 != null) {
                        cVar3.v();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
