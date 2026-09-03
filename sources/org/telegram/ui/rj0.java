package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class rj0 extends AnimatedPhoneNumberEditText {
    public final int D;
    public final Object E;

    public rj0(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        float f11;
        float f12;
        switch (this.D) {
            case 0:
                super.onFocusChanged(z4, i10, rect);
                uj0 uj0Var = (uj0) this.E;
                org.telegram.ui.Components.cd0 cd0Var = uj0Var.f41859s;
                if (!z4 && !uj0Var.N.isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                cd0Var.b(f10, f10, true);
                return;
            case 1:
                super.onFocusChanged(z4, i10, rect);
                uj0 uj0Var2 = (uj0) this.E;
                org.telegram.ui.Components.cd0 cd0Var2 = uj0Var2.f41859s;
                if (!z4 && !uj0Var2.L.isFocused()) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                cd0Var2.b(f11, f11, true);
                return;
            default:
                super.onFocusChanged(z4, i10, rect);
                ng0 ng0Var = (ng0) this.E;
                org.telegram.ui.Components.cd0 cd0Var3 = ng0Var.f39347f;
                if (!z4 && !ng0Var.f39344b.isFocused()) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                cd0Var3.b(f12, f12, true);
                if (z4) {
                    ng0Var.S.f39714c.setEditText(this);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.D) {
            case 1:
                uj0 uj0Var = (uj0) this.E;
                if (i10 == 67 && uj0Var.N.length() == 0) {
                    uj0Var.L.requestFocus();
                    rj0 rj0Var = uj0Var.L;
                    rj0Var.setSelection(rj0Var.length());
                    uj0Var.L.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
