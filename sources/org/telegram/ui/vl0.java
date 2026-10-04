package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vl0 implements View.OnClickListener {
    public final int f41768a;
    public final kn0 f41769b;

    public vl0(kn0 kn0Var, int i10) {
        this.f41768a = i10;
        this.f41769b = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41768a) {
            case 0:
                kn0 kn0Var = this.f41769b;
                kn0Var.S0 = 2;
                kn0Var.D1();
                return;
            case 1:
                this.f41769b.d1();
                return;
            case 2:
                kn0 kn0Var2 = this.f41769b;
                kn0Var2.S0 = 3;
                kn0Var2.D1();
                return;
            case 3:
                kn0 kn0Var3 = this.f41769b;
                kn0Var3.S0 = 1;
                kn0Var3.D1();
                return;
            case 4:
                kn0 kn0Var4 = this.f41769b;
                kn0Var4.S0 = 4;
                kn0Var4.D1();
                return;
            case 5:
                kn0.e0(this.f41769b);
                return;
            case 6:
                kn0 kn0Var5 = this.f41769b;
                kn0Var5.f38017f = true;
                kn0Var5.L.callOnClick();
                kn0Var5.f38017f = false;
                return;
            case 7:
                kn0 kn0Var6 = this.f41769b;
                kn0Var6.S0 = 0;
                kn0Var6.D1();
                return;
            case 8:
                kn0 kn0Var7 = this.f41769b;
                kn0Var7.S0 = 4;
                kn0Var7.D1();
                return;
            case 9:
                this.f41769b.d1();
                return;
            case 10:
                kn0.b0(this.f41769b);
                return;
            case 11:
                kn0.c0(this.f41769b);
                return;
            case 12:
                this.f41769b.C1();
                return;
            case 13:
                kn0 kn0Var8 = this.f41769b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var8.getParentActivity());
                alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xl0(kn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                kn0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
                    return;
                }
                return;
            case 14:
                this.f41769b.C1();
                return;
            case 15:
                kn0.T(this.f41769b);
                return;
            default:
                kn0 kn0Var9 = this.f41769b;
                kn0Var9.f38017f = true;
                kn0Var9.L.callOnClick();
                kn0Var9.f38017f = false;
                return;
        }
    }
}
