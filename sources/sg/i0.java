package sg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g9;
public final class i0 extends g9 {
    public boolean G;
    public f5 H;
    public d I;
    public boolean J;
    public final k0 K;

    public i0(k0 k0Var, Context context) {
        super(context);
        this.K = k0Var;
        getImageReceiver().h0(3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.a(this);
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
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.n(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().B() != null && getImageReceiver().B().f25144k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().B() != null && !getImageReceiver().B().f25144k0) {
            k0 k0Var = this.K;
            if (k0Var.f48376a == 2 && !k0Var.f48397z) {
                getImageReceiver().B().N(getImageReceiver().B().e[0] - 1, false, false);
            } else {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            }
        }
        super.onDraw(canvas);
    }
}
