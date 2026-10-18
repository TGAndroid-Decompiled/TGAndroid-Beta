package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43321a;
    public final l4 f43322b;
    public final String f43323c;

    public y(l4 l4Var, String str, int i10) {
        this.f43321a = i10;
        this.f43322b = l4Var;
        this.f43323c = str;
    }

    @Override
    public final void run() {
        switch (this.f43321a) {
            case 0:
                l4 l4Var = this.f43322b;
                ai.t tVar = l4Var.f38758h0.f42765b0;
                String str = this.f43323c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38758h0.f42765b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38758h0.f42765b0);
                return;
            default:
                pf.d.l(this.f43322b.L, this.f43323c, false, null);
                return;
        }
    }
}
