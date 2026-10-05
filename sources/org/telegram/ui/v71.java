package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v71 implements View.OnClickListener {
    public final g81 f41636a;
    public final TLRPC.TL_authorization f41637b;
    public final SessionsActivity f41638c;
    public final x71 d;

    public v71(x71 x71Var, g81 g81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = x71Var;
        this.f41636a = g81Var;
        this.f41637b = tL_authorization;
        this.f41638c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f42827c.getParentActivity());
        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new c7(this, this.f41636a, this.f41637b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41638c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
        }
    }
}
