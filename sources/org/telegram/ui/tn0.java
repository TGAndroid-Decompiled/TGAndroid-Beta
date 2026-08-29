package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tn0 implements TextWatcher {
    public final bo0 f43063a;

    public tn0(bo0 bo0Var) {
        this.f43063a = bo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        bo0 bo0Var = this.f43063a;
        HashMap hashMap = bo0Var.f36844c;
        if (bo0Var.f36853i0) {
            return;
        }
        bo0Var.f36853i0 = true;
        String d = qe.b.d(bo0Var.f36849f[8].getText().toString(), false);
        bo0Var.f36849f[8].setText(d);
        org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) bo0Var.f36849f[9];
        if (d.length() == 0) {
            d40Var.setHintText((String) null);
            d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            bo0Var.f36849f[8].setText(substring);
                            str = d.substring(i10) + bo0Var.f36849f[9].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i10--;
                    } else {
                        str = null;
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + bo0Var.f36849f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = bo0Var.f36849f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && bo0Var.f36838a.indexOf(str3) != -1 && (str2 = (String) bo0Var.d.get(d)) != null) {
                d40Var.setHintText(str2.replace('X', (char) 8211));
                d40Var.setHint((CharSequence) null);
            } else {
                d40Var.setHintText((String) null);
                d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = bo0Var.f36849f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                d40Var.requestFocus();
                d40Var.setText(str);
                d40Var.setSelection(d40Var.length());
            }
        }
        bo0Var.f36853i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
