package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w61 implements View.OnClickListener {
    public final i71 f42945a;
    public final TLRPC.TL_authorization f42946b;
    public final SessionsActivity f42947c;
    public final y61 d;

    public w61(y61 y61Var, i71 i71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = y61Var;
        this.f42945a = i71Var;
        this.f42946b = tL_authorization;
        this.f42947c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f43739c.getParentActivity());
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f42945a, this.f42946b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f42947c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
        }
    }
}
