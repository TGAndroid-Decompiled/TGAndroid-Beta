package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qm0 implements TextWatcher {
    public final dn0 f37796a;

    public qm0(dn0 dn0Var) {
        this.f37796a = dn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z4;
        int indexOf;
        dn0 dn0Var = this.f37796a;
        ArrayList arrayList = dn0Var.R0;
        HashMap hashMap = dn0Var.T0;
        if (dn0Var.W0) {
            return;
        }
        dn0Var.W0 = true;
        String d = se.b.d(dn0Var.V[1].getText().toString(), false);
        dn0Var.V[1].setText(d);
        org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) dn0Var.V[2];
        if (d.length() == 0) {
            h40Var.setHintText((String) null);
            h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            dn0Var.V[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            dn0Var.V[1].setText(substring);
                            str = d.substring(i10) + dn0Var.V[2].getText().toString();
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
                    str = d.substring(1) + dn0Var.V[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = dn0Var.V[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z4 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                dn0Var.V[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) dn0Var.U0.get(d);
                if (str3 != null) {
                    h40Var.setHintText(str3.replace('X', (char) 8211));
                    h40Var.setHint((CharSequence) null);
                }
            } else {
                h40Var.setHintText((String) null);
                h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                dn0Var.V[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z4) {
                EditTextBoldCursor editTextBoldCursor2 = dn0Var.V[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                h40Var.requestFocus();
                h40Var.setText(str);
                h40Var.setSelection(h40Var.length());
            }
        }
        dn0Var.W0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
