package yf;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.er;

public final class l0 implements Runnable {

    public final int f49974a;

    public final p0 f49975b;

    public final e1 f49976c;

    public l0(p0 p0Var, e1 e1Var, int i10) {
        this.f49974a = i10;
        this.f49975b = p0Var;
        this.f49976c = e1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f49974a;
        e1 e1Var = this.f49976c;
        p0 p0Var = this.f49975b;
        switch (i10) {
            case 0:
                p0Var.f50013c = e1Var;
                if (p0Var.h == null) {
                    p0Var.h = new RectF();
                }
                p0Var.f50013c.a(p0Var.h);
                n1.d dVar = p0Var.f50011a;
                if (dVar != null) {
                    dVar.C();
                }
                break;
            default:
                if (e1Var != null && p0Var.f50025q == 0) {
                    p0Var.f50025q = q1.b(p0Var.f50016g);
                }
                int i11 = 0;
                if (p0Var.H != (e1Var != null)) {
                    p0Var.H = e1Var != null;
                    ValueAnimator valueAnimator = p0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p0Var.K = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(p0Var.I, p0Var.H ? 1.0f : 0.0f);
                    p0Var.K = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new k0(p0Var, i11));
                    p0Var.K.addListener(new o0(p0Var, i11));
                    p0Var.K.setInterpolator(er.h);
                    p0Var.K.start();
                    p0Var.d = e1Var;
                    n1.d dVar2 = p0Var.f50011a;
                    if (dVar2 != null) {
                        dVar2.C();
                    }
                    if (p0Var.H) {
                        BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                    }
                } else if (e1Var != p0Var.d) {
                    p0Var.d = e1Var;
                    n1.d dVar3 = p0Var.f50011a;
                    if (dVar3 != null) {
                        dVar3.C();
                    }
                }
                break;
        }
    }
}
