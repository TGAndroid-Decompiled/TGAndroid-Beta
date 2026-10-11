package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f43933a;
    public final h4 f43934b;
    public final String f43935c;

    public x(h4 h4Var, String str, int i10) {
        this.f43933a = i10;
        this.f43934b = h4Var;
        this.f43935c = str;
    }

    @Override
    public final void run() {
        switch (this.f43933a) {
            case 0:
                h4 h4Var = this.f43934b;
                fi.o oVar = h4Var.f38307h0.f43701b0;
                String str = this.f43935c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = h4Var.f38307h0.f43701b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(h4Var.f38307h0.f43701b0);
                return;
            default:
                of.f.m(this.f43934b.L, this.f43935c, false, null);
                return;
        }
    }
}
