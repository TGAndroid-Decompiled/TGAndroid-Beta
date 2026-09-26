package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rl0 implements View.OnClickListener {
    public final int f37376a;
    public final gn0 f37377b;

    public rl0(gn0 gn0Var, int i10) {
        this.f37376a = i10;
        this.f37377b = gn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37376a) {
            case 0:
                gn0 gn0Var = this.f37377b;
                gn0Var.S0 = 2;
                gn0Var.D1();
                return;
            case 1:
                this.f37377b.d1();
                return;
            case 2:
                gn0 gn0Var2 = this.f37377b;
                gn0Var2.S0 = 3;
                gn0Var2.D1();
                return;
            case 3:
                gn0 gn0Var3 = this.f37377b;
                gn0Var3.S0 = 1;
                gn0Var3.D1();
                return;
            case 4:
                gn0 gn0Var4 = this.f37377b;
                gn0Var4.S0 = 4;
                gn0Var4.D1();
                return;
            case 5:
                gn0.e0(this.f37377b);
                return;
            case 6:
                gn0 gn0Var5 = this.f37377b;
                gn0Var5.f33981f = true;
                gn0Var5.L.callOnClick();
                gn0Var5.f33981f = false;
                return;
            case 7:
                gn0 gn0Var6 = this.f37377b;
                gn0Var6.S0 = 0;
                gn0Var6.D1();
                return;
            case 8:
                gn0 gn0Var7 = this.f37377b;
                gn0Var7.S0 = 4;
                gn0Var7.D1();
                return;
            case 9:
                this.f37377b.d1();
                return;
            case 10:
                gn0.b0(this.f37377b);
                return;
            case 11:
                gn0.c0(this.f37377b);
                return;
            case 12:
                this.f37377b.C1();
                return;
            case 13:
                gn0 gn0Var8 = this.f37377b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var8.getParentActivity());
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tl0(gn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                gn0Var8.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
                    return;
                }
                return;
            case 14:
                this.f37377b.C1();
                return;
            case 15:
                gn0.V(this.f37377b);
                return;
            default:
                gn0 gn0Var9 = this.f37377b;
                gn0Var9.f33981f = true;
                gn0Var9.L.callOnClick();
                gn0Var9.f33981f = false;
                return;
        }
    }
}
