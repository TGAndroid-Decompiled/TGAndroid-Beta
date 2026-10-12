package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vd implements View.OnFocusChangeListener {
    public final int f40965a;
    public final Object f40966b;

    public vd(Object obj, int i10) {
        this.f40965a = i10;
        this.f40966b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f40965a) {
            case 0:
                fe feVar = ((qe) this.f40966b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                feVar.b(f7, f7, true);
                return;
            case 1:
                yy yyVar = (yy) this.f40966b;
                if (z10) {
                    yyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                bh0 bh0Var = ((le0) this.f40966b).W;
                if (z10) {
                    bh0Var.f34547c.setEditText((EditText) view);
                    bh0Var.f34547c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yd0 yd0Var = (org.telegram.ui.Components.yd0) this.f40966b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yd0 yd0Var2 = ((ue0) this.f40966b).f40664x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.yd0 yd0Var3 = ((cf0) this.f40966b).f34927b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yd0Var3.b(f12, f12, true);
                return;
            case 6:
                bh0 bh0Var2 = ((ff0) this.f40966b).f35822y;
                if (z10) {
                    bh0Var2.f34547c.setEditText((EditText) view);
                    bh0Var2.f34547c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yd0 yd0Var4 = ((qf0) this.f40966b).f39427a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yd0Var4.b(f13, f13, true);
                return;
            case 8:
                bh0 bh0Var3 = ((eg0) this.f40966b).f35566s0;
                if (z10) {
                    bh0Var3.f34547c.setEditText((EditText) view);
                    bh0Var3.f34547c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yd0 yd0Var5 = ((ah0) this.f40966b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.yd0 yd0Var6 = ((PasscodeActivity) this.f40966b).f32176f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yd0Var6.b(f15, f15, true);
                return;
            case 11:
                he1 he1Var = (he1) this.f40966b;
                if (z10) {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.yd0 yd0Var7 = ((TwoStepVerificationActivity) this.f40966b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                yd0Var7.b(f16, f16, true);
                return;
        }
    }
}
