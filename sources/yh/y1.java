package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
public final class y1 extends zt {
    public final h5 f50680c;
    public int d;
    public final p6 f50681e;
    public final q2 f50682f;

    public y1(q2 q2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f50682f = q2Var;
        this.f50680c = new h5(this);
        p6 p6Var = new p6(false, true, true, false);
        this.f50681e = p6Var;
        p6Var.k(0.2f, 160L, pr.h);
        p6Var.t(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29312b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = j6.f20907p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f50680c.a(j6.v0(i10, this.f50682f.f50548f), false);
        p6 p6Var = this.f50681e;
        p6Var.r(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.f50681e;
        if (p6Var != null) {
            this.d = 12 - charSequence.length();
            p6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            p6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f50681e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
