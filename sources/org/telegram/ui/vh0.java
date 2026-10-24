package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class vh0 implements Runnable {
    public final int f42745a;
    public final pi0 f42746b;
    public final EditText f42747c;

    public vh0(pi0 pi0Var, EditText editText, int i10) {
        this.f42745a = i10;
        this.f42746b = pi0Var;
        this.f42747c = editText;
    }

    @Override
    public final void run() {
        switch (this.f42745a) {
            case 0:
                pi0 pi0Var = this.f42746b;
                if (!pi0Var.f40567o0) {
                    try {
                        Window window = pi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        pi0Var.f40567o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new vh0(pi0Var, this.f42747c, 1), 100L);
                return;
            default:
                pi0 pi0Var2 = this.f42746b;
                int[] iArr = pi0Var2.f40566n0;
                AndroidUtilities.showKeyboard(this.f42747c);
                org.telegram.ui.Components.tg tgVar = pi0Var2.V;
                if (tgVar != null) {
                    tgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = pi0Var2.V.getWidth();
                    org.telegram.ui.Components.tg tgVar2 = pi0Var2.V;
                    tgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.tl.D(6.0f, width - tgVar2.m(), i10);
                    pi0Var2.W.setScaleX(pi0Var2.V.getScaleX());
                    pi0Var2.W.setScaleY(pi0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
