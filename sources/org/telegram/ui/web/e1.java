package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.l71;
public final class e1 extends org.telegram.ui.ActionBar.s0 {
    public final k2.c f45220a = new k2.c(this, 29);
    public final f1 f45221b;

    public e1(f1 f1Var) {
        this.f45221b = f1Var;
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !vh.u(" ", lowerCase2, lowerCase) && !vh.u(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || vh.u(" ", translitSafe2, translitSafe) || vh.u(".", translitSafe2, translitSafe)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void h() {
        int i10;
        f1 f1Var = this.f45221b;
        f1Var.f45229r = null;
        f1Var.f45228n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f45220a);
        l71 l71Var = f1Var.f30417a;
        if (l71Var != null) {
            l71Var.f32150g3.O(true);
            f1Var.f30417a.f32149f3.h1(0, 0);
        }
        xh.n nVar = f1Var.f45232x.d;
        if (TextUtils.isEmpty(f1Var.f45229r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        f1 f1Var = this.f45221b;
        boolean z10 = !TextUtils.isEmpty(f1Var.f45229r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.f45229r, obj)) {
            f1Var.f45229r = obj;
            f1Var.f45228n = true;
            k2.c cVar = this.f45220a;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 500L);
            xh.n nVar = f1Var.f45232x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        l71 l71Var = f1Var.f30417a;
        if (l71Var != null) {
            l71Var.f32150g3.O(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                f1Var.f30417a.f32149f3.h1(0, 0);
            }
        }
    }

    @Override
    public final void i() {
    }
}
