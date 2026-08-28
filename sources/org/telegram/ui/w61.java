package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w61 implements View.OnClickListener {
    public final h71 f43685a;
    public final TLRPC.TL_authorization f43686b;
    public final SessionsActivity f43687c;
    public final y61 d;

    public w61(y61 y61Var, h71 h71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = y61Var;
        this.f43685a = h71Var;
        this.f43686b = tL_authorization;
        this.f43687c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f44760c.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new a7(this, this.f43685a, this.f43686b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f43687c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
    }
}
