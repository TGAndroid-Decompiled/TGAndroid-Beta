package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f40116a;
    public final i4 f40117b;
    public final String f40118c;

    public y(i4 i4Var, String str, int i10) {
        this.f40116a = i10;
        this.f40117b = i4Var;
        this.f40118c = str;
    }

    @Override
    public final void run() {
        switch (this.f40116a) {
            case 0:
                i4 i4Var = this.f40117b;
                fi.o oVar = i4Var.f34490h0.f39318b0;
                String str = this.f40118c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34490h0.f39318b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34490h0.f39318b0);
                return;
            default:
                nf.f.m(this.f40117b.L, this.f40118c, false, null);
                return;
        }
    }
}
