package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class t implements Utilities.Callback {
    public final int f42499a;
    public final m4 f42500b;

    public t(m4 m4Var, int i10) {
        this.f42499a = i10;
        this.f42500b = m4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42499a) {
            case 0:
                m4 m4Var = this.f42500b;
                bh.d dVar = m4Var.m0;
                float f9 = -((Integer) obj).intValue();
                m4Var.f40400l0 = f9;
                dVar.setTranslationY(((1.0f - m4Var.U0) * AndroidUtilities.dp(51.0f)) + f9);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    m4 m4Var2 = this.f42500b;
                    m4Var2.f40392d0.U.setText(str);
                    jh.m mVar = m4Var2.f40392d0.U;
                    mVar.setSelection(mVar.getText().length());
                    AndroidUtilities.showKeyboard(m4Var2.f40392d0.U);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                m4 m4Var3 = this.f42500b;
                if (m4Var3.H != null && str2 != null) {
                    m4Var3.f40392d0.k(false);
                    if (ye.d.f(Uri.parse(str2), false, null)) {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(true);
                        }
                        ye.d.k(m4Var3.H, str2, false, false, null);
                        return;
                    } else if (!ye.d.l(m4Var3.H, str2, false)) {
                        q3 q3Var = m4Var3.f40404q0[0];
                        if (q3Var != null && q3Var.getWebView() != null) {
                            m4Var3.f40404q0[0].getWebView().loadUrl(str2);
                            return;
                        } else {
                            ye.d.n(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                m4 m4Var4 = this.f42500b;
                if (m4Var4.H != null && a1Var != null) {
                    m4Var4.f40392d0.k(false);
                    q3 q3Var2 = m4Var4.f40404q0[0];
                    if (q3Var2 != null && q3Var2.getWebView() != null) {
                        m4Var4.f40404q0[0].getWebView().e(a1Var.f43977c, a1Var.d);
                        return;
                    } else {
                        ye.d.n(a1Var.f43977c);
                        return;
                    }
                }
                return;
        }
    }
}
