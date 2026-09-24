package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f39995a;
    public final i4 f39996b;
    public final String f39997c;

    public y(i4 i4Var, String str, int i10) {
        this.f39995a = i10;
        this.f39996b = i4Var;
        this.f39997c = str;
    }

    @Override
    public final void run() {
        switch (this.f39995a) {
            case 0:
                i4 i4Var = this.f39996b;
                fi.o oVar = i4Var.f34382h0.f39214b0;
                String str = this.f39997c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f34382h0.f39214b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f34382h0.f39214b0);
                return;
            default:
                nf.f.m(this.f39996b.L, this.f39997c, false, null);
                return;
        }
    }
}
