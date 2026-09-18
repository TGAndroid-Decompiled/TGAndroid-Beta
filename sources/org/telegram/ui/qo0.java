package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qo0 implements TextWatcher {
    public final yo0 f37010a;

    public qo0(yo0 yo0Var) {
        this.f37010a = yo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        yo0 yo0Var = this.f37010a;
        HashMap hashMap = yo0Var.f39955c;
        if (yo0Var.m0) {
            return;
        }
        yo0Var.m0 = true;
        String d = gf.b.d(yo0Var.f39962f[8].getText().toString(), false);
        yo0Var.f39962f[8].setText(d);
        org.telegram.ui.Components.f40 f40Var = (org.telegram.ui.Components.f40) yo0Var.f39962f[9];
        if (d.length() == 0) {
            f40Var.setHintText((String) null);
            f40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            yo0Var.f39962f[8].setText(substring);
                            str = d.substring(i10) + yo0Var.f39962f[9].getText().toString();
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
                    str = d.substring(1) + yo0Var.f39962f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = yo0Var.f39962f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && yo0Var.f39949a.indexOf(str3) != -1 && (str2 = (String) yo0Var.d.get(d)) != null) {
                f40Var.setHintText(str2.replace('X', (char) 8211));
                f40Var.setHint((CharSequence) null);
            } else {
                f40Var.setHintText((String) null);
                f40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = yo0Var.f39962f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                f40Var.requestFocus();
                f40Var.setText(str);
                f40Var.setSelection(f40Var.length());
            }
        }
        yo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
