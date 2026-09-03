package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class zh0 implements Runnable {
    public final int f43966a;
    public final ti0 f43967b;
    public final EditText f43968c;

    public zh0(ti0 ti0Var, EditText editText, int i10) {
        this.f43966a = i10;
        this.f43967b = ti0Var;
        this.f43968c = editText;
    }

    @Override
    public final void run() {
        switch (this.f43966a) {
            case 0:
                ti0 ti0Var = this.f43967b;
                if (!ti0Var.m0) {
                    try {
                        Window window = ti0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ti0Var.m0 = true;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                AndroidUtilities.runOnUIThread(new zh0(ti0Var, this.f43968c, 1), 100L);
                return;
            default:
                ti0 ti0Var2 = this.f43967b;
                int[] iArr = ti0Var2.f41563l0;
                AndroidUtilities.showKeyboard(this.f43968c);
                org.telegram.ui.Components.lg lgVar = ti0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ti0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = ti0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    ti0Var2.U.setScaleX(ti0Var2.T.getScaleX());
                    ti0Var2.U.setScaleY(ti0Var2.T.getScaleY());
                    return;
                }
                return;
        }
    }
}
