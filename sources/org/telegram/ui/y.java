package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43308a;
    public final l4 f43309b;
    public final String f43310c;

    public y(l4 l4Var, String str, int i10) {
        this.f43308a = i10;
        this.f43309b = l4Var;
        this.f43310c = str;
    }

    @Override
    public final void run() {
        switch (this.f43308a) {
            case 0:
                l4 l4Var = this.f43309b;
                ai.t tVar = l4Var.f38760h0.f42782b0;
                String str = this.f43310c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38760h0.f42782b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38760h0.f42782b0);
                return;
            default:
                pf.d.l(this.f43309b.L, this.f43310c, false, null);
                return;
        }
    }
}
