package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.w9;
public final class j0 extends w9 {
    public boolean G;
    public q5 H;
    public d I;
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
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.a(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.o(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f30271k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f30271k0) {
            l0 l0Var = this.K;
            if (l0Var.f49011a == 2 && !l0Var.f49032z) {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
