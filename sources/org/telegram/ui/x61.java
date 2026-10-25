package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x61 implements View.OnClickListener {
    public final j71 f45672a;
    public final TLRPC.TL_authorization f45673b;
    public final SessionsActivity f45674c;
    public final z61 d;

    public x61(z61 z61Var, j71 j71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = z61Var;
        this.f45672a = j71Var;
        this.f45673b = tL_authorization;
        this.f45674c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f46189c.getParentActivity());
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f45672a, this.f45673b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f45674c;
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        sessionsActivity.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
        }
    }
}
