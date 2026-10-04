package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x71 implements View.OnClickListener {
    public final j81 f42763a;
    public final TLRPC.TL_authorization f42764b;
    public final SessionsActivity f42765c;
    public final z71 d;

    public x71(z71 z71Var, j81 j81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = z71Var;
        this.f42763a = j81Var;
        this.f42764b = tL_authorization;
        this.f42765c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f43715c.getParentActivity());
        alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new c7(this, this.f42763a, this.f42764b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f42765c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
        }
    }
}
