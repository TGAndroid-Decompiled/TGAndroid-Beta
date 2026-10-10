package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s implements Utilities.Callback {
    public final int f41592a;
    public final i4 f41593b;

    public s(i4 i4Var, int i10) {
        this.f41592a = i10;
        this.f41593b = i4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41592a) {
            case 0:
                i4 i4Var = this.f41593b;
                ai.x5 x5Var = i4Var.f38555q0;
                float f7 = -((Integer) obj).intValue();
                i4Var.f38554p0 = f7;
                x5Var.setTranslationY(((1.0f - i4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                return;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.f41593b;
                    i4Var2.f38547h0.f43523b0.setText(str);
                    fi.o oVar = i4Var2.f38547h0.f43523b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(i4Var2.f38547h0.f43523b0);
                    return;
                }
                return;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.f41593b;
                if (i4Var3.L != null && str2 != null) {
                    i4Var3.f38547h0.k(false);
                    if (of.f.f(Uri.parse(str2), false, null)) {
                        v3 v3Var = i4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        of.f.k(i4Var3.L, str2, false, false, null);
                        return;
                    } else if (!of.f.l(i4Var3.L, str2, false)) {
                        m3 m3Var = i4Var3.f38559u0[0];
                        if (m3Var != null && m3Var.getWebView() != null) {
                            i4Var3.f38559u0[0].getWebView().loadUrl(str2);
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
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                i4 i4Var4 = this.f41593b;
                if (i4Var4.L != null && c1Var != null) {
                    i4Var4.f38547h0.k(false);
                    m3 m3Var2 = i4Var4.f38559u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        i4Var4.f38559u0[0].getWebView().e(c1Var.f43326c, c1Var.d);
                        return;
                    } else {
                        of.f.n(c1Var.f43326c);
                        return;
                    }
                }
                return;
        }
    }
}
