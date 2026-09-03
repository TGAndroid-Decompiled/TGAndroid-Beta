package rh;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f6;
public final class h2 extends org.telegram.ui.web.c1 {
    public final p2 P0;

    public h2(p2 p2Var, Context context, f6 f6Var, int i10) {
        super(i10, context, f6Var, true);
        this.P0 = p2Var;
    }

    @Override
    public final void E(String str, boolean z4) {
        boolean z10;
        p2 p2Var = this.P0;
        Paint paint = p2Var.M;
        if (z4) {
            p2Var.i();
            p2Var.R0.a(UserObject.getUserName(MessagesController.getInstance(p2Var.D).getUser(Long.valueOf(p2Var.E))), str);
            org.telegram.ui.h3 h3Var = p2Var.R0;
            if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            h3Var.b(z10, false);
            p2Var.R0.setBackgroundColor(paint.getColor());
            p2Var.Q0 = str;
        }
        org.telegram.ui.h3 h3Var2 = p2Var.R0;
        p2Var.P0 = z4;
        AndroidUtilities.updateViewVisibilityAnimated(h3Var2, z4, 1.0f, false);
        invalidate();
    }

    @Override
    public final void K(org.telegram.ui.web.y0 y0Var) {
        p2 p2Var = this.P0;
        p2Var.v.setWebView(y0Var);
        u0 u0Var = p2Var.f43763y0;
        if (u0Var != null) {
            u0Var.f43851k = y0Var;
        }
        p2Var.f43743j0.setWebView(y0Var);
        p2Var.F();
    }

    @Override
    public final void L(org.telegram.ui.web.y0 y0Var) {
        p2 p2Var = this.P0;
        u0 u0Var = p2Var.f43763y0;
        if (u0Var != null && u0Var.f43851k == y0Var) {
            u0Var.f43851k = null;
            u0Var.b();
        }
        p2Var.f43743j0.setWebView(null);
    }
}
