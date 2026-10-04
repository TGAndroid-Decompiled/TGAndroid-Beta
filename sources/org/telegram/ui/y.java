package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f42979a;
    public final i4 f42980b;
    public final String f42981c;

    public y(i4 i4Var, String str, int i10) {
        this.f42979a = i10;
        this.f42980b = i4Var;
        this.f42981c = str;
    }

    @Override
    public final void run() {
        switch (this.f42979a) {
            case 0:
                i4 i4Var = this.f42980b;
                fi.o oVar = i4Var.f37268h0.f42375b0;
                String str = this.f42981c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f37268h0.f42375b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37268h0.f42375b0);
                return;
            default:
                nf.f.m(this.f42980b.L, this.f42981c, false, null);
                return;
        }
    }
}
