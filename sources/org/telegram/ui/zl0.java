package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zl0 implements View.OnClickListener {
    public final int f39410a;
    public final on0 f39411b;

    public zl0(on0 on0Var, int i10) {
        this.f39410a = i10;
        this.f39411b = on0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39410a) {
            case 0:
                on0 on0Var = this.f39411b;
                on0Var.S0 = 2;
                on0Var.D1();
                return;
            case 1:
                this.f39411b.d1();
                return;
            case 2:
                on0 on0Var2 = this.f39411b;
                on0Var2.S0 = 3;
                on0Var2.D1();
                return;
            case 3:
                on0 on0Var3 = this.f39411b;
                on0Var3.S0 = 1;
                on0Var3.D1();
                return;
            case 4:
                on0 on0Var4 = this.f39411b;
                on0Var4.S0 = 4;
                on0Var4.D1();
                return;
            case 5:
                on0.e0(this.f39411b);
                return;
            case 6:
                on0 on0Var5 = this.f39411b;
                on0Var5.f35530f = true;
                on0Var5.L.callOnClick();
                on0Var5.f35530f = false;
                return;
            case 7:
                on0 on0Var6 = this.f39411b;
                on0Var6.S0 = 0;
                on0Var6.D1();
                return;
            case 8:
                on0 on0Var7 = this.f39411b;
                on0Var7.S0 = 4;
                on0Var7.D1();
                return;
            case 9:
                this.f39411b.d1();
                return;
            case 10:
                on0.b0(this.f39411b);
                return;
            case 11:
                on0.c0(this.f39411b);
                return;
            case 12:
                this.f39411b.C1();
                return;
            case 13:
                on0 on0Var8 = this.f39411b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(on0Var8.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bm0(on0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                on0Var8.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                    return;
                }
                return;
            case 14:
                this.f39411b.C1();
                return;
            case 15:
                on0.V(this.f39411b);
                return;
            default:
                on0 on0Var9 = this.f39411b;
                on0Var9.f35530f = true;
                on0Var9.L.callOnClick();
                on0Var9.f35530f = false;
                return;
        }
    }
}
