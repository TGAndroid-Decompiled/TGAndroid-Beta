package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f42234a;
    public final l4 f42235b;

    public r(l4 l4Var, int i9) {
        this.f42234a = i9;
        this.f42235b = l4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42234a) {
            case 0:
                l4 l4Var = this.f42235b;
                dh.g gVar = l4Var.m0;
                float f10 = -((Integer) obj).intValue();
                l4Var.f40022l0 = f10;
                gVar.setTranslationY(((1.0f - l4Var.U0) * AndroidUtilities.dp(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.f42235b;
                    l4Var2.f40014d0.U.setText(str);
                    gh.o oVar = l4Var2.f40014d0.U;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.f40014d0.U);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.f42235b;
                if (l4Var3.H != null && str2 != null) {
                    l4Var3.f40014d0.k(false);
                    if (ve.e.f(Uri.parse(str2), false, null)) {
                        y3 y3Var = l4Var3.G;
                        if (y3Var != null) {
                            y3Var.dismiss(true);
                        }
                        ve.e.k(l4Var3.H, str2, false, false, null);
                        return;
                    } else if (!ve.e.l(l4Var3.H, str2, false)) {
                        p3 p3Var = l4Var3.f40026q0[0];
                        if (p3Var != null && p3Var.getWebView() != null) {
                            l4Var3.f40026q0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            ve.e.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                l4 l4Var4 = this.f42235b;
                if (l4Var4.H != null && z0Var != null) {
                    l4Var4.f40014d0.k(false);
                    p3 p3Var2 = l4Var4.f40026q0[0];
                    if (p3Var2 != null && p3Var2.getWebView() != null) {
                        l4Var4.f40026q0[0].getWebView().e(z0Var.f44114c, z0Var.d);
                        return;
                    } else {
                        ve.e.n(z0Var.f44114c);
                        return;
                    }
                }
                return;
        }
    }
}
