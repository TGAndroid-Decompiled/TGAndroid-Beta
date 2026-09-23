package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u71 implements View.OnClickListener {
    public final f81 f37936a;
    public final TLRPC.TL_authorization f37937b;
    public final SessionsActivity f37938c;
    public final w71 d;

    public u71(w71 w71Var, f81 f81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = w71Var;
        this.f37936a = f81Var;
        this.f37937b = tL_authorization;
        this.f37938c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38554c.getParentActivity());
        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f37936a, this.f37937b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37938c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
        }
    }
}
