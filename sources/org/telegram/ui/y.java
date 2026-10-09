package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f44172a;
    public final i4 f44173b;
    public final String f44174c;

    public y(i4 i4Var, String str, int i10) {
        this.f44172a = i10;
        this.f44173b = i4Var;
        this.f44174c = str;
    }

    @Override
    public final void run() {
        switch (this.f44172a) {
            case 0:
                i4 i4Var = this.f44173b;
                fi.o oVar = i4Var.f38501h0.f43477b0;
                String str = this.f44174c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f38501h0.f43477b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f38501h0.f43477b0);
                return;
            default:
                of.f.m(this.f44173b.L, this.f44174c, false, null);
                return;
        }
    }
}
