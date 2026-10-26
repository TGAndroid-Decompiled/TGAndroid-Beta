package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x61 implements View.OnClickListener {
    public final j71 f45675a;
    public final TLRPC.TL_authorization f45676b;
    public final SessionsActivity f45677c;
    public final z61 d;

    public x61(z61 z61Var, j71 j71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = z61Var;
        this.f45675a = j71Var;
        this.f45676b = tL_authorization;
        this.f45677c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f46192c.getParentActivity());
        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f45675a, this.f45676b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f45677c;
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        sessionsActivity.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
        }
    }
}
