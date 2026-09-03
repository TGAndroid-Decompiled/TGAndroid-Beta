package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f38341a;
    public final n4 f38342b;

    public t(n4 n4Var, int i10) {
        this.f38341a = i10;
        this.f38342b = n4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38341a) {
            case 0:
                n4 n4Var = this.f38342b;
                dh.d dVar = n4Var.f36371n0;
                float f10 = -((Integer) obj).intValue();
                n4Var.m0 = f10;
                dVar.setTranslationY(((1.0f - n4Var.V0) * AndroidUtilities.dp(51.0f)) + f10);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    n4 n4Var2 = this.f38342b;
                    n4Var2.f36363e0.V.setText(str);
                    lh.n nVar = n4Var2.f36363e0.V;
                    nVar.setSelection(nVar.getText().length());
                    AndroidUtilities.showKeyboard(n4Var2.f36363e0.V);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                n4 n4Var3 = this.f38342b;
                if (n4Var3.I != null && str2 != null) {
                    n4Var3.f36363e0.k(false);
                    if (ze.d.f(Uri.parse(str2), false, null)) {
                        a4 a4Var = n4Var3.H;
                        if (a4Var != null) {
                            a4Var.dismiss(true);
                        }
                        ze.d.k(n4Var3.I, str2, false, false, null);
                        return;
                    } else if (!ze.d.l(n4Var3.I, str2, false)) {
                        r3 r3Var = n4Var3.f36375r0[0];
                        if (r3Var != null && r3Var.getWebView() != null) {
                            n4Var3.f36375r0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            ze.d.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                n4 n4Var4 = this.f38342b;
                if (n4Var4.I != null && d1Var != null) {
                    n4Var4.f36363e0.k(false);
                    r3 r3Var2 = n4Var4.f36375r0[0];
                    if (r3Var2 != null && r3Var2.getWebView() != null) {
                        n4Var4.f36375r0[0].getWebView().e(d1Var.f39424c, d1Var.d);
                        return;
                    } else {
                        ze.d.n(d1Var.f39424c);
                        return;
                    }
                }
                return;
        }
    }
}
