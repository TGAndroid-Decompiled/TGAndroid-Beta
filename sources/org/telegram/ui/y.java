package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f44218a;
    public final i4 f44219b;
    public final String f44220c;

    public y(i4 i4Var, String str, int i10) {
        this.f44218a = i10;
        this.f44219b = i4Var;
        this.f44220c = str;
    }

    @Override
    public final void run() {
        switch (this.f44218a) {
            case 0:
                i4 i4Var = this.f44219b;
                fi.o oVar = i4Var.f38547h0.f43523b0;
                String str = this.f44220c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f38547h0.f43523b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f38547h0.f43523b0);
                return;
            default:
                of.f.m(this.f44219b.L, this.f44220c, false, null);
                return;
        }
    }
}
