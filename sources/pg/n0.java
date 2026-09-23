package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.rr;
public final class n0 implements Runnable {
    public final int f40868a;
    public final r0 f40869b;
    public final g1 f40870c;

    public n0(r0 r0Var, g1 g1Var, int i10) {
        this.f40868a = i10;
        this.f40869b = r0Var;
        this.f40870c = g1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f40868a;
        g1 g1Var = this.f40870c;
        r0 r0Var = this.f40869b;
        switch (i10) {
            case 0:
                r0Var.f40907c = g1Var;
                if (r0Var.h == null) {
                    r0Var.h = new RectF();
                }
                r0Var.f40907c.a(r0Var.h);
                k2.u uVar = r0Var.f40905a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                if (g1Var != null && r0Var.f40918q == 0) {
                    r0Var.f40918q = s1.b(r0Var.f40909g);
                }
                boolean z12 = r0Var.H;
                if (g1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (g1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r0Var.H = z11;
                    ValueAnimator valueAnimator = r0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        r0Var.K = null;
                    }
                    float f10 = r0Var.I;
                    if (r0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    r0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new m0(r0Var, 0));
                    r0Var.K.addListener(new q0(r0Var, 0));
                    r0Var.K.setInterpolator(rr.h);
                    r0Var.K.start();
                    r0Var.d = g1Var;
                    k2.u uVar2 = r0Var.f40905a;
                    if (uVar2 != null) {
                        uVar2.W();
                    }
                    if (r0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (g1Var != r0Var.d) {
                    r0Var.d = g1Var;
                    k2.u uVar3 = r0Var.f40905a;
                    if (uVar3 != null) {
                        uVar3.W();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
