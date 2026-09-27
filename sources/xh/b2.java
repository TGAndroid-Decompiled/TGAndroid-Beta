package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sr;
public final class b2 extends du {
    public final h5 f46146c;
    public int d;
    public final o6 e;
    public final t2 f46147f;

    public b2(t2 t2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f46147f = t2Var;
        this.f46146c = new h5(this);
        o6 o6Var = new o6(false, true, true, false);
        this.e = o6Var;
        o6Var.k(0.2f, 160L, sr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.setCallback(this);
        o6Var.f26983b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = i6.f19278p7;
        } else {
            i10 = i6.P5;
        }
        int a2 = this.f46146c.a(i6.v0(i10, this.f46147f.f46472f), false);
        o6 o6Var = this.e;
        o6Var.r(a2);
        o6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        o6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        o6 o6Var = this.e;
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
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
