package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f41993a;
    public final k4 f41994b;
    public final String f41995c;

    public y(k4 k4Var, String str, int i10) {
        this.f41993a = i10;
        this.f41994b = k4Var;
        this.f41995c = str;
    }

    @Override
    public final void run() {
        switch (this.f41993a) {
            case 0:
                k4 k4Var = this.f41994b;
                gi.o oVar = k4Var.f37545h0.f41503b0;
                String str = this.f41995c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = k4Var.f37545h0.f41503b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.f37545h0.f41503b0);
                return;
            default:
                pf.d.m(this.f41994b.L, this.f41995c, false, null);
                return;
        }
    }
}
