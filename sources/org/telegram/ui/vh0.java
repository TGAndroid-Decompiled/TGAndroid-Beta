package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class vh0 implements Runnable {
    public final int f44354a;
    public final pi0 f44355b;
    public final EditText f44356c;

    public vh0(pi0 pi0Var, EditText editText, int i10) {
        this.f44354a = i10;
        this.f44355b = pi0Var;
        this.f44356c = editText;
    }

    @Override
    public final void run() {
        switch (this.f44354a) {
            case 0:
                pi0 pi0Var = this.f44355b;
                if (!pi0Var.f42425o0) {
                    try {
                        Window window = pi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        pi0Var.f42425o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new vh0(pi0Var, this.f44356c, 1), 100L);
                return;
            default:
                pi0 pi0Var2 = this.f44355b;
                int[] iArr = pi0Var2.f42424n0;
                AndroidUtilities.showKeyboard(this.f44356c);
                org.telegram.ui.Components.vg vgVar = pi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = pi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = pi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = d3.w(6.0f, width - vgVar2.m(), i10);
                    pi0Var2.W.setScaleX(pi0Var2.V.getScaleX());
                    pi0Var2.W.setScaleY(pi0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
