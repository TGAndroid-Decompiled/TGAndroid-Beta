package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f40011a;
    public final i4 f40012b;
    public final String f40013c;

    public y(i4 i4Var, String str, int i10) {
        this.f40011a = i10;
        this.f40012b = i4Var;
        this.f40013c = str;
    }

    @Override
    public final void run() {
        switch (this.f40011a) {
            case 0:
                i4 i4Var = this.f40012b;
                fi.o oVar = i4Var.f34396h0.f39230b0;
                String str = this.f40013c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34396h0.f39230b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34396h0.f39230b0);
                return;
            default:
                nf.f.m(this.f40012b.L, this.f40013c, false, null);
                return;
        }
    }
}
