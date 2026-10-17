package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f43297a;
    public final l4 f43298b;
    public final String f43299c;

    public y(l4 l4Var, String str, int i10) {
        this.f43297a = i10;
        this.f43298b = l4Var;
        this.f43299c = str;
    }

    @Override
    public final void run() {
        switch (this.f43297a) {
            case 0:
                l4 l4Var = this.f43298b;
                ai.t tVar = l4Var.f38767h0.f42740b0;
                String str = this.f43299c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                tVar.setText(str);
                ai.t tVar2 = l4Var.f38767h0.f42740b0;
                tVar2.setSelection(tVar2.getText().length());
                AndroidUtilities.showKeyboard(l4Var.f38767h0.f42740b0);
                return;
            default:
                pf.d.l(this.f43298b.L, this.f43299c, false, null);
                return;
        }
    }
}
