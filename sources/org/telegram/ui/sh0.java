package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class sh0 implements Runnable {
    public final int f41469a;
    public final mi0 f41470b;
    public final EditText f41471c;

    public sh0(mi0 mi0Var, EditText editText, int i10) {
        this.f41469a = i10;
        this.f41470b = mi0Var;
        this.f41471c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41469a) {
            case 0:
                mi0 mi0Var = this.f41470b;
                if (!mi0Var.f39273p0) {
                    try {
                        Window window = mi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        mi0Var.f39273p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new sh0(mi0Var, this.f41471c, 1), 100L);
                return;
            default:
                mi0 mi0Var2 = this.f41470b;
                int[] iArr = mi0Var2.f39272o0;
                AndroidUtilities.showKeyboard(this.f41471c);
                org.telegram.ui.Components.vg vgVar = mi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = mi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = mi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.mk.D(6.0f, width - vgVar2.m(), i10);
                    mi0Var2.X.setScaleX(mi0Var2.W.getScaleX());
                    mi0Var2.X.setScaleY(mi0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
