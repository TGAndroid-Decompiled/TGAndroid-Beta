package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sm0 implements TextWatcher {
    public final fn0 f38266a;

    public sm0(fn0 fn0Var) {
        this.f38266a = fn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z4;
        int indexOf;
        fn0 fn0Var = this.f38266a;
        ArrayList arrayList = fn0Var.R0;
        HashMap hashMap = fn0Var.T0;
        if (fn0Var.W0) {
            return;
        }
        fn0Var.W0 = true;
        String d = se.b.d(fn0Var.V[1].getText().toString(), false);
        fn0Var.V[1].setText(d);
        org.telegram.ui.Components.i40 i40Var = (org.telegram.ui.Components.i40) fn0Var.V[2];
        if (d.length() == 0) {
            i40Var.setHintText((String) null);
            i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            fn0Var.V[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            fn0Var.V[1].setText(substring);
                            str = d.substring(i10) + fn0Var.V[2].getText().toString();
                            d = substring;
                            z4 = true;
                            break;
                        }
                        i10--;
                    } else {
                        str = null;
                        z4 = false;
                        break;
                    }
                }
                if (!z4) {
                    str = d.substring(1) + fn0Var.V[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = fn0Var.V[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z4 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                fn0Var.V[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) fn0Var.U0.get(d);
                if (str3 != null) {
                    i40Var.setHintText(str3.replace('X', (char) 8211));
                    i40Var.setHint((CharSequence) null);
                }
            } else {
                i40Var.setHintText((String) null);
                i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                fn0Var.V[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z4) {
                EditTextBoldCursor editTextBoldCursor2 = fn0Var.V[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                i40Var.requestFocus();
                i40Var.setText(str);
                i40Var.setSelection(i40Var.length());
            }
        }
        fn0Var.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
