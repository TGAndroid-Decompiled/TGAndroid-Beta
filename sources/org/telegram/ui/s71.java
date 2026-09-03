package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s71 implements View.OnClickListener {
    public final e81 f41043a;
    public final TLRPC.TL_authorization f41044b;
    public final SessionsActivity f41045c;
    public final u71 d;

    public s71(u71 u71Var, e81 e81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = u71Var;
        this.f41043a = e81Var;
        this.f41044b = tL_authorization;
        this.f41045c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f41751c.getParentActivity());
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new d7(this, this.f41043a, this.f41044b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41045c;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        sessionsActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
        }
    }
}
