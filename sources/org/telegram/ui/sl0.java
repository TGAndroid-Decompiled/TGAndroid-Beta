package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sl0 implements View.OnClickListener {
    public final int f37330a;
    public final in0 f37331b;

    public sl0(in0 in0Var, int i10) {
        this.f37330a = i10;
        this.f37331b = in0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37330a) {
            case 0:
                in0 in0Var = this.f37331b;
                in0Var.S0 = 2;
                in0Var.D1();
                return;
            case 1:
                this.f37331b.d1();
                return;
            case 2:
                in0 in0Var2 = this.f37331b;
                in0Var2.S0 = 3;
                in0Var2.D1();
                return;
            case 3:
                in0 in0Var3 = this.f37331b;
                in0Var3.S0 = 1;
                in0Var3.D1();
                return;
            case 4:
                in0 in0Var4 = this.f37331b;
                in0Var4.S0 = 4;
                in0Var4.D1();
                return;
            case 5:
                in0.e0(this.f37331b);
                return;
            case 6:
                in0 in0Var5 = this.f37331b;
                in0Var5.f34175f = true;
                in0Var5.L.callOnClick();
                in0Var5.f34175f = false;
                return;
            case 7:
                in0 in0Var6 = this.f37331b;
                in0Var6.S0 = 0;
                in0Var6.D1();
                return;
            case 8:
                in0 in0Var7 = this.f37331b;
                in0Var7.S0 = 4;
                in0Var7.D1();
                return;
            case 9:
                this.f37331b.d1();
                return;
            case 10:
                in0.b0(this.f37331b);
                return;
            case 11:
                in0.c0(this.f37331b);
                return;
            case 12:
                this.f37331b.C1();
                return;
            case 13:
                in0 in0Var8 = this.f37331b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var8.getParentActivity());
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ul0(in0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                in0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                    return;
                }
                return;
            case 14:
                this.f37331b.C1();
                return;
            case 15:
                in0.V(this.f37331b);
                return;
            default:
                in0 in0Var9 = this.f37331b;
                in0Var9.f34175f = true;
                in0Var9.L.callOnClick();
                in0Var9.f34175f = false;
                return;
        }
    }
}
