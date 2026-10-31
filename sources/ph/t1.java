package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.w4;
public final class t1 extends mt {
    public final w4 Y1;
    public int Z1;
    public final e6 a2;
    public final j2 f45312b2;

    public t1(j2 j2Var, Context context, p6 p6Var) {
        super(context, p6Var);
        this.f45312b2 = j2Var;
        this.Y1 = new w4(this);
        e6 e6Var = new e6(false, true, true);
        this.a2 = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.f25695b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.Z1 < 0) {
            i10 = t6.f21153p7;
        } else {
            i10 = t6.P5;
        }
        int a2 = this.Y1.a(t6.w0(i10, this.f45312b2.f45131f), false);
        e6 e6Var = this.a2;
        e6Var.u(a2);
        e6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        e6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e6 e6Var = this.a2;
        if (e6Var != null) {
            this.Z1 = 12 - charSequence.length();
            e6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            e6Var.t(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a2 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
