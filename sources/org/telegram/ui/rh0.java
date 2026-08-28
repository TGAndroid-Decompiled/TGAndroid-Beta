package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class rh0 implements Runnable {
    public final int f42431a;
    public final li0 f42432b;
    public final EditText f42433c;

    public rh0(li0 li0Var, EditText editText, int i9) {
        this.f42431a = i9;
        this.f42432b = li0Var;
        this.f42433c = editText;
    }

    @Override
    public final void run() {
        switch (this.f42431a) {
            case 0:
                li0 li0Var = this.f42432b;
                if (!li0Var.f40163l0) {
                    try {
                        Window window = li0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        li0Var.f40163l0 = true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                AndroidUtilities.runOnUIThread(new rh0(li0Var, this.f42433c, 1), 100L);
                return;
            default:
                li0 li0Var2 = this.f42432b;
                int[] iArr = li0Var2.f40162k0;
                AndroidUtilities.showKeyboard(this.f42433c);
                org.telegram.ui.Components.lg lgVar = li0Var2.S;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i9 = iArr[0];
                    int width = li0Var2.S.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = li0Var2.S;
                    lgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ll.D(6.0f, width - lgVar2.m(), i9);
                    li0Var2.T.setScaleX(li0Var2.S.getScaleX());
                    li0Var2.T.setScaleY(li0Var2.S.getScaleY());
                    return;
                }
                return;
        }
    }
}
