package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f41694a;
    public final k4 f41695b;
    public final String f41696c;

    public y(k4 k4Var, String str, int i10) {
        this.f41694a = i10;
        this.f41695b = k4Var;
        this.f41696c = str;
    }

    @Override
    public final void run() {
        switch (this.f41694a) {
            case 0:
                k4 k4Var = this.f41695b;
                gi.o oVar = k4Var.f37266h0.f41204b0;
                String str = this.f41696c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = k4Var.f37266h0.f41204b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.f37266h0.f41204b0);
                return;
            default:
                pf.d.l(this.f41695b.L, this.f41696c, false, null);
                return;
        }
    }
}
