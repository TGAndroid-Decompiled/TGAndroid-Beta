package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.x51;
public final class h1 extends g5 {
    public final b f42101f = new b(this, 4);
    public final i1 h;

    public h1(i1 i1Var) {
        this.h = i1Var;
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
        i1 i1Var = this.h;
        i1Var.f42124n = null;
        i1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42101f);
        x51 x51Var = i1Var.f32849a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            i1Var.f32849a.X2.h1(0, 0);
        }
        wh.p pVar = i1Var.f42127w.d;
        if (TextUtils.isEmpty(i1Var.f42124n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        pVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        i1 i1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(i1Var.f42124n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(i1Var.f42124n, obj)) {
            i1Var.f42124n = obj;
            i1Var.h = true;
            b bVar = this.f42101f;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 500L);
            wh.p pVar = i1Var.f42127w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            pVar.setText(LocaleController.getString(i10));
        }
        x51 x51Var = i1Var.f32849a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                i1Var.f32849a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
