package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f43437a;
    public final k4 f43438b;
    public final String f43439c;

    public x(k4 k4Var, String str, int i10) {
        this.f43437a = i10;
        this.f43438b = k4Var;
        this.f43439c = str;
    }

    @Override
    public final void run() {
        switch (this.f43437a) {
            case 0:
                k4 k4Var = this.f43438b;
                ai.t tVar = k4Var.f38762h0.f43260b0;
                String str = this.f43439c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = k4Var.f38762h0.f43260b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(k4Var.f38762h0.f43260b0);
                return;
            default:
                pf.d.l(this.f43438b.L, this.f43439c, false, null);
                return;
        }
    }
}
