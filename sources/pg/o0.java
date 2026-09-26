package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.rr;
public final class o0 implements Runnable {
    public final int f41192a;
    public final s0 f41193b;
    public final i1 f41194c;

    public o0(s0 s0Var, i1 i1Var, int i10) {
        this.f41192a = i10;
        this.f41193b = s0Var;
        this.f41194c = i1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f41192a;
        i1 i1Var = this.f41194c;
        s0 s0Var = this.f41193b;
        switch (i10) {
            case 0:
                s0Var.f41223c = i1Var;
                if (s0Var.h == null) {
                    s0Var.h = new RectF();
                }
                s0Var.f41223c.a(s0Var.h);
                n2.e eVar = s0Var.f41221a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                if (i1Var != null && s0Var.f41234q == 0) {
                    s0Var.f41234q = u1.b(s0Var.f41225g);
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
                    s0Var.K.setInterpolator(rr.h);
                    s0Var.K.start();
                    s0Var.d = i1Var;
                    n2.e eVar2 = s0Var.f41221a;
                    if (eVar2 != null) {
                        eVar2.t();
                    }
                    if (s0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (i1Var != s0Var.d) {
                    s0Var.d = i1Var;
                    n2.e eVar3 = s0Var.f41221a;
                    if (eVar3 != null) {
                        eVar3.t();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
