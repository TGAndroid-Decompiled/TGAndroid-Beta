package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.r6;
public final class y1 extends nu {
    public final j5 f49223c;
    public int d;
    public final r6 e;
    public final q2 f49224f;

    public y1(q2 q2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f49224f = q2Var;
        this.f49223c = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, es.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f28748b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = g6.f20122p7;
        } else {
            i10 = g6.P5;
        }
        int a2 = this.f49223c.a(g6.w0(i10, this.f49224f.f49092f), false);
        r6 r6Var = this.e;
        r6Var.u(a2);
        r6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        r6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r6 r6Var = this.e;
        if (r6Var != null) {
            this.d = 12 - charSequence.length();
            r6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            r6Var.t(str, true, true);
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
