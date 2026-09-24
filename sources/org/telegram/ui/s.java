package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f37537a;
    public final i4 f37538b;

    public s(i4 i4Var, int i10) {
        this.f37537a = i10;
        this.f37538b = i4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37537a) {
            case 0:
                i4 i4Var = this.f37538b;
                ai.w5 w5Var = i4Var.f34390q0;
                float f7 = -((Integer) obj).intValue();
                i4Var.f34389p0 = f7;
                w5Var.setTranslationY(((1.0f - i4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.f37538b;
                    i4Var2.f34382h0.f39214b0.setText(str);
                    fi.o oVar = i4Var2.f34382h0.f39214b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(i4Var2.f34382h0.f39214b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.f37538b;
                if (i4Var3.L != null && str2 != null) {
                    i4Var3.f34382h0.k(false);
                    if (nf.f.f(Uri.parse(str2), false, null)) {
                        v3 v3Var = i4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        nf.f.k(i4Var3.L, str2, false, false, null);
                        return;
                    } else if (!nf.f.l(i4Var3.L, str2, false)) {
                        m3 m3Var = i4Var3.f34394u0[0];
                        if (m3Var != null && m3Var.getWebView() != null) {
                            i4Var3.f34394u0[0].getWebView().loadUrl(str2);
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
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                i4 i4Var4 = this.f37538b;
                if (i4Var4.L != null && c1Var != null) {
                    i4Var4.f34382h0.k(false);
                    m3 m3Var2 = i4Var4.f34394u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        i4Var4.f34394u0[0].getWebView().e(c1Var.f39026c, c1Var.d);
                        return;
                    } else {
                        nf.f.n(c1Var.f39026c);
                        return;
                    }
                }
                return;
        }
    }
}
