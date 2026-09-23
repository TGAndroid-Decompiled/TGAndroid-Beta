package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vm0 implements TextWatcher {
    public final in0 f38424a;

    public vm0(in0 in0Var) {
        this.f38424a = in0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        in0 in0Var = this.f38424a;
        ArrayList arrayList = in0Var.U0;
        HashMap hashMap = in0Var.W0;
        if (in0Var.Z0) {
            return;
        }
        in0Var.Z0 = true;
        String d = gf.b.d(in0Var.Y[1].getText().toString(), false);
        in0Var.Y[1].setText(d);
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) in0Var.Y[2];
        if (d.length() == 0) {
            g40Var.setHintText((String) null);
            g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            in0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            in0Var.Y[1].setText(substring);
                            str = d.substring(i10) + in0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + in0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = in0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                in0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) in0Var.X0.get(d);
                if (str3 != null) {
                    g40Var.setHintText(str3.replace('X', (char) 8211));
                    g40Var.setHint((CharSequence) null);
                }
            } else {
                g40Var.setHintText((String) null);
                g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                in0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                g40Var.requestFocus();
                g40Var.setText(str);
                g40Var.setSelection(g40Var.length());
            }
        }
        in0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
