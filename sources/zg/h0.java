package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.y9;
public final class h0 extends y9 {
    public boolean G;
    public s5 H;
    public d I;
    public boolean J;
    public final j0 K;

    public h0(j0 j0Var, Context context) {
        super(context);
        this.K = j0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.a(this);
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
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.o(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s5 s5Var = this.H;
        if (s5Var != null) {
            s5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().f25740k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().f25740k0) {
            j0 j0Var = this.K;
            if (j0Var.f54596a == 2 && !j0Var.f54618z) {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().f25732e[0] - 1, false, false);
            } else {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            }
        }
        super.onDraw(canvas);
    }
}
