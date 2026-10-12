package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f44220a;
    public final i4 f44221b;
    public final String f44222c;

    public y(i4 i4Var, String str, int i10) {
        this.f44220a = i10;
        this.f44221b = i4Var;
        this.f44222c = str;
    }

    @Override
    public final void run() {
        switch (this.f44220a) {
            case 0:
                i4 i4Var = this.f44221b;
                fi.o oVar = i4Var.f38652h0.f43422b0;
                String str = this.f44222c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f38652h0.f43422b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f38652h0.f43422b0);
                return;
            default:
                of.f.m(this.f44221b.L, this.f44222c, false, null);
                return;
        }
    }
}
