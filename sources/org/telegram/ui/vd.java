package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vd implements View.OnFocusChangeListener {
    public final int f40677a;
    public final Object f40678b;

    public vd(Object obj, int i10) {
        this.f40677a = i10;
        this.f40678b = obj;
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
        switch (this.f40677a) {
            case 0:
                fe feVar = ((qe) this.f40678b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                feVar.b(f7, f7, true);
                return;
            case 1:
                yy yyVar = (yy) this.f40678b;
                if (z10) {
                    yyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ah0 ah0Var = ((je0) this.f40678b).W;
                if (z10) {
                    ah0Var.f33909c.setEditText((EditText) view);
                    ah0Var.f33909c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yd0 yd0Var = (org.telegram.ui.Components.yd0) this.f40678b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yd0 yd0Var2 = ((te0) this.f40678b).f40094x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.yd0 yd0Var3 = ((bf0) this.f40678b).f34313b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yd0Var3.b(f12, f12, true);
                return;
            case 6:
                ah0 ah0Var2 = ((ef0) this.f40678b).f35286y;
                if (z10) {
                    ah0Var2.f33909c.setEditText((EditText) view);
                    ah0Var2.f33909c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yd0 yd0Var4 = ((pf0) this.f40678b).f38906a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yd0Var4.b(f13, f13, true);
                return;
            case 8:
                ah0 ah0Var3 = ((dg0) this.f40678b).f35010s0;
                if (z10) {
                    ah0Var3.f33909c.setEditText((EditText) view);
                    ah0Var3.f33909c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yd0 yd0Var5 = ((zg0) this.f40678b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.yd0 yd0Var6 = ((PasscodeActivity) this.f40678b).f31878f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yd0Var6.b(f15, f15, true);
                return;
            case 11:
                he1 he1Var = (he1) this.f40678b;
                if (z10) {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.yd0 yd0Var7 = ((TwoStepVerificationActivity) this.f40678b).v;
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
