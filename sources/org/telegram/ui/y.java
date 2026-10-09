package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f44174a;
    public final i4 f44175b;
    public final String f44176c;

    public y(i4 i4Var, String str, int i10) {
        this.f44174a = i10;
        this.f44175b = i4Var;
        this.f44176c = str;
    }

    @Override
    public final void run() {
        switch (this.f44174a) {
            case 0:
                i4 i4Var = this.f44175b;
                fi.o oVar = i4Var.f38503h0.f43479b0;
                String str = this.f44176c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f38503h0.f43479b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f38503h0.f43479b0);
                return;
            default:
                of.f.m(this.f44175b.L, this.f44176c, false, null);
                return;
        }
    }
}
