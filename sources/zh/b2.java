package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b2 extends FrameLayout {
    public final int f48300a;
    public final a3 f48301b;

    public b2(a3 a3Var, Context context, int i10) {
        super(context);
        this.f48300a = i10;
        this.f48301b = a3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f48300a) {
            case 0:
                a3 a3Var = this.f48301b;
                if (a3Var.F2.getVisibility() == 0 && a3Var.F2.getLayoutParams().width != (x10 = (int) (((a3Var.A2.getX() + a3Var.A2.getMeasuredWidth()) - a3Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    a3Var.F2.getLayoutParams().width = x10;
                    a3Var.F2.invalidate();
                    a3Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                a3 a3Var2 = this.f48301b;
                if (a3Var2.D1 && a3Var2.R0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - a3Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var = a3Var2.T0;
                    if (a3Var2.V0) {
                        f7 = 1.0f;
                    }
                    float d = d6Var.d(f7, false);
                    canvas.scale(d, d, a3Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var = a3Var2.R0;
                    n6Var.f25442w = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                a3 a3Var3 = this.f48301b;
                if (a3Var3.D1 && a3Var3.Q0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - a3Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.d6 d6Var2 = a3Var3.S0;
                    if (a3Var3.U0) {
                        f10 = 1.0f;
                    }
                    float d10 = d6Var2.d(f10, false);
                    canvas.scale(d10, d10, a3Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = a3Var3.Q0;
                    n6Var2.f25442w = 255;
                    n6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f48300a) {
            case 1:
                if (drawable != this.f48301b.R0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f48301b.Q0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
