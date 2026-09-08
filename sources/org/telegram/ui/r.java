package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f40050a;
    public final i4 f40051b;

    public r(i4 i4Var, int i10) {
        this.f40050a = i10;
        this.f40051b = i4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40050a) {
            case 0:
                i4 i4Var = this.f40051b;
                bi.g5 g5Var = i4Var.f37255q0;
                float f7 = -((Integer) obj).intValue();
                i4Var.f37254p0 = f7;
                g5Var.setTranslationY(((1.0f - i4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.f40051b;
                    i4Var2.f37247h0.f42304b0.setText(str);
                    gi.o oVar = i4Var2.f37247h0.f42304b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(i4Var2.f37247h0.f42304b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.f40051b;
                if (i4Var3.L != null && str2 != null) {
                    i4Var3.f37247h0.k(false);
                    if (of.f.f(Uri.parse(str2), false, null)) {
                        v3 v3Var = i4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        of.f.k(i4Var3.L, str2, false, false, null);
                        return;
                    } else if (!of.f.l(i4Var3.L, str2, false)) {
                        m3 m3Var = i4Var3.f37259u0[0];
                        if (m3Var != null && m3Var.getWebView() != null) {
                            i4Var3.f37259u0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            of.f.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                i4 i4Var4 = this.f40051b;
                if (i4Var4.L != null && e1Var != null) {
                    i4Var4.f37247h0.k(false);
                    m3 m3Var2 = i4Var4.f37259u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        i4Var4.f37259u0[0].getWebView().e(e1Var.f42105c, e1Var.d);
                        return;
                    } else {
                        of.f.n(e1Var.f42105c);
                        return;
                    }
                }
                return;
        }
    }
}
