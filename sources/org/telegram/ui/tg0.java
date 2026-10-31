package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class tg0 implements Runnable {
    public final int f41840a;
    public final kh0 f41841b;
    public final EditText f41842c;

    public tg0(kh0 kh0Var, EditText editText, int i10) {
        this.f41840a = i10;
        this.f41841b = kh0Var;
        this.f41842c = editText;
    }

    @Override
    public final void run() {
        switch (this.f41840a) {
            case 0:
                kh0 kh0Var = this.f41841b;
                if (!kh0Var.f38846o0) {
                    try {
                        Window window = kh0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        kh0Var.f38846o0 = true;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.h3(new tg0(kh0Var, this.f41842c, 1), 100L);
                return;
            default:
                kh0 kh0Var2 = this.f41841b;
                int[] iArr = kh0Var2.f38845n0;
                org.telegram.messenger.i0.J3(this.f41842c);
                org.telegram.ui.Components.zf zfVar = kh0Var2.V;
                if (zfVar != null) {
                    zfVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = kh0Var2.V.getWidth();
                    org.telegram.ui.Components.zf zfVar2 = kh0Var2.V;
                    zfVar2.getHeight();
                    iArr[0] = org.telegram.messenger.z20.D(6.0f, width - zfVar2.m(), i10);
                    kh0Var2.W.setScaleX(kh0Var2.V.getScaleX());
                    kh0Var2.W.setScaleY(kh0Var2.V.getScaleY());
                    return;
                }
                return;
        }
    }
}
