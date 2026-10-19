package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s61 implements View.OnClickListener {
    public final d71 f41378a;
    public final TLRPC.TL_authorization f41379b;
    public final SessionsActivity f41380c;
    public final u61 d;

    public s61(u61 u61Var, d71 d71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = u61Var;
        this.f41378a = d71Var;
        this.f41379b = tL_authorization;
        this.f41380c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f41813c.getParentActivity());
        alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f41378a, this.f41379b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f41380c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225q7, false));
        }
    }
}
