package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ul0 implements View.OnClickListener {
    public final int f38276a;
    public final jn0 f38277b;

    public ul0(jn0 jn0Var, int i10) {
        this.f38276a = i10;
        this.f38277b = jn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38276a) {
            case 0:
                jn0 jn0Var = this.f38277b;
                jn0Var.S0 = 2;
                jn0Var.D1();
                return;
            case 1:
                this.f38277b.d1();
                return;
            case 2:
                jn0 jn0Var2 = this.f38277b;
                jn0Var2.S0 = 3;
                jn0Var2.D1();
                return;
            case 3:
                jn0 jn0Var3 = this.f38277b;
                jn0Var3.S0 = 1;
                jn0Var3.D1();
                return;
            case 4:
                jn0 jn0Var4 = this.f38277b;
                jn0Var4.S0 = 4;
                jn0Var4.D1();
                return;
            case 5:
                jn0.e0(this.f38277b);
                return;
            case 6:
                jn0 jn0Var5 = this.f38277b;
                jn0Var5.f34780f = true;
                jn0Var5.L.callOnClick();
                jn0Var5.f34780f = false;
                return;
            case 7:
                jn0 jn0Var6 = this.f38277b;
                jn0Var6.S0 = 0;
                jn0Var6.D1();
                return;
            case 8:
                jn0 jn0Var7 = this.f38277b;
                jn0Var7.S0 = 4;
                jn0Var7.D1();
                return;
            case 9:
                this.f38277b.d1();
                return;
            case 10:
                jn0.b0(this.f38277b);
                return;
            case 11:
                jn0.c0(this.f38277b);
                return;
            case 12:
                this.f38277b.C1();
                return;
            case 13:
                jn0 jn0Var8 = this.f38277b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jn0Var8.getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wl0(jn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                jn0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                    return;
                }
                return;
            case 14:
                this.f38277b.C1();
                return;
            case 15:
                jn0.V(this.f38277b);
                return;
            default:
                jn0 jn0Var9 = this.f38277b;
                jn0Var9.f34780f = true;
                jn0Var9.L.callOnClick();
                jn0Var9.f34780f = false;
                return;
        }
    }
}
