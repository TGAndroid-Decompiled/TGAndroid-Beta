package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f38852a;
    public final j4 f38853b;
    public final String f38854c;

    public y(j4 j4Var, String str, int i10) {
        this.f38852a = i10;
        this.f38853b = j4Var;
        this.f38854c = str;
    }

    @Override
    public final void run() {
        switch (this.f38852a) {
            case 0:
                j4 j4Var = this.f38853b;
                ei.o oVar = j4Var.f33908h0.f38103b0;
                String str = this.f38854c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                ei.o oVar2 = j4Var.f33908h0.f38103b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(j4Var.f33908h0.f38103b0);
                return;
            default:
                nf.f.m(this.f38853b.L, this.f38854c, false, null);
                return;
        }
    }
}
