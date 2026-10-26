package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tl0 implements View.OnClickListener {
    public final int f43867a;
    public final in0 f43868b;

    public tl0(in0 in0Var, int i10) {
        this.f43867a = i10;
        this.f43868b = in0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43867a) {
            case 0:
                in0 in0Var = this.f43868b;
                in0Var.S0 = 2;
                in0Var.D1();
                return;
            case 1:
                this.f43868b.d1();
                return;
            case 2:
                in0 in0Var2 = this.f43868b;
                in0Var2.S0 = 3;
                in0Var2.D1();
                return;
            case 3:
                in0 in0Var3 = this.f43868b;
                in0Var3.S0 = 1;
                in0Var3.D1();
                return;
            case 4:
                in0 in0Var4 = this.f43868b;
                in0Var4.S0 = 4;
                in0Var4.D1();
                return;
            case 5:
                in0 in0Var5 = this.f43868b;
                if (in0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    in0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                y9 y9Var = new y9(0);
                y9Var.M = new fm0(in0Var5);
                in0Var5.presentFragment(y9Var);
                return;
            case 6:
                in0 in0Var6 = this.f43868b;
                in0Var6.f40285f = true;
                in0Var6.L.callOnClick();
                in0Var6.f40285f = false;
                return;
            case 7:
                in0 in0Var7 = this.f43868b;
                in0Var7.S0 = 0;
                in0Var7.D1();
                return;
            case 8:
                in0 in0Var8 = this.f43868b;
                in0Var8.S0 = 4;
                in0Var8.D1();
                return;
            case 9:
                this.f43868b.d1();
                return;
            case 10:
                in0.c0(this.f43868b);
                return;
            case 11:
                in0.d0(this.f43868b);
                return;
            case 12:
                this.f43868b.C1();
                return;
            case 13:
                in0 in0Var9 = this.f43868b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(in0Var9.getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(in0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                in0Var9.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                    return;
                }
                return;
            case 14:
                this.f43868b.C1();
                return;
            case 15:
                in0.W(this.f43868b);
                return;
            default:
                in0 in0Var10 = this.f43868b;
                in0Var10.f40285f = true;
                in0Var10.L.callOnClick();
                in0Var10.f40285f = false;
                return;
        }
    }
}
