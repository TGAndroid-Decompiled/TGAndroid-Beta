package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v61 implements View.OnClickListener {
    public final h71 f42587a;
    public final TLRPC.TL_authorization f42588b;
    public final SessionsActivity f42589c;
    public final x61 d;

    public v61(x61 x61Var, h71 h71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = x61Var;
        this.f42587a = h71Var;
        this.f42588b = tL_authorization;
        this.f42589c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f43483c.getParentActivity());
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f42587a, this.f42588b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f42589c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
        }
    }
}
