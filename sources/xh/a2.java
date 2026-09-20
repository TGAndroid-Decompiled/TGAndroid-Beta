package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
public final class a2 extends bu {
    public final g5 f46090c;
    public int d;
    public final n6 e;
    public final s2 f46091f;

    public a2(s2 s2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f46091f = s2Var;
        this.f46090c = new g5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.e = n6Var;
        n6Var.k(0.2f, 160L, qr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f26575b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = j6.f19315p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f46090c.a(j6.v0(i10, this.f46091f.f46419f), false);
        n6 n6Var = this.e;
        n6Var.r(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.e;
        if (n6Var != null) {
            this.d = 12 - charSequence.length();
            n6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            n6Var.q(str, true, true);
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
