package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
public final class x implements Runnable {
    public final int f42521a;
    public final i4 f42522b;
    public final String f42523c;

    public x(i4 i4Var, String str, int i10) {
        this.f42521a = i10;
        this.f42522b = i4Var;
        this.f42523c = str;
    }

    @Override
    public final void run() {
        switch (this.f42521a) {
            case 0:
                i4 i4Var = this.f42522b;
                gi.o oVar = i4Var.f37221h0.f42278b0;
                String str = this.f42523c;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                oVar.setText(str);
                gi.o oVar2 = i4Var.f37221h0.f42278b0;
                oVar2.setSelection(oVar2.getText().length());
                AndroidUtilities.showKeyboard(i4Var.f37221h0.f42278b0);
                return;
            default:
                of.f.m(this.f42522b.L, this.f42523c, false, null);
                return;
        }
    }
}
