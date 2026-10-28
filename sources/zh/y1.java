package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.r6;
public final class y1 extends ju {
    public final j5 f53388c;
    public int d;
    public final r6 e;
    public final r2 f53389f;

    public y1(r2 r2Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.f53389f = r2Var;
        this.f53388c = new j5(this);
        r6 r6Var = new r6(false, true, true);
        this.e = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.setCallback(this);
        r6Var.f32142b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.d < 0) {
            i10 = y6.f23582p7;
        } else {
            i10 = y6.P5;
        }
        int a2 = this.f53388c.a(y6.w0(i10, this.f53389f.f53291f), false);
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
