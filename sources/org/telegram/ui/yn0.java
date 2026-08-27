package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class yn0 implements TextWatcher {

    public int f44856a = -1;

    public boolean f44857b;

    public int f44858c;
    public final do0 d;

    public yn0(do0 do0Var) {
        this.d = do0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        nt ntVar;
        do0 do0Var = this.d;
        if (do0Var.f37468k0) {
            return;
        }
        boolean z10 = true;
        EditTextBoldCursor editTextBoldCursor = do0Var.f37462f[1];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String string = editTextBoldCursor.getText().toString();
        if (this.f44856a == 3) {
            string = string.substring(0, this.f44858c) + string.substring(this.f44858c + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(string.length());
        int i10 = 0;
        while (i10 < string.length()) {
            int i11 = i10 + 1;
            String strSubstring = string.substring(i10, i11);
            if ("0123456789".contains(strSubstring)) {
                sb2.append(strSubstring);
            }
            i10 = i11;
        }
        do0Var.f37468k0 = true;
        do0Var.f37462f[1].setTextColor(do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (sb2.length() > 4) {
            sb2.setLength(4);
        }
        if (sb2.length() < 2) {
            this.f44857b = false;
        }
        if (this.f44857b) {
            int i12 = sb2.length() > 2 ? 2 : 1;
            String[] strArr = new String[i12];
            strArr[0] = sb2.substring(0, 2);
            if (i12 == 2) {
                strArr[1] = sb2.substring(2);
            }
            if (sb2.length() == 4 && i12 == 2) {
                int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                Calendar calendar = Calendar.getInstance();
                boolean z11 = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) do0Var).currentAccount).getClientPhone().startsWith("7") || ((ntVar = do0Var.f37483w0) != null && ntVar.f40917c.equals("7"));
                int i13 = z11 ? 2022 : calendar.get(1);
                int i14 = z11 ? 1 : calendar.get(2) + 1;
                if (iIntValue2 < i13 || (iIntValue2 == i13 && iIntValue < i14)) {
                    do0Var.f37462f[1].setTextColor(do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                } else {
                    z10 = false;
                }
            } else {
                int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                if (iIntValue3 > 12 || iIntValue3 == 0) {
                    do0Var.f37462f[1].setTextColor(do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                } else {
                    z10 = false;
                }
            }
        } else {
            if (sb2.length() == 1) {
                int iIntValue4 = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (iIntValue4 != 1 && iIntValue4 != 0) {
                    sb2.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb2.length() == 2) {
                int iIntValue5 = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (iIntValue5 > 12 || iIntValue5 == 0) {
                    do0Var.f37462f[1].setTextColor(do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                } else {
                    z10 = false;
                }
                selectionStart++;
            }
            z10 = false;
        }
        if (!z10 && sb2.length() == 4) {
            do0Var.f37462f[do0Var.f37461e0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb2.length() != 2) {
            if (sb2.length() > 2 && sb2.charAt(2) != '/') {
                sb2.insert(2, '/');
            }
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
                editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
            }
            do0Var.f37468k0 = false;
        }
        sb2.append('/');
        selectionStart++;
        editTextBoldCursor.setText(sb2);
        if (selectionStart >= 0) {
            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
        }
        do0Var.f37468k0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            this.f44857b = TextUtils.indexOf((CharSequence) this.d.f37462f[1].getText(), '/') != -1;
            this.f44856a = 1;
            return;
        }
        if (i11 != 1 || i12 != 0) {
            this.f44856a = -1;
            return;
        }
        if (charSequence.charAt(i10) != '/' || i10 <= 0) {
            this.f44856a = 2;
            return;
        }
        this.f44857b = false;
        this.f44856a = 3;
        this.f44858c = i10 - 1;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
