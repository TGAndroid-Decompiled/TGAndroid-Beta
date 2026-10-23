package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43318a;
    public final l4 f43319b;
    public final String f43320c;

    public y(l4 l4Var, String str, int i10) {
        this.f43318a = i10;
        this.f43319b = l4Var;
        this.f43320c = str;
    }

    @Override
    public final void run() {
        switch (this.f43318a) {
            case 0:
                l4 l4Var = this.f43319b;
                ai.t tVar = l4Var.f38771h0.f42792b0;
                String str = this.f43320c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38771h0.f42792b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38771h0.f42792b0);
                return;
            default:
                pf.d.l(this.f43319b.L, this.f43320c, false, null);
                return;
        }
    }
}
