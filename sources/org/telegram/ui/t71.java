package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t71 implements View.OnClickListener {
    public final f81 f38406a;
    public final TLRPC.TL_authorization f38407b;
    public final SessionsActivity f38408c;
    public final v71 d;

    public t71(v71 v71Var, f81 f81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = v71Var;
        this.f38406a = f81Var;
        this.f38407b = tL_authorization;
        this.f38408c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f39024c.getParentActivity());
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new f7(this, this.f38406a, this.f38407b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f38408c;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        sessionsActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
        }
    }
}
