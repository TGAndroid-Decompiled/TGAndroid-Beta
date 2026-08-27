package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class v61 implements View.OnClickListener {

    public final g71 f43371a;

    public final TLRPC.TL_authorization f43372b;

    public final SessionsActivity f43373c;
    public final x61 d;

    public v61(x61 x61Var, g71 g71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = x61Var;
        this.f43371a = g71Var;
        this.f43372b = tL_authorization;
        this.f43373c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f44295c.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f43371a, this.f43372b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f43373c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }
}
