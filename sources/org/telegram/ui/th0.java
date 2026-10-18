package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class th0 implements Runnable {
    public final int f41736a;
    public final ni0 f41737b;
    public final EditText f41738c;

    public th0(ni0 ni0Var, EditText editText, int i10) {
        this.f41736a = i10;
        this.f41737b = ni0Var;
        this.f41738c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41736a) {
            case 0:
                ni0 ni0Var = this.f41737b;
                if (!ni0Var.f39467p0) {
                    try {
                        Window window = ni0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ni0Var.f39467p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new th0(ni0Var, this.f41738c, 1), 100L);
                return;
            default:
                ni0 ni0Var2 = this.f41737b;
                int[] iArr = ni0Var2.f39466o0;
                AndroidUtilities.showKeyboard(this.f41738c);
                org.telegram.ui.Components.vg vgVar = ni0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ni0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = ni0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.lk.D(6.0f, width - vgVar2.m(), i10);
                    ni0Var2.X.setScaleX(ni0Var2.W.getScaleX());
                    ni0Var2.X.setScaleY(ni0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
