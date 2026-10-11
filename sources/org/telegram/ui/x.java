package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f43899a;
    public final h4 f43900b;
    public final String f43901c;

    public x(h4 h4Var, String str, int i10) {
        this.f43899a = i10;
        this.f43900b = h4Var;
        this.f43901c = str;
    }

    @Override
    public final void run() {
        switch (this.f43899a) {
            case 0:
                h4 h4Var = this.f43900b;
                fi.o oVar = h4Var.f38273h0.f43667b0;
                String str = this.f43901c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f38273h0.f43667b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f38273h0.f43667b0);
                return;
            default:
                of.f.m(this.f43900b.L, this.f43901c, false, null);
                return;
        }
    }
}
