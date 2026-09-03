package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.a61;
public final class e1 extends i5 {
    public final s0 f42492f = new s0(this, 1);
    public final f1 h;

    public e1(f1 f1Var) {
        this.h = f1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !y3.w(" ", lowerCase2, lowerCase) && !y3.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || y3.w(" ", translitSafe2, translitSafe) || y3.w(".", translitSafe2, translitSafe)) {
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
        f1 f1Var = this.h;
        f1Var.f42500n = null;
        f1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42492f);
        a61 a61Var = f1Var.f25523a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            f1Var.f25523a.U2.h1(0, 0);
        }
        jh.s sVar = f1Var.f42503w.d;
        if (TextUtils.isEmpty(f1Var.f42500n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        sVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        f1 f1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(f1Var.f42500n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.f42500n, obj)) {
            f1Var.f42500n = obj;
            f1Var.h = true;
            s0 s0Var = this.f42492f;
            AndroidUtilities.cancelRunOnUIThread(s0Var);
            AndroidUtilities.runOnUIThread(s0Var, 500L);
            jh.s sVar = f1Var.f42503w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            sVar.setText(LocaleController.getString(i10));
        }
        a61 a61Var = f1Var.f25523a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                f1Var.f25523a.U2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
