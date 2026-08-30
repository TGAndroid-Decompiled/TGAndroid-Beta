package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yh0 implements Runnable {
    public final int f40525a;
    public final si0 f40526b;
    public final EditText f40527c;

    public yh0(si0 si0Var, EditText editText, int i10) {
        this.f40525a = i10;
        this.f40526b = si0Var;
        this.f40527c = editText;
    }

    @Override
    public final void run() {
        switch (this.f40525a) {
            case 0:
                si0 si0Var = this.f40526b;
                if (!si0Var.m0) {
                    try {
                        Window window = si0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        si0Var.m0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new yh0(si0Var, this.f40527c, 1), 100L);
                return;
            default:
                si0 si0Var2 = this.f40526b;
                int[] iArr = si0Var2.f38365l0;
                AndroidUtilities.showKeyboard(this.f40527c);
                org.telegram.ui.Components.lg lgVar = si0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = si0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = si0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    si0Var2.U.setScaleX(si0Var2.T.getScaleX());
                    si0Var2.U.setScaleY(si0Var2.T.getScaleY());
                    return;
                }
                return;
        }
    }
}
