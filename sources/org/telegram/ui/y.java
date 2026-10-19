package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43304a;
    public final l4 f43305b;
    public final String f43306c;

    public y(l4 l4Var, String str, int i10) {
        this.f43304a = i10;
        this.f43305b = l4Var;
        this.f43306c = str;
    }

    @Override
    public final void run() {
        switch (this.f43304a) {
            case 0:
                l4 l4Var = this.f43305b;
                ai.t tVar = l4Var.f38762h0.f42781b0;
                String str = this.f43306c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38762h0.f42781b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38762h0.f42781b0);
                return;
            default:
                pf.d.l(this.f43305b.L, this.f43306c, false, null);
                return;
        }
    }
}
