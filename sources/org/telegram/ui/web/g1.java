package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.w61;
public final class g1 extends f5 {
    public final u0 f42185f = new u0(this, 1);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.f0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.f0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.f0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.f0.w(".", translitSafe2, translitSafe)) {
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
        h1Var.f42200r = null;
        h1Var.f42199n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42185f);
        w61 w61Var = h1Var.f32724a;
        if (w61Var != null) {
            w61Var.f25244f3.N(true);
            h1Var.f32724a.f25243e3.h1(0, 0);
        }
        vh.n nVar = h1Var.f42203x.d;
        if (TextUtils.isEmpty(h1Var.f42200r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.f42200r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f42200r, obj)) {
            h1Var.f42200r = obj;
            h1Var.f42199n = true;
            u0 u0Var = this.f42185f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            vh.n nVar = h1Var.f42203x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        w61 w61Var = h1Var.f32724a;
        if (w61Var != null) {
            w61Var.f25244f3.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f32724a.f25243e3.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
