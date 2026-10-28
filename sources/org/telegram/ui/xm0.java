package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xm0 implements TextWatcher {
    public final kn0 f45737a;

    public xm0(kn0 kn0Var) {
        this.f45737a = kn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        kn0 kn0Var = this.f45737a;
        ArrayList arrayList = kn0Var.U0;
        HashMap hashMap = kn0Var.W0;
        if (kn0Var.Z0) {
            return;
        }
        kn0Var.Z0 = true;
        String d = kf.b.d(kn0Var.Y[1].getText().toString(), false);
        kn0Var.Y[1].setText(d);
        org.telegram.ui.Components.q40 q40Var = (org.telegram.ui.Components.q40) kn0Var.Y[2];
        if (d.length() == 0) {
            q40Var.setHintText((String) null);
            q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            kn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            kn0Var.Y[1].setText(substring);
                            str = d.substring(i10) + kn0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + kn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = kn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                kn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) kn0Var.X0.get(d);
                if (str3 != null) {
                    q40Var.setHintText(str3.replace('X', (char) 8211));
                    q40Var.setHint((CharSequence) null);
                }
            } else {
                q40Var.setHintText((String) null);
                q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                kn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                q40Var.requestFocus();
                q40Var.setText(str);
                q40Var.setSelection(q40Var.length());
            }
        }
        kn0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
