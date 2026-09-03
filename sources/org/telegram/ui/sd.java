package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sd implements View.OnFocusChangeListener {
    public final int f38153a;
    public final Object f38154b;

    public sd(Object obj, int i10) {
        this.f38153a = i10;
        this.f38154b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        switch (this.f38153a) {
            case 0:
                lh.m mVar = ((me) this.f38154b).R0;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.b(f10, f10, true);
                return;
            case 1:
                qy qyVar = (qy) this.f38154b;
                if (z4) {
                    qyVar.V.b(true);
                    return;
                }
                return;
            case 2:
                pg0 pg0Var = ((ae0) this.f38154b).T;
                if (z4) {
                    pg0Var.f37130c.setEditText((EditText) view);
                    pg0Var.f37130c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.bd0 bd0Var = (org.telegram.ui.Components.bd0) this.f38154b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                bd0Var.b(f11, f11, true);
                return;
            case 4:
                org.telegram.ui.Components.bd0 bd0Var2 = ((je0) this.f38154b).f35260x;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                bd0Var2.b(f12, f12, true);
                return;
            case 5:
                org.telegram.ui.Components.bd0 bd0Var3 = ((re0) this.f38154b).f37810b;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                bd0Var3.b(f13, f13, true);
                return;
            case 6:
                pg0 pg0Var2 = ((ue0) this.f38154b).f38796y;
                if (z4) {
                    pg0Var2.f37130c.setEditText((EditText) view);
                    pg0Var2.f37130c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.bd0 bd0Var4 = ((ff0) this.f38154b).f34064a;
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                bd0Var4.b(f14, f14, true);
                return;
            case 8:
                pg0 pg0Var3 = ((tf0) this.f38154b).f38503p0;
                if (z4) {
                    pg0Var3.f37130c.setEditText((EditText) view);
                    pg0Var3.f37130c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.bd0 bd0Var5 = ((og0) this.f38154b).e;
                if (z4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                bd0Var5.b(f15, f15, true);
                return;
            case 10:
                org.telegram.ui.Components.bd0 bd0Var6 = ((PasscodeActivity) this.f38154b).f31659f;
                if (z4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                bd0Var6.b(f16, f16, true);
                return;
            case 11:
                od1 od1Var = (od1) this.f38154b;
                if (z4) {
                    od1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    od1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.bd0 bd0Var7 = ((TwoStepVerificationActivity) this.f38154b).v;
                if (z4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                bd0Var7.b(f17, f17, true);
                return;
        }
    }
}
