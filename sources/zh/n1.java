package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.zs;
public final class n1 extends zs {
    public final z4 Y1;
    public int Z1;
    public final i6 f60485a2;
    public final d2 f60486b2;

    public n1(d2 d2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f60486b2 = d2Var;
        this.Y1 = new z4(this);
        i6 i6Var = new i6(false, true, true);
        this.f60485a2 = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.setCallback(this);
        i6Var.f34587b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i7 = l6.f28086p7;
        } else {
            i7 = l6.P5;
        }
        int a10 = this.Y1.a(l6.w0(i7, this.f60486b2.f60296f), false);
        i6 i6Var = this.f60485a2;
        i6Var.u(a10);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        i6 i6Var = this.f60485a2;
        if (i6Var != null) {
            this.Z1 = 12 - charSequence.length();
            i6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            i6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f60485a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
