package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rd implements View.OnFocusChangeListener {
    public final int f43117a;
    public final Object f43118b;

    public rd(Object obj, int i10) {
        this.f43117a = i10;
        this.f43118b = obj;
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
        switch (this.f43117a) {
            case 0:
                bi.s sVar = ((ke) this.f43118b).K0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                cy cyVar = (cy) this.f43118b;
                if (z10) {
                    cyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                gg0 gg0Var = ((od0) this.f43118b).W;
                if (z10) {
                    gg0Var.f39655c.setEditText((EditText) view);
                    gg0Var.f39655c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.rd0 rd0Var = (org.telegram.ui.Components.rd0) this.f43118b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.rd0 rd0Var2 = ((yd0) this.f43118b).f46043x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                rd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.rd0 rd0Var3 = ((ge0) this.f43118b).f39629b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                rd0Var3.b(f12, f12, true);
                return;
            case 6:
                gg0 gg0Var2 = ((je0) this.f43118b).f40584y;
                if (z10) {
                    gg0Var2.f39655c.setEditText((EditText) view);
                    gg0Var2.f39655c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.rd0 rd0Var4 = ((ve0) this.f43118b).f44781a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                rd0Var4.b(f13, f13, true);
                return;
            case 8:
                gg0 gg0Var3 = ((jf0) this.f43118b).f40619u0;
                if (z10) {
                    gg0Var3.f39655c.setEditText((EditText) view);
                    gg0Var3.f39655c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.rd0 rd0Var5 = ((fg0) this.f43118b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                rd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.rd0 rd0Var6 = ((PasscodeActivity) this.f43118b).f35596f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                rd0Var6.b(f15, f15, true);
                return;
            case 11:
                xc1 xc1Var = (xc1) this.f43118b;
                if (z10) {
                    xc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    xc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.rd0 rd0Var7 = ((TwoStepVerificationActivity) this.f43118b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                rd0Var7.b(f16, f16, true);
                return;
        }
    }
}
