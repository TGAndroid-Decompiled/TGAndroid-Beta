package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yl0 implements View.OnClickListener {
    public final int f44451a;
    public final mn0 f44452b;

    public yl0(mn0 mn0Var, int i10) {
        this.f44451a = i10;
        this.f44452b = mn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44451a) {
            case 0:
                mn0 mn0Var = this.f44452b;
                mn0Var.S0 = 2;
                mn0Var.C1();
                return;
            case 1:
                this.f44452b.c1();
                return;
            case 2:
                mn0 mn0Var2 = this.f44452b;
                mn0Var2.S0 = 3;
                mn0Var2.C1();
                return;
            case 3:
                mn0 mn0Var3 = this.f44452b;
                mn0Var3.S0 = 1;
                mn0Var3.C1();
                return;
            case 4:
                mn0 mn0Var4 = this.f44452b;
                mn0Var4.S0 = 4;
                mn0Var4.C1();
                return;
            case 5:
                mn0 mn0Var5 = this.f44452b;
                if (mn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    mn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                u9 u9Var = new u9(0);
                u9Var.M = new jm0(mn0Var5);
                mn0Var5.presentFragment(u9Var);
                return;
            case 6:
                mn0 mn0Var6 = this.f44452b;
                mn0Var6.f39996f = true;
                mn0Var6.L.callOnClick();
                mn0Var6.f39996f = false;
                return;
            case 7:
                mn0 mn0Var7 = this.f44452b;
                mn0Var7.S0 = 0;
                mn0Var7.C1();
                return;
            case 8:
                mn0 mn0Var8 = this.f44452b;
                mn0Var8.S0 = 4;
                mn0Var8.C1();
                return;
            case 9:
                this.f44452b.c1();
                return;
            case 10:
                mn0.b0(this.f44452b);
                return;
            case 11:
                mn0.c0(this.f44452b);
                return;
            case 12:
                this.f44452b.B1();
                return;
            case 13:
                mn0 mn0Var9 = this.f44452b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mn0Var9.getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new am0(mn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                mn0Var9.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
                    return;
                }
                return;
            case 14:
                this.f44452b.B1();
                return;
            case 15:
                mn0.V(this.f44452b);
                return;
            default:
                mn0 mn0Var10 = this.f44452b;
                mn0Var10.f39996f = true;
                mn0Var10.L.callOnClick();
                mn0Var10.f39996f = false;
                return;
        }
    }
}
