package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f37608a;
    public final j4 f37609b;

    public t(j4 j4Var, int i10) {
        this.f37608a = i10;
        this.f37609b = j4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37608a) {
            case 0:
                j4 j4Var = this.f37609b;
                ai.w5 w5Var = j4Var.f34623q0;
                float f7 = -((Integer) obj).intValue();
                j4Var.f34622p0 = f7;
                w5Var.setTranslationY(((1.0f - j4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    j4 j4Var2 = this.f37609b;
                    j4Var2.f34615h0.f39184b0.setText(str);
                    fi.o oVar = j4Var2.f34615h0.f39184b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(j4Var2.f34615h0.f39184b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                j4 j4Var3 = this.f37609b;
                if (j4Var3.L != null && str2 != null) {
                    j4Var3.f34615h0.k(false);
                    if (nf.f.f(Uri.parse(str2), false, null)) {
                        w3 w3Var = j4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(true);
                        }
                        nf.f.k(j4Var3.L, str2, false, false, null);
                        return;
                    } else if (!nf.f.l(j4Var3.L, str2, false)) {
                        n3 n3Var = j4Var3.f34627u0[0];
                        if (n3Var != null && n3Var.getWebView() != null) {
                            j4Var3.f34627u0[0].getWebView().loadUrl(str2);
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
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                j4 j4Var4 = this.f37609b;
                if (j4Var4.L != null && d1Var != null) {
                    j4Var4.f34615h0.k(false);
                    n3 n3Var2 = j4Var4.f34627u0[0];
                    if (n3Var2 != null && n3Var2.getWebView() != null) {
                        j4Var4.f34627u0[0].getWebView().e(d1Var.f38997c, d1Var.d);
                        return;
                    } else {
                        nf.f.n(d1Var.f38997c);
                        return;
                    }
                }
                return;
        }
    }
}
