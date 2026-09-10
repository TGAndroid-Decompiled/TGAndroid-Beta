package yg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.w9;
public final class j0 extends w9 {
    public boolean G;
    public p5 H;
    public e I;
    public boolean J;
    public final l0 K;

    public j0(l0 l0Var, Context context) {
        super(context);
        this.K = l0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.a(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        p5 p5Var = this.H;
        if (p5Var != null) {
            p5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f23660l0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f23660l0) {
            l0 l0Var = this.K;
            if (l0Var.f47041a == 2 && !l0Var.f47062z) {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
