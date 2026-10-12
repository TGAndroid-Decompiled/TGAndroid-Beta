package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f39563a;
    public final k4 f39564b;

    public r(k4 k4Var, int i10) {
        this.f39563a = i10;
        this.f39564b = k4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39563a) {
            case 0:
                k4 k4Var = this.f39564b;
                bi.i5 i5Var = k4Var.f37553q0;
                float f7 = -((Integer) obj).intValue();
                k4Var.f37552p0 = f7;
                i5Var.setTranslationY(((1.0f - k4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    k4 k4Var2 = this.f39564b;
                    k4Var2.f37545h0.f41503b0.setText(str);
                    gi.o oVar = k4Var2.f37545h0.f41503b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(k4Var2.f37545h0.f41503b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                k4 k4Var3 = this.f39564b;
                if (k4Var3.L != null && str2 != null) {
                    k4Var3.f37545h0.k(false);
                    if (pf.d.f(Uri.parse(str2), false, null)) {
                        x3 x3Var = k4Var3.K;
                        if (x3Var != null) {
                            x3Var.dismiss(true);
                        }
                        pf.d.k(k4Var3.L, str2, false, false, null);
                        return;
                    } else if (!pf.d.l(k4Var3.L, str2, false)) {
                        o3 o3Var = k4Var3.f37557u0[0];
                        if (o3Var != null && o3Var.getWebView() != null) {
                            k4Var3.f37557u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            pf.d.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                k4 k4Var4 = this.f39564b;
                if (k4Var4.L != null && c1Var != null) {
                    k4Var4.f37545h0.k(false);
                    o3 o3Var2 = k4Var4.f37557u0[0];
                    if (o3Var2 != null && o3Var2.getWebView() != null) {
                        k4Var4.f37557u0[0].getWebView().e(c1Var.f41323c, c1Var.d);
                        return;
                    } else {
                        pf.d.n(c1Var.f41323c);
                        return;
                    }
                }
                return;
        }
    }
}
