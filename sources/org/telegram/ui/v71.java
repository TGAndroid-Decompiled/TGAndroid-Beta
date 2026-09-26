package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v71 implements View.OnClickListener {
    public final h81 f38658a;
    public final TLRPC.TL_authorization f38659b;
    public final SessionsActivity f38660c;
    public final x71 d;

    public v71(x71 x71Var, h81 h81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = x71Var;
        this.f38658a = h81Var;
        this.f38659b = tL_authorization;
        this.f38660c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f39856c.getParentActivity());
        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f38658a, this.f38659b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f38660c;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        sessionsActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
        }
    }
}
