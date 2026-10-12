package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.uu;
public final class z1 extends uu {
    public final j5 f51859c;
    public int d;
    public final q6 f51860e;
    public final r2 f51861f;

    public z1(r2 r2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f51861f = r2Var;
        this.f51859c = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.f51860e = q6Var;
        q6Var.n(0.2f, 160L, js.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.f29712b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = h6.f20780p7;
        } else {
            i10 = h6.P5;
        }
        int a2 = this.f51859c.a(h6.w0(i10, this.f51861f.f51725f), false);
        q6 q6Var = this.f51860e;
        q6Var.u(a2);
        q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        q6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q6 q6Var = this.f51860e;
        if (q6Var != null) {
            this.d = 12 - charSequence.length();
            q6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            q6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f51860e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
