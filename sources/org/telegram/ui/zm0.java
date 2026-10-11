package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zm0 implements TextWatcher {
    public final mn0 f44698a;

    public zm0(mn0 mn0Var) {
        this.f44698a = mn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        mn0 mn0Var = this.f44698a;
        ArrayList arrayList = mn0Var.U0;
        HashMap hashMap = mn0Var.W0;
        if (mn0Var.Z0) {
            return;
        }
        mn0Var.Z0 = true;
        String d = hf.b.d(mn0Var.Y[1].getText().toString(), false);
        mn0Var.Y[1].setText(d);
        org.telegram.ui.Components.x40 x40Var = (org.telegram.ui.Components.x40) mn0Var.Y[2];
        if (d.length() == 0) {
            x40Var.setHintText((String) null);
            x40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            mn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            mn0Var.Y[1].setText(substring);
                            str = d.substring(i10) + mn0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + mn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = mn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                mn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) mn0Var.X0.get(d);
                if (str3 != null) {
                    x40Var.setHintText(str3.replace('X', (char) 8211));
                    x40Var.setHint((CharSequence) null);
                }
            } else {
                x40Var.setHintText((String) null);
                x40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                mn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = mn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                x40Var.requestFocus();
                x40Var.setText(str);
                x40Var.setSelection(x40Var.length());
            }
        }
        mn0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
