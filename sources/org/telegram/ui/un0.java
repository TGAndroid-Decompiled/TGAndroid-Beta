package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class un0 implements TextWatcher {
    public final co0 f43276a;

    public un0(co0 co0Var) {
        this.f43276a = co0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        co0 co0Var = this.f43276a;
        HashMap hashMap = co0Var.f37251c;
        if (co0Var.f37260i0) {
            return;
        }
        co0Var.f37260i0 = true;
        String d = ne.b.d(co0Var.f37256f[8].getText().toString(), false);
        co0Var.f37256f[8].setText(d);
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) co0Var.f37256f[9];
        if (d.length() == 0) {
            p30Var.setHintText((String) null);
            p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i9 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i9 >= 1) {
                        String substring = d.substring(0, i9);
                        if (((String) hashMap.get(substring)) != null) {
                            co0Var.f37256f[8].setText(substring);
                            str = d.substring(i9) + co0Var.f37256f[9].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i9--;
                    } else {
                        str = null;
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + co0Var.f37256f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = co0Var.f37256f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && co0Var.f37245a.indexOf(str3) != -1 && (str2 = (String) co0Var.d.get(d)) != null) {
                p30Var.setHintText(str2.replace('X', (char) 8211));
                p30Var.setHint((CharSequence) null);
            } else {
                p30Var.setHintText((String) null);
                p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = co0Var.f37256f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p30Var.requestFocus();
                p30Var.setText(str);
                p30Var.setSelection(p30Var.length());
            }
        }
        co0Var.f37260i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
