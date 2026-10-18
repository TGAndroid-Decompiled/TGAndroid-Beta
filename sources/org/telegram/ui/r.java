package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f40532a;
    public final l4 f40533b;

    public r(l4 l4Var, int i10) {
        this.f40532a = i10;
        this.f40533b = l4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40532a) {
            case 0:
                l4 l4Var = this.f40533b;
                ci.h4 h4Var = l4Var.f38721q0;
                float f7 = -((Integer) obj).intValue();
                l4Var.f38720p0 = f7;
                h4Var.setTranslationY(((1.0f - l4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.f40533b;
                    l4Var2.f38713h0.f42749b0.setText(str);
                    ai.t tVar = l4Var2.f38713h0.f42749b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.f38713h0.f42749b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.f40533b;
                if (l4Var3.L != null && str2 != null) {
                    l4Var3.f38713h0.k(false);
                    if (pf.d.e(Uri.parse(str2), false, null)) {
                        x3 x3Var = l4Var3.K;
                        if (x3Var != null) {
                            x3Var.dismiss(true);
                        }
                        pf.d.j(l4Var3.L, str2, false, false, null);
                        return;
                    } else if (!pf.d.k(l4Var3.L, str2, false)) {
                        o3 o3Var = l4Var3.f38725u0[0];
                        if (o3Var != null && o3Var.getWebView() != null) {
                            l4Var3.f38725u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            pf.d.m(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                l4 l4Var4 = this.f40533b;
                if (l4Var4.L != null && c1Var != null) {
                    l4Var4.f38713h0.k(false);
                    o3 o3Var2 = l4Var4.f38725u0[0];
                    if (o3Var2 != null && o3Var2.getWebView() != null) {
                        l4Var4.f38725u0[0].getWebView().e(c1Var.f42566c, c1Var.d);
                        return;
                    } else {
                        pf.d.m(c1Var.f42566c);
                        return;
                    }
                }
                return;
        }
    }
}
