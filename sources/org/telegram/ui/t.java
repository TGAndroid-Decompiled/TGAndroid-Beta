package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f41345a;
    public final l4 f41346b;

    public t(l4 l4Var, int i10) {
        this.f41345a = i10;
        this.f41346b = l4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41345a) {
            case 0:
                l4 l4Var = this.f41346b;
                eh.d dVar = l4Var.f38520n0;
                float f10 = -((Integer) obj).intValue();
                l4Var.m0 = f10;
                dVar.setTranslationY(((1.0f - l4Var.V0) * AndroidUtilities.dp(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.f41346b;
                    l4Var2.f38512e0.V.setText(str);
                    mh.m mVar = l4Var2.f38512e0.V;
                    mVar.setSelection(mVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.f38512e0.V);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.f41346b;
                if (l4Var3.I != null && str2 != null) {
                    l4Var3.f38512e0.k(false);
                    if (af.g.f(Uri.parse(str2), false, null)) {
                        y3 y3Var = l4Var3.H;
                        if (y3Var != null) {
                            y3Var.dismiss(true);
                        }
                        af.g.k(l4Var3.I, str2, false, false, null);
                        return;
                    } else if (!af.g.l(l4Var3.I, str2, false)) {
                        p3 p3Var = l4Var3.f38524r0[0];
                        if (p3Var != null && p3Var.getWebView() != null) {
                            l4Var3.f38524r0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            af.g.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                l4 l4Var4 = this.f41346b;
                if (l4Var4.I != null && b1Var != null) {
                    l4Var4.f38512e0.k(false);
                    p3 p3Var2 = l4Var4.f38524r0[0];
                    if (p3Var2 != null && p3Var2.getWebView() != null) {
                        l4Var4.f38524r0[0].getWebView().e(b1Var.f42474c, b1Var.d);
                        return;
                    } else {
                        af.g.n(b1Var.f42474c);
                        return;
                    }
                }
                return;
        }
    }
}
