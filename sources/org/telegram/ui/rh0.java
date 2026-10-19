package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class rh0 implements Runnable {
    public final int f41216a;
    public final li0 f41217b;
    public final EditText f41218c;

    public rh0(li0 li0Var, EditText editText, int i10) {
        this.f41216a = i10;
        this.f41217b = li0Var;
        this.f41218c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41216a) {
            case 0:
                li0 li0Var = this.f41217b;
                if (!li0Var.f38949p0) {
                    try {
                        Window window = li0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        li0Var.f38949p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new rh0(li0Var, this.f41218c, 1), 100L);
                return;
            default:
                li0 li0Var2 = this.f41217b;
                int[] iArr = li0Var2.f38948o0;
                AndroidUtilities.showKeyboard(this.f41218c);
                org.telegram.ui.Components.vg vgVar = li0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = li0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = li0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.lk.D(6.0f, width - vgVar2.m(), i10);
                    li0Var2.X.setScaleX(li0Var2.W.getScaleX());
                    li0Var2.X.setScaleY(li0Var2.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
