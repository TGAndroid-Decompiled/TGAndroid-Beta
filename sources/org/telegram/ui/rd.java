package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rd implements View.OnFocusChangeListener {
    public final int f42958a;
    public final Object f42959b;

    public rd(Object obj, int i10) {
        this.f42958a = i10;
        this.f42959b = obj;
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
        switch (this.f42958a) {
            case 0:
                bi.s sVar = ((ke) this.f42959b).K0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                ey eyVar = (ey) this.f42959b;
                if (z10) {
                    eyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ig0 ig0Var = ((qd0) this.f42959b).W;
                if (z10) {
                    ig0Var.f40144c.setEditText((EditText) view);
                    ig0Var.f40144c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.f42959b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var2 = ((ae0) this.f42959b).f37756x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                sd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.sd0 sd0Var3 = ((ie0) this.f42959b).f40122b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                sd0Var3.b(f12, f12, true);
                return;
            case 6:
                ig0 ig0Var2 = ((le0) this.f42959b).f41101y;
                if (z10) {
                    ig0Var2.f40144c.setEditText((EditText) view);
                    ig0Var2.f40144c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.sd0 sd0Var4 = ((xe0) this.f42959b).f45663a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                sd0Var4.b(f13, f13, true);
                return;
            case 8:
                ig0 ig0Var3 = ((lf0) this.f42959b).f41134u0;
                if (z10) {
                    ig0Var3.f40144c.setEditText((EditText) view);
                    ig0Var3.f40144c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.sd0 sd0Var5 = ((hg0) this.f42959b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                sd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.sd0 sd0Var6 = ((PasscodeActivity) this.f42959b).f35620f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                sd0Var6.b(f15, f15, true);
                return;
            case 11:
                ad1 ad1Var = (ad1) this.f42959b;
                if (z10) {
                    ad1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ad1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.sd0 sd0Var7 = ((TwoStepVerificationActivity) this.f42959b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                sd0Var7.b(f16, f16, true);
                return;
        }
    }
}
