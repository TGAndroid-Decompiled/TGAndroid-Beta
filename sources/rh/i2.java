package rh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;
public final class i2 extends org.telegram.ui.web.a1 {
    public final q2 M0;

    public i2(q2 q2Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.M0 = q2Var;
    }

    @Override
    public final void A(String str, boolean z4) {
        boolean z10;
        q2 q2Var = this.M0;
        Paint paint = q2Var.M;
        if (z4) {
            q2Var.i();
            q2Var.R0.a(UserObject.getUserName(MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E))), str);
            org.telegram.ui.f3 f3Var = q2Var.R0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3Var.b(z10, false);
            q2Var.R0.setBackgroundColor(paint.getColor());
            q2Var.Q0 = str;
        }
        org.telegram.ui.f3 f3Var2 = q2Var.R0;
        q2Var.P0 = z4;
        AndroidUtilities.updateViewVisibilityAnimated(f3Var2, z4, 1.0f, false);
        invalidate();
    }

    @Override
    public final void G(org.telegram.ui.web.w0 w0Var) {
        q2 q2Var = this.M0;
        q2Var.v.setWebView(w0Var);
        v0 v0Var = q2Var.f43711y0;
        if (v0Var != null) {
            v0Var.f43799k = w0Var;
        }
        q2Var.f43691j0.setWebView(w0Var);
        q2Var.F();
    }

    @Override
    public final void H(org.telegram.ui.web.w0 w0Var) {
        q2 q2Var = this.M0;
        v0 v0Var = q2Var.f43711y0;
        if (v0Var != null && v0Var.f43799k == w0Var) {
            v0Var.f43799k = null;
            v0Var.b();
        }
        q2Var.f43691j0.setWebView(null);
    }
}
