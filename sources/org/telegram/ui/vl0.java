package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vl0 implements View.OnClickListener {
    public final int f44379a;
    public final kn0 f44380b;

    public vl0(kn0 kn0Var, int i10) {
        this.f44379a = i10;
        this.f44380b = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44379a) {
            case 0:
                kn0 kn0Var = this.f44380b;
                kn0Var.S0 = 2;
                kn0Var.D1();
                return;
            case 1:
                this.f44380b.d1();
                return;
            case 2:
                kn0 kn0Var2 = this.f44380b;
                kn0Var2.S0 = 3;
                kn0Var2.D1();
                return;
            case 3:
                kn0 kn0Var3 = this.f44380b;
                kn0Var3.S0 = 1;
                kn0Var3.D1();
                return;
            case 4:
                kn0 kn0Var4 = this.f44380b;
                kn0Var4.S0 = 4;
                kn0Var4.D1();
                return;
            case 5:
                kn0 kn0Var5 = this.f44380b;
                if (kn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    kn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                y9 y9Var = new y9(0);
                y9Var.M = new hm0(kn0Var5);
                kn0Var5.presentFragment(y9Var);
                return;
            case 6:
                kn0 kn0Var6 = this.f44380b;
                kn0Var6.f40848f = true;
                kn0Var6.L.callOnClick();
                kn0Var6.f40848f = false;
                return;
            case 7:
                kn0 kn0Var7 = this.f44380b;
                kn0Var7.S0 = 0;
                kn0Var7.D1();
                return;
            case 8:
                kn0 kn0Var8 = this.f44380b;
                kn0Var8.S0 = 4;
                kn0Var8.D1();
                return;
            case 9:
                this.f44380b.d1();
                return;
            case 10:
                kn0.c0(this.f44380b);
                return;
            case 11:
                kn0.d0(this.f44380b);
                return;
            case 12:
                this.f44380b.C1();
                return;
            case 13:
                kn0 kn0Var9 = this.f44380b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var9.getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xl0(kn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                kn0Var9.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                    return;
                }
                return;
            case 14:
                this.f44380b.C1();
                return;
            case 15:
                kn0.W(this.f44380b);
                return;
            default:
                kn0 kn0Var10 = this.f44380b;
                kn0Var10.f40848f = true;
                kn0Var10.L.callOnClick();
                kn0Var10.f40848f = false;
                return;
        }
    }
}
