package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class wh0 implements Runnable {
    public final int f43375a;
    public final qi0 f43376b;
    public final EditText f43377c;

    public wh0(qi0 qi0Var, EditText editText, int i10) {
        this.f43375a = i10;
        this.f43376b = qi0Var;
        this.f43377c = editText;
    }

    @Override
    public final void run() {
        switch (this.f43375a) {
            case 0:
                qi0 qi0Var = this.f43376b;
                if (!qi0Var.f40836o0) {
                    try {
                        Window window = qi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        qi0Var.f40836o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new wh0(qi0Var, this.f43377c, 1), 100L);
                return;
            default:
                qi0 qi0Var2 = this.f43376b;
                int[] iArr = qi0Var2.f40835n0;
                AndroidUtilities.showKeyboard(this.f43377c);
                org.telegram.ui.Components.vg vgVar = qi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = qi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = qi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.sl.D(6.0f, width - vgVar2.m(), i10);
                    qi0Var2.W.setScaleX(qi0Var2.V.getScaleX());
                    qi0Var2.W.setScaleY(qi0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
