package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class s implements Utilities.Callback {

    public final int f42378a;

    public final m4 f42379b;

    public s(m4 m4Var, int i10) {
        this.f42378a = i10;
        this.f42379b = m4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42378a) {
            case 0:
                m4 m4Var = this.f42379b;
                ag.d dVar = m4Var.m0;
                float f10 = -((Integer) obj).intValue();
                m4Var.f40343l0 = f10;
                dVar.setTranslationY(((1.0f - m4Var.U0) * AndroidUtilities.dp(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    m4 m4Var2 = this.f42379b;
                    m4Var2.f40335d0.U.setText(str);
                    hh.o oVar = m4Var2.f40335d0.U;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(m4Var2.f40335d0.U);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                m4 m4Var3 = this.f42379b;
                if (m4Var3.H != null && str2 != null) {
                    m4Var3.f40335d0.k(false);
                    if (we.e.f(Uri.parse(str2), false, null)) {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(true);
                        }
                        we.e.k(m4Var3.H, str2, false, false, null);
                    } else if (!we.e.l(m4Var3.H, str2, false)) {
                        q3 q3Var = m4Var3.f40347q0[0];
                        if (q3Var == null || q3Var.getWebView() == null) {
                            we.e.n(str2);
                        } else {
                            m4Var3.f40347q0[0].getWebView().loadUrl(str2);
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                m4 m4Var4 = this.f42379b;
                if (m4Var4.H != null && a1Var != null) {
                    m4Var4.f40335d0.k(false);
                    q3 q3Var2 = m4Var4.f40347q0[0];
                    if (q3Var2 == null || q3Var2.getWebView() == null) {
                        we.e.n(a1Var.f43776c);
                    } else {
                        m4Var4.f40347q0[0].getWebView().e(a1Var.f43776c, a1Var.d);
                    }
                    break;
                }
                break;
        }
    }
}
