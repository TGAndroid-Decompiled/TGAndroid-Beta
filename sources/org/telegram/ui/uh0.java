package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class uh0 implements Runnable {
    public final int f41989a;
    public final oi0 f41990b;
    public final EditText f41991c;

    public uh0(oi0 oi0Var, EditText editText, int i10) {
        this.f41989a = i10;
        this.f41990b = oi0Var;
        this.f41991c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41989a) {
            case 0:
                oi0 oi0Var = this.f41990b;
                if (!oi0Var.f39806p0) {
                    try {
                        Window window = oi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        oi0Var.f39806p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new uh0(oi0Var, this.f41991c, 1), 100L);
                return;
            default:
                oi0 oi0Var2 = this.f41990b;
                int[] iArr = oi0Var2.f39805o0;
                AndroidUtilities.showKeyboard(this.f41991c);
                org.telegram.ui.Components.vg vgVar = oi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = oi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = oi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.ui.Cells.t0.e(6.0f, width - vgVar2.m(), i10);
                    oi0Var2.X.setScaleX(oi0Var2.W.getScaleX());
                    oi0Var2.X.setScaleY(oi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
