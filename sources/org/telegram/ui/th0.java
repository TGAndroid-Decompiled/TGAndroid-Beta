package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class th0 implements Runnable {
    public final int f43839a;
    public final ni0 f43840b;
    public final EditText f43841c;

    public th0(ni0 ni0Var, EditText editText, int i10) {
        this.f43839a = i10;
        this.f43840b = ni0Var;
        this.f43841c = editText;
    }

    @Override
    public final void run() {
        switch (this.f43839a) {
            case 0:
                ni0 ni0Var = this.f43840b;
                if (!ni0Var.f41919o0) {
                    try {
                        Window window = ni0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ni0Var.f41919o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new th0(ni0Var, this.f43841c, 1), 100L);
                return;
            default:
                ni0 ni0Var2 = this.f43840b;
                int[] iArr = ni0Var2.f41918n0;
                AndroidUtilities.showKeyboard(this.f43841c);
                org.telegram.ui.Components.vg vgVar = ni0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ni0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = ni0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = d3.w(6.0f, width - vgVar2.m(), i10);
                    ni0Var2.W.setScaleX(ni0Var2.V.getScaleX());
                    ni0Var2.W.setScaleY(ni0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
