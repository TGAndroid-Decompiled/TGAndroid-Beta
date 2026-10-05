package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rd implements View.OnFocusChangeListener {
    public final int f40070a;
    public final Object f40071b;

    public rd(Object obj, int i10) {
        this.f40070a = i10;
        this.f40071b = obj;
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
        switch (this.f40070a) {
            case 0:
                ae aeVar = ((me) this.f40071b).K0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 1:
                uy uyVar = (uy) this.f40071b;
                if (z10) {
                    uyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ug0 ug0Var = ((ee0) this.f40071b).W;
                if (z10) {
                    ug0Var.f41240c.setEditText((EditText) view);
                    ug0Var.f41240c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ld0 ld0Var = (org.telegram.ui.Components.ld0) this.f40071b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ld0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.ld0 ld0Var2 = ((ne0) this.f40071b).f38947x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ld0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.ld0 ld0Var3 = ((ve0) this.f40071b).f41726b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ld0Var3.b(f12, f12, true);
                return;
            case 6:
                ug0 ug0Var2 = ((ye0) this.f40071b).f43213y;
                if (z10) {
                    ug0Var2.f41240c.setEditText((EditText) view);
                    ug0Var2.f41240c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.ld0 ld0Var4 = ((jf0) this.f40071b).f37685a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ld0Var4.b(f13, f13, true);
                return;
            case 8:
                ug0 ug0Var3 = ((xf0) this.f40071b).f42934s0;
                if (z10) {
                    ug0Var3.f41240c.setEditText((EditText) view);
                    ug0Var3.f41240c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.ld0 ld0Var5 = ((tg0) this.f40071b).f40886e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ld0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.ld0 ld0Var6 = ((PasscodeActivity) this.f40071b).f33863f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ld0Var6.b(f15, f15, true);
                return;
            case 11:
                ud1 ud1Var = (ud1) this.f40071b;
                if (z10) {
                    ud1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ud1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.ld0 ld0Var7 = ((TwoStepVerificationActivity) this.f40071b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ld0Var7.b(f16, f16, true);
                return;
        }
    }
}
