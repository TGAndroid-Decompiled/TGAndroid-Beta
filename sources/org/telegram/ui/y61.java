package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y61 implements View.OnClickListener {
    public final k71 f44756a;
    public final TLRPC.TL_authorization f44757b;
    public final SessionsActivity f44758c;
    public final a71 d;

    public y61(a71 a71Var, k71 k71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = a71Var;
        this.f44756a = k71Var;
        this.f44757b = tL_authorization;
        this.f44758c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f36450c.getParentActivity());
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new z6(this, this.f44756a, this.f44757b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f44758c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
    }
}
