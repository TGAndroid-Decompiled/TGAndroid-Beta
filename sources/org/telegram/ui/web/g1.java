package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.l61;
public final class g1 extends i5 {
    public final org.telegram.ui.Components.voip.x f37941f = new org.telegram.ui.Components.voip.x(this, 13);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.a2.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.a2.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.a2.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.a2.w(".", translitSafe2, translitSafe)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        int i10;
        h1 h1Var = this.h;
        h1Var.f37944n = null;
        h1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f37941f);
        l61 l61Var = h1Var.f25171a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            h1Var.f25171a.X2.h1(0, 0);
        }
        uh.o oVar = h1Var.f37947w.d;
        if (TextUtils.isEmpty(h1Var.f37944n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        oVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.f37944n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f37944n, obj)) {
            h1Var.f37944n = obj;
            h1Var.h = true;
            org.telegram.ui.Components.voip.x xVar = this.f37941f;
            AndroidUtilities.cancelRunOnUIThread(xVar);
            AndroidUtilities.runOnUIThread(xVar, 500L);
            uh.o oVar = h1Var.f37947w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            oVar.setText(LocaleController.getString(i10));
        }
        l61 l61Var = h1Var.f25171a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f25171a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
