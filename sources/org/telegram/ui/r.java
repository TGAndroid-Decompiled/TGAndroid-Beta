package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f36982a;
    public final h4 f36983b;

    public r(h4 h4Var, int i10) {
        this.f36982a = i10;
        this.f36983b = h4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36982a) {
            case 0:
                h4 h4Var = this.f36983b;
                ai.x5 x5Var = h4Var.f34086q0;
                float f7 = -((Integer) obj).intValue();
                h4Var.f34085p0 = f7;
                x5Var.setTranslationY(((1.0f - h4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    h4 h4Var2 = this.f36983b;
                    h4Var2.f34078h0.f39113b0.setText(str);
                    fi.o oVar = h4Var2.f34078h0.f39113b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(h4Var2.f34078h0.f39113b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                h4 h4Var3 = this.f36983b;
                if (h4Var3.L != null && str2 != null) {
                    h4Var3.f34078h0.k(false);
                    if (nf.f.f(Uri.parse(str2), false, null)) {
                        u3 u3Var = h4Var3.K;
                        if (u3Var != null) {
                            u3Var.dismiss(true);
                        }
                        nf.f.k(h4Var3.L, str2, false, false, null);
                        return;
                    } else if (!nf.f.l(h4Var3.L, str2, false)) {
                        l3 l3Var = h4Var3.f34090u0[0];
                        if (l3Var != null && l3Var.getWebView() != null) {
                            h4Var3.f34090u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            nf.f.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                h4 h4Var4 = this.f36983b;
                if (h4Var4.L != null && e1Var != null) {
                    h4Var4.f34078h0.k(false);
                    l3 l3Var2 = h4Var4.f34090u0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        h4Var4.f34090u0[0].getWebView().e(e1Var.f38944c, e1Var.d);
                        return;
                    } else {
                        nf.f.n(e1Var.f38944c);
                        return;
                    }
                }
                return;
        }
    }
}
