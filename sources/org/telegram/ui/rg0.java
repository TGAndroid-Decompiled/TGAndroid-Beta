package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class rg0 implements Runnable {
    public final int f41086a;
    public final ih0 f41087b;
    public final EditText f41088c;

    public rg0(ih0 ih0Var, EditText editText, int i10) {
        this.f41086a = i10;
        this.f41087b = ih0Var;
        this.f41088c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41086a) {
            case 0:
                ih0 ih0Var = this.f41087b;
                if (!ih0Var.f38076o0) {
                    try {
                        Window window = ih0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ih0Var.f38076o0 = true;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.h3(new rg0(ih0Var, this.f41088c, 1), 100L);
                return;
            default:
                ih0 ih0Var2 = this.f41087b;
                int[] iArr = ih0Var2.f38075n0;
                org.telegram.messenger.i0.J3(this.f41088c);
                org.telegram.ui.Components.zf zfVar = ih0Var2.V;
                if (zfVar != null) {
                    zfVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ih0Var2.V.getWidth();
                    org.telegram.ui.Components.zf zfVar2 = ih0Var2.V;
                    zfVar2.getHeight();
                    iArr[0] = org.telegram.messenger.a30.D(6.0f, width - zfVar2.m(), i10);
                    ih0Var2.W.setScaleX(ih0Var2.V.getScaleX());
                    ih0Var2.W.setScaleY(ih0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
