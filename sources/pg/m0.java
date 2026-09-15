package pg;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;
public final class m0 implements Runnable {
    public final int f40913a;
    public final q0 f40914b;
    public final f1 f40915c;

    public m0(q0 q0Var, f1 f1Var, int i10) {
        this.f40913a = i10;
        this.f40914b = q0Var;
        this.f40915c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f40913a;
        f1 f1Var = this.f40915c;
        q0 q0Var = this.f40914b;
        switch (i10) {
            case 0:
                q0Var.f40950c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f40950c.a(q0Var.h);
                k2.u uVar = q0Var.f40948a;
                if (uVar != null) {
                    uVar.W();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f40961q == 0) {
                    q0Var.f40961q = r1.b(q0Var.f40952g);
                }
                boolean z12 = q0Var.H;
                if (f1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (f1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q0Var.H = z11;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    float f10 = q0Var.I;
                    if (q0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new l0(q0Var, 0));
                    q0Var.K.addListener(new p0(q0Var, 0));
                    q0Var.K.setInterpolator(qr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    k2.u uVar2 = q0Var.f40948a;
                    if (uVar2 != null) {
                        uVar2.W();
                    }
                    if (q0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    k2.u uVar3 = q0Var.f40948a;
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
