package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rd implements View.OnFocusChangeListener {
    public final int f40693a;
    public final Object f40694b;

    public rd(Object obj, int i10) {
        this.f40693a = i10;
        this.f40694b = obj;
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
        switch (this.f40693a) {
            case 0:
                ai.s sVar = ((ke) this.f40694b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                ey eyVar = (ey) this.f40694b;
                if (z10) {
                    eyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                eg0 eg0Var = ((od0) this.f40694b).W;
                if (z10) {
                    eg0Var.f36493c.setEditText((EditText) view);
                    eg0Var.f36493c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.f40694b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var2 = ((xd0) this.f40694b).f43082x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                sd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.sd0 sd0Var3 = ((fe0) this.f40694b).f36889b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                sd0Var3.b(f12, f12, true);
                return;
            case 6:
                eg0 eg0Var2 = ((ie0) this.f40694b).f37851y;
                if (z10) {
                    eg0Var2.f36493c.setEditText((EditText) view);
                    eg0Var2.f36493c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.sd0 sd0Var4 = ((te0) this.f40694b).f41659a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                sd0Var4.b(f13, f13, true);
                return;
            case 8:
                eg0 eg0Var3 = ((if0) this.f40694b).f37877s0;
                if (z10) {
                    eg0Var3.f36493c.setEditText((EditText) view);
                    eg0Var3.f36493c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.sd0 sd0Var5 = ((dg0) this.f40694b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                sd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.sd0 sd0Var6 = ((PasscodeActivity) this.f40694b).f33216f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                sd0Var6.b(f15, f15, true);
                return;
            case 11:
                qc1 qc1Var = (qc1) this.f40694b;
                if (z10) {
                    qc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    qc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.sd0 sd0Var7 = ((TwoStepVerificationActivity) this.f40694b).v;
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
