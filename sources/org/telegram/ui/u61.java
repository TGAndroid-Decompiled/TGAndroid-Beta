package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u61 implements View.OnClickListener {
    public final f71 f41900a;
    public final TLRPC.TL_authorization f41901b;
    public final SessionsActivity f41902c;
    public final w61 d;

    public u61(w61 w61Var, f71 f71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = w61Var;
        this.f41900a = f71Var;
        this.f41901b = tL_authorization;
        this.f41902c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f42376c.getParentActivity());
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f41900a, this.f41901b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41902c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
        }
    }
}
