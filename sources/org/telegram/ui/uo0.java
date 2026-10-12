package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uo0 implements TextWatcher {
    public final cp0 f40782a;

    public uo0(cp0 cp0Var) {
        this.f40782a = cp0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        cp0 cp0Var = this.f40782a;
        HashMap hashMap = cp0Var.f35001c;
        if (cp0Var.m0) {
            return;
        }
        cp0Var.m0 = true;
        String d = jf.b.d(cp0Var.f35008f[8].getText().toString(), false);
        cp0Var.f35008f[8].setText(d);
        org.telegram.ui.Components.s40 s40Var = (org.telegram.ui.Components.s40) cp0Var.f35008f[9];
        if (d.length() == 0) {
            s40Var.setHintText((String) null);
            s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            cp0Var.f35008f[8].setText(substring);
                            str = d.substring(i10) + cp0Var.f35008f[9].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i10--;
                    } else {
                        z10 = false;
                        str = null;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + cp0Var.f35008f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = cp0Var.f35008f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && cp0Var.f34995a.indexOf(str3) != -1 && (str2 = (String) cp0Var.d.get(d)) != null) {
                s40Var.setHintText(str2.replace('X', (char) 8211));
                s40Var.setHint((CharSequence) null);
            } else {
                s40Var.setHintText((String) null);
                s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = cp0Var.f35008f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                s40Var.requestFocus();
                s40Var.setText(str);
                s40Var.setSelection(s40Var.length());
            }
        }
        cp0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
