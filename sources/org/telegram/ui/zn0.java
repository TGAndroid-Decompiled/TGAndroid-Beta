package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zn0 implements TextWatcher {
    public final ho0 f44187a;

    public zn0(ho0 ho0Var) {
        this.f44187a = ho0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        ho0 ho0Var = this.f44187a;
        HashMap hashMap = ho0Var.f37920c;
        if (ho0Var.m0) {
            return;
        }
        ho0Var.m0 = true;
        String d = jf.b.d(ho0Var.f37927f[8].getText().toString(), false);
        ho0Var.f37927f[8].setText(d);
        org.telegram.ui.Components.m40 m40Var = (org.telegram.ui.Components.m40) ho0Var.f37927f[9];
        if (d.length() == 0) {
            m40Var.setHintText((String) null);
            m40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            ho0Var.f37927f[8].setText(substring);
                            str = d.substring(i10) + ho0Var.f37927f[9].getText().toString();
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
                    str = d.substring(1) + ho0Var.f37927f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = ho0Var.f37927f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && ho0Var.f37914a.indexOf(str3) != -1 && (str2 = (String) ho0Var.d.get(d)) != null) {
                m40Var.setHintText(str2.replace('X', (char) 8211));
                m40Var.setHint((CharSequence) null);
            } else {
                m40Var.setHintText((String) null);
                m40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = ho0Var.f37927f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                m40Var.requestFocus();
                m40Var.setText(str);
                m40Var.setSelection(m40Var.length());
            }
        }
        ho0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
