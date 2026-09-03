package vf;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
public final class s0 extends EditTextBoldCursor {
    public final c5 f49228b;
    public int f49229c;
    public final j6 d;
    public final v0 f49230e;

    public s0(v0 v0Var, Activity activity) {
        super(activity);
        this.f49230e = v0Var;
        this.f49228b = new c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.d = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.f27999b = 5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        if (this.f49229c < 0) {
            i10 = k6.f21878p7;
        } else {
            i10 = k6.P5;
        }
        int a2 = this.f49228b.a(k6.v0(i10, this.f49230e.getResourceProvider()), false);
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
            this.f49229c = 96 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.f49229c <= 12) {
                str = "" + this.f49229c;
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
