package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
public final class y1 extends fu {
    public final g5 f44434c;
    public int d;
    public final n6 e;
    public final q2 f44435f;

    public y1(q2 q2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f44435f = q2Var;
        this.f44434c = new g5(this);
        n6 n6Var = new n6(false, true, true, false);
        this.e = n6Var;
        n6Var.k(0.2f, 160L, wr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.setCallback(this);
        n6Var.f25425b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = j6.f18144p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f44434c.a(j6.v0(i10, this.f44435f.f44320f), false);
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
