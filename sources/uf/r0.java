package uf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.nr;
public final class r0 extends EditTextBoldCursor {
    public final c5 f45426b;
    public int f45427c;
    public final j6 d;
    public final u0 e;

    public r0(u0 u0Var, Activity activity) {
        super(activity);
        this.e = u0Var;
        this.f45426b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, nr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f25884b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f45427c < 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20122p7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.P5;
        }
        int a2 = this.f45426b.a(org.telegram.ui.ActionBar.j6.v0(i10, this.e.getResourceProvider()), false);
        j6 j6Var = this.d;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.d;
        if (j6Var != null) {
            this.f45427c = 96 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.f45427c <= 12) {
                str = "" + this.f45427c;
            }
            j6Var.q(str, true, true);
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
