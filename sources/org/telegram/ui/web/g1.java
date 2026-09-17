package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.z51;
public final class g1 extends h5 {
    public final u0 f38791f = new u0(this, 1);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.w1.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.w1.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.w1.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.w1.w(".", translitSafe2, translitSafe)) {
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
        h1Var.f38812r = null;
        h1Var.f38811n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f38791f);
        z51 z51Var = h1Var.f22333a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            h1Var.f22333a.X2.h1(0, 0);
        }
        vh.o oVar = h1Var.f38815x.d;
        if (TextUtils.isEmpty(h1Var.f38812r)) {
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
        boolean z10 = !TextUtils.isEmpty(h1Var.f38812r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f38812r, obj)) {
            h1Var.f38812r = obj;
            h1Var.f38811n = true;
            u0 u0Var = this.f38791f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            vh.o oVar = h1Var.f38815x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            oVar.setText(LocaleController.getString(i10));
        }
        z51 z51Var = h1Var.f22333a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f22333a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
