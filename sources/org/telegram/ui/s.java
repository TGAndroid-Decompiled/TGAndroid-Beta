package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f36496a;
    public final j4 f36497b;

    public s(j4 j4Var, int i10) {
        this.f36496a = i10;
        this.f36497b = j4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36496a) {
            case 0:
                j4 j4Var = this.f36497b;
                bi.l4 l4Var = j4Var.f33916q0;
                float f7 = -((Integer) obj).intValue();
                j4Var.f33915p0 = f7;
                l4Var.setTranslationY(((1.0f - j4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    j4 j4Var2 = this.f36497b;
                    j4Var2.f33908h0.f38103b0.setText(str);
                    ei.o oVar = j4Var2.f33908h0.f38103b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(j4Var2.f33908h0.f38103b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                j4 j4Var3 = this.f36497b;
                if (j4Var3.L != null && str2 != null) {
                    j4Var3.f33908h0.k(false);
                    if (nf.f.f(Uri.parse(str2), false, null)) {
                        w3 w3Var = j4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(true);
                        }
                        nf.f.k(j4Var3.L, str2, false, false, null);
                        return;
                    } else if (!nf.f.l(j4Var3.L, str2, false)) {
                        n3 n3Var = j4Var3.f33920u0[0];
                        if (n3Var != null && n3Var.getWebView() != null) {
                            j4Var3.f33920u0[0].getWebView().loadUrl(str2);
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
                j4 j4Var4 = this.f36497b;
                if (j4Var4.L != null && e1Var != null) {
                    j4Var4.f33908h0.k(false);
                    n3 n3Var2 = j4Var4.f33920u0[0];
                    if (n3Var2 != null && n3Var2.getWebView() != null) {
                        j4Var4.f33920u0[0].getWebView().e(e1Var.f37928c, e1Var.d);
                        return;
                    } else {
                        nf.f.n(e1Var.f37928c);
                        return;
                    }
                }
                return;
        }
    }
}
