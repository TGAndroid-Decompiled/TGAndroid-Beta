package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ys;
public final class n1 extends ys {
    public final y4 Y1;
    public int Z1;
    public final h6 f60492a2;
    public final d2 f60493b2;

    public n1(d2 d2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f60493b2 = d2Var;
        this.Y1 = new y4(this);
        h6 h6Var2 = new h6(false, true, true);
        this.f60492a2 = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.setCallback(this);
        h6Var2.f34187b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i7 = m6.f28111p7;
        } else {
            i7 = m6.P5;
        }
        int a10 = this.Y1.a(m6.w0(i7, this.f60493b2.f60298f), false);
        h6 h6Var = this.f60492a2;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        h6 h6Var = this.f60492a2;
        if (h6Var != null) {
            this.Z1 = 12 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f60492a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
