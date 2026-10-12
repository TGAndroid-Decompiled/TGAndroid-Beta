package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class y implements Runnable {
    public final int f44215a;
    public final i4 f44216b;
    public final String f44217c;

    public y(i4 i4Var, String str, int i10) {
        this.f44215a = i10;
        this.f44216b = i4Var;
        this.f44217c = str;
    }

    @Override
    public final void run() {
        switch (this.f44215a) {
            case 0:
                i4 i4Var = this.f44216b;
                fi.o oVar = i4Var.f38649h0.f43417b0;
                String str = this.f44217c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                fi.o oVar2 = i4Var.f38649h0.f43417b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f38649h0.f43417b0);
                return;
            default:
                of.f.m(this.f44216b.L, this.f44217c, false, null);
                return;
        }
    }
}
