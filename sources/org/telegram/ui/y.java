package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f39683a;
    public final i4 f39684b;
    public final String f39685c;

    public y(i4 i4Var, String str, int i10) {
        this.f39683a = i10;
        this.f39684b = i4Var;
        this.f39685c = str;
    }

    @Override
    public final void run() {
        switch (this.f39683a) {
            case 0:
                i4 i4Var = this.f39684b;
                fi.o oVar = i4Var.f34009h0.f38848b0;
                String str = this.f39685c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34009h0.f38848b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34009h0.f38848b0);
                return;
            default:
                nf.f.m(this.f39684b.L, this.f39685c, false, null);
                return;
        }
    }
}
