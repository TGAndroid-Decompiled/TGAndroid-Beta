package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x71 implements View.OnClickListener {
    public final j81 f39551a;
    public final TLRPC.TL_authorization f39552b;
    public final SessionsActivity f39553c;
    public final z71 d;

    public x71(z71 z71Var, j81 j81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = z71Var;
        this.f39551a = j81Var;
        this.f39552b = tL_authorization;
        this.f39553c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f40424c.getParentActivity());
        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new d7(this, this.f39551a, this.f39552b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f39553c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
        }
    }
}
