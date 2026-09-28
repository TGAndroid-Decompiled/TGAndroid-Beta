package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f40010a;
    public final i4 f40011b;
    public final String f40012c;

    public y(i4 i4Var, String str, int i10) {
        this.f40010a = i10;
        this.f40011b = i4Var;
        this.f40012c = str;
    }

    @Override
    public final void run() {
        switch (this.f40010a) {
            case 0:
                i4 i4Var = this.f40011b;
                fi.o oVar = i4Var.f34395h0.f39229b0;
                String str = this.f40012c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34395h0.f39229b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34395h0.f39229b0);
                return;
            default:
                nf.f.m(this.f40011b.L, this.f40012c, false, null);
                return;
        }
    }
}
