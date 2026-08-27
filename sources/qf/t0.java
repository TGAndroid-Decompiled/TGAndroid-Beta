package qf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;

public final class t0 extends EditTextBoldCursor {

    public final b5 f46453b;

    public int f46454c;
    public final i6 d;

    public final w0 f46455e;

    public t0(w0 w0Var, Activity activity) {
        super(activity);
        this.f46455e = w0Var;
        this.f46453b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29239b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int iA = this.f46453b.a(g6.v0(this.f46454c < 0 ? g6.f23269p7 : g6.P5, this.f46455e.getResourceProvider()), false);
        i6 i6Var = this.d;
        i6Var.r(iA);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.f46454c = 96 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.f46454c <= 12) {
                str = "" + this.f46454c;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
