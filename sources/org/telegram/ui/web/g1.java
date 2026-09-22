package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.y51;
public final class g1 extends g5 {
    public final u0 f38954f = new u0(this, 1);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.y0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.y0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.y0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.y0.w(".", translitSafe2, translitSafe)) {
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
        h1Var.f38974n = null;
        h1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f38954f);
        y51 y51Var = h1Var.f30482a;
        if (y51Var != null) {
            y51Var.Y2.N(true);
            h1Var.f30482a.X2.h1(0, 0);
        }
        vh.o oVar = h1Var.f38977w.d;
        if (TextUtils.isEmpty(h1Var.f38974n)) {
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
        boolean z10 = !TextUtils.isEmpty(h1Var.f38974n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f38974n, obj)) {
            h1Var.f38974n = obj;
            h1Var.h = true;
            u0 u0Var = this.f38954f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            vh.o oVar = h1Var.f38977w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            oVar.setText(LocaleController.getString(i10));
        }
        y51 y51Var = h1Var.f30482a;
        if (y51Var != null) {
            y51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f30482a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
