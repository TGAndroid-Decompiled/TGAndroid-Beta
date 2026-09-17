package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
public final class z1 extends bu {
    public final f5 f46260c;
    public int d;
    public final m6 e;
    public final r2 f46261f;

    public z1(r2 r2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f46261f = r2Var;
        this.f46260c = new f5(this);
        m6 m6Var = new m6(false, true, true, false);
        this.e = m6Var;
        m6Var.k(0.2f, 160L, qr.h);
        m6Var.t(AndroidUtilities.dp(15.33f));
        m6Var.setCallback(this);
        m6Var.f26067b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = j6.f19082p7;
        } else {
            i10 = j6.P5;
        }
        int a2 = this.f46260c.a(j6.v0(i10, this.f46261f.f46131f), false);
        m6 m6Var = this.e;
        m6Var.r(a2);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m6 m6Var = this.e;
        if (m6Var != null) {
            this.d = 12 - charSequence.length();
            m6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            m6Var.q(str, true, true);
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
