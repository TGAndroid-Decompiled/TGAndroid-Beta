package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class th0 implements Runnable {

    public final int f42946a;

    public final ni0 f42947b;

    public final EditText f42948c;

    public th0(ni0 ni0Var, EditText editText, int i10) {
        this.f42946a = i10;
        this.f42947b = ni0Var;
        this.f42948c = editText;
    }

    @Override
    public final void run() {
        switch (this.f42946a) {
            case 0:
                ni0 ni0Var = this.f42947b;
                if (!ni0Var.f40856l0) {
                    try {
                        Window window = ni0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ni0Var.f40856l0 = true;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                AndroidUtilities.runOnUIThread(new th0(ni0Var, this.f42948c, 1), 100L);
                break;
            default:
                ni0 ni0Var2 = this.f42947b;
                int[] iArr = ni0Var2.f40855k0;
                AndroidUtilities.showKeyboard(this.f42948c);
                org.telegram.ui.Components.hg hgVar = ni0Var2.S;
                if (hgVar != null) {
                    hgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ni0Var2.S.getWidth();
                    org.telegram.ui.Components.hg hgVar2 = ni0Var2.S;
                    hgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.rl.C(6.0f, width - hgVar2.m(), i10);
                    ni0Var2.T.setScaleX(ni0Var2.S.getScaleX());
                    ni0Var2.T.setScaleY(ni0Var2.S.getScaleY());
                }
                break;
        }
    }
}
