package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
public final class a2 extends eu {
    public final h5 f49880c;
    public int d;
    public final o6 f49881e;
    public final s2 f49882f;

    public a2(s2 s2Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.f49882f = s2Var;
        this.f49880c = new h5(this);
        o6 o6Var = new o6(false, true, true, false);
        this.f49881e = o6Var;
        o6Var.k(0.2f, 160L, tr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.setCallback(this);
        o6Var.f29245b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = i6.f21044p7;
        } else {
            i10 = i6.P5;
        }
        int a2 = this.f49880c.a(i6.v0(i10, this.f49882f.f50229f), false);
        o6 o6Var = this.f49881e;
        o6Var.r(a2);
        o6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        o6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        o6 o6Var = this.f49881e;
        if (o6Var != null) {
            this.d = 12 - charSequence.length();
            o6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            o6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f49881e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
