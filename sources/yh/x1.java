package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.zr;
public final class x1 extends gu {
    public final g5 f51038c;
    public int d;
    public final n6 e;
    public final p2 f51039f;

    public x1(p2 p2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f51039f = p2Var;
        this.f51038c = new g5(this);
        n6 n6Var = new n6(false, true, true);
        this.e = n6Var;
        n6Var.n(0.2f, 160L, zr.h);
        n6Var.w(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f28797b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = k6.f21405p7;
        } else {
            i10 = k6.P5;
        }
        int a2 = this.f51038c.a(k6.w0(i10, this.f51039f.f50926f), false);
        n6 n6Var = this.e;
        n6Var.u(a2);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        n6 n6Var = this.e;
        if (n6Var != null) {
            this.d = 12 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            n6Var.t(str, true, true);
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
