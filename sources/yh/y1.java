package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.p6;
public final class y1 extends iu {
    public final i5 f50607c;
    public int d;
    public final p6 e;
    public final q2 f50608f;

    public y1(q2 q2Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.f50608f = q2Var;
        this.f50607c = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.e = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.f29192b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = h6.f21207p7;
        } else {
            i10 = h6.P5;
        }
        int a2 = this.f50607c.a(h6.w0(i10, this.f50608f.f50495f), false);
        p6 p6Var = this.e;
        p6Var.u(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.e;
        if (p6Var != null) {
            this.d = 12 - charSequence.length();
            p6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            p6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
