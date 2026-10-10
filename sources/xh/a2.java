package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.su;
public final class a2 extends su {
    public final j5 f51209c;
    public int d;
    public final q6 f51210e;
    public final s2 f51211f;

    public a2(s2 s2Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f51211f = s2Var;
        this.f51209c = new j5(this);
        q6 q6Var = new q6(false, true, true);
        this.f51210e = q6Var;
        q6Var.n(0.2f, 160L, is.h);
        q6Var.w(AndroidUtilities.dp(15.33f));
        q6Var.setCallback(this);
        q6Var.f30031b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = i6.f21022p7;
        } else {
            i10 = i6.P5;
        }
        int a2 = this.f51209c.a(i6.w0(i10, this.f51211f.f51559f), false);
        q6 q6Var = this.f51210e;
        q6Var.u(a2);
        q6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        q6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        q6 q6Var = this.f51210e;
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
        if (drawable != this.f51210e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
