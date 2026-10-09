package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zl0 implements View.OnClickListener {
    public final int f44689a;
    public final nn0 f44690b;

    public zl0(nn0 nn0Var, int i10) {
        this.f44689a = i10;
        this.f44690b = nn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44689a) {
            case 0:
                nn0 nn0Var = this.f44690b;
                nn0Var.S0 = 2;
                nn0Var.C1();
                return;
            case 1:
                this.f44690b.c1();
                return;
            case 2:
                nn0 nn0Var2 = this.f44690b;
                nn0Var2.S0 = 3;
                nn0Var2.C1();
                return;
            case 3:
                nn0 nn0Var3 = this.f44690b;
                nn0Var3.S0 = 1;
                nn0Var3.C1();
                return;
            case 4:
                nn0 nn0Var4 = this.f44690b;
                nn0Var4.S0 = 4;
                nn0Var4.C1();
                return;
            case 5:
                nn0 nn0Var5 = this.f44690b;
                if (nn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    nn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                v9 v9Var = new v9(0);
                v9Var.M = new km0(nn0Var5);
                nn0Var5.presentFragment(v9Var);
                return;
            case 6:
                nn0 nn0Var6 = this.f44690b;
                nn0Var6.f40252f = true;
                nn0Var6.L.callOnClick();
                nn0Var6.f40252f = false;
                return;
            case 7:
                nn0 nn0Var7 = this.f44690b;
                nn0Var7.S0 = 0;
                nn0Var7.C1();
                return;
            case 8:
                nn0 nn0Var8 = this.f44690b;
                nn0Var8.S0 = 4;
                nn0Var8.C1();
                return;
            case 9:
                this.f44690b.c1();
                return;
            case 10:
                nn0.b0(this.f44690b);
                return;
            case 11:
                nn0.c0(this.f44690b);
                return;
            case 12:
                this.f44690b.B1();
                return;
            case 13:
                nn0 nn0Var9 = this.f44690b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var9.getParentActivity());
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bm0(nn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                nn0Var9.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                    return;
                }
                return;
            case 14:
                this.f44690b.B1();
                return;
            case 15:
                nn0.V(this.f44690b);
                return;
            default:
                nn0 nn0Var10 = this.f44690b;
                nn0Var10.f40252f = true;
                nn0Var10.L.callOnClick();
                nn0Var10.f40252f = false;
                return;
        }
    }
}
