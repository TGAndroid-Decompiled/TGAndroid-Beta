package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class sh0 implements Runnable {
    public final int f41473a;
    public final mi0 f41474b;
    public final EditText f41475c;

    public sh0(mi0 mi0Var, EditText editText, int i10) {
        this.f41473a = i10;
        this.f41474b = mi0Var;
        this.f41475c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41473a) {
            case 0:
                mi0 mi0Var = this.f41474b;
                if (!mi0Var.f39277o0) {
                    try {
                        Window window = mi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        mi0Var.f39277o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new sh0(mi0Var, this.f41475c, 1), 100L);
                return;
            default:
                mi0 mi0Var2 = this.f41474b;
                int[] iArr = mi0Var2.f39276n0;
                AndroidUtilities.showKeyboard(this.f41475c);
                org.telegram.ui.Components.vg vgVar = mi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = mi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = mi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.nk.D(6.0f, width - vgVar2.m(), i10);
                    mi0Var2.W.setScaleX(mi0Var2.V.getScaleX());
                    mi0Var2.W.setScaleY(mi0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
