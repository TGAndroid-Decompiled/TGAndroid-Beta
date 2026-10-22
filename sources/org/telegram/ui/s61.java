package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s61 implements View.OnClickListener {
    public final d71 f41387a;
    public final TLRPC.TL_authorization f41388b;
    public final SessionsActivity f41389c;
    public final u61 d;

    public s61(u61 u61Var, d71 d71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = u61Var;
        this.f41387a = d71Var;
        this.f41388b = tL_authorization;
        this.f41389c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f41822c.getParentActivity());
        alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f41387a, this.f41388b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41389c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
        }
    }
}
