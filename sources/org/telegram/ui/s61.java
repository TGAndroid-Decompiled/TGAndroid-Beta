package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s61 implements View.OnClickListener {
    public final d71 f41384a;
    public final TLRPC.TL_authorization f41385b;
    public final SessionsActivity f41386c;
    public final u61 d;

    public s61(u61 u61Var, d71 d71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = u61Var;
        this.f41384a = d71Var;
        this.f41385b = tL_authorization;
        this.f41386c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f41819c.getParentActivity());
        alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f41384a, this.f41385b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41386c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
        }
    }
}
