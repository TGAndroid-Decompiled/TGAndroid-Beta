package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class vn0 implements TextWatcher {

    public final do0 f43493a;

    public vn0(do0 do0Var) {
        this.f43493a = do0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        do0 do0Var = this.f43493a;
        HashMap map = do0Var.f37457c;
        if (do0Var.f37466i0) {
            return;
        }
        do0Var.f37466i0 = true;
        String strD = oe.b.d(do0Var.f37462f[8].getText().toString(), false);
        do0Var.f37462f[8].setText(strD);
        org.telegram.ui.Components.u30 u30Var = (org.telegram.ui.Components.u30) do0Var.f37462f[9];
        if (strD.length() == 0) {
            u30Var.setHintText((String) null);
            u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (strD.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String strSubstring = strD.substring(0, i10);
                    if (((String) map.get(strSubstring)) != null) {
                        String str3 = strD.substring(i10) + do0Var.f37462f[9].getText().toString();
                        do0Var.f37462f[8].setText(strSubstring);
                        str = str3;
                        strD = strSubstring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = strD.substring(1) + do0Var.f37462f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = do0Var.f37462f[8];
                    strD = strD.substring(0, 1);
                    editTextBoldCursor.setText(strD);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) map.get(strD);
            if (str4 == null || do0Var.f37451a.indexOf(str4) == -1 || (str2 = (String) do0Var.d.get(strD)) == null) {
                u30Var.setHintText((String) null);
                u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                u30Var.setHintText(str2.replace('X', (char) 8211));
                u30Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = do0Var.f37462f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                u30Var.requestFocus();
                u30Var.setText(str);
                u30Var.setSelection(u30Var.length());
            }
        }
        do0Var.f37466i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
