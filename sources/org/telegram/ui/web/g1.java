package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.n61;
public final class g1 extends g5 {
    public final u0 f39017f = new u0(this, 1);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.v(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.v(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.l0.v(" ", translitSafe2, translitSafe) || org.telegram.messenger.l0.v(".", translitSafe2, translitSafe)) {
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
        h1Var.f39031r = null;
        h1Var.f39030n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f39017f);
        n61 n61Var = h1Var.f27008a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            h1Var.f27008a.X2.h1(0, 0);
        }
        vh.n nVar = h1Var.f39034x.d;
        if (TextUtils.isEmpty(h1Var.f39031r)) {
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
        boolean z10 = !TextUtils.isEmpty(h1Var.f39031r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f39031r, obj)) {
            h1Var.f39031r = obj;
            h1Var.f39030n = true;
            u0 u0Var = this.f39017f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            vh.n nVar = h1Var.f39034x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        n61 n61Var = h1Var.f27008a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f27008a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
