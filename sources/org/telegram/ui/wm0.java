package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wm0 implements TextWatcher {
    public final jn0 f39377a;

    public wm0(jn0 jn0Var) {
        this.f39377a = jn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        jn0 jn0Var = this.f39377a;
        ArrayList arrayList = jn0Var.U0;
        HashMap hashMap = jn0Var.W0;
        if (jn0Var.Z0) {
            return;
        }
        jn0Var.Z0 = true;
        String d = gf.b.d(jn0Var.Y[1].getText().toString(), false);
        jn0Var.Y[1].setText(d);
        org.telegram.ui.Components.i40 i40Var = (org.telegram.ui.Components.i40) jn0Var.Y[2];
        if (d.length() == 0) {
            i40Var.setHintText((String) null);
            i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            jn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            jn0Var.Y[1].setText(substring);
                            str = d.substring(i10) + jn0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + jn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = jn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                jn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) jn0Var.X0.get(d);
                if (str3 != null) {
                    i40Var.setHintText(str3.replace('X', (char) 8211));
                    i40Var.setHint((CharSequence) null);
                }
            } else {
                i40Var.setHintText((String) null);
                i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                jn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = jn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                i40Var.requestFocus();
                i40Var.setText(str);
                i40Var.setSelection(i40Var.length());
            }
        }
        jn0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
