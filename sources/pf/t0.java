package pf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
public final class t0 extends EditTextBoldCursor {
    public final b5 f45778b;
    public int f45779c;
    public final i6 d;
    public final w0 f45780e;

    public t0(w0 w0Var, Activity activity) {
        super(activity);
        this.f45780e = w0Var;
        this.f45778b = new b5(this);
        i6 i6Var = new i6(false, true, true, false);
        this.d = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.f29333b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        if (this.f45779c < 0) {
            i9 = f6.f23212p7;
        } else {
            i9 = f6.P5;
        }
        int a2 = this.f45778b.a(f6.v0(i9, this.f45780e.getResourceProvider()), false);
        i6 i6Var = this.d;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        i6 i6Var = this.d;
        if (i6Var != null) {
            this.f45779c = 96 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.f45779c <= 12) {
                str = "" + this.f45779c;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
