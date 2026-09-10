package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yn0 implements TextWatcher {
    public boolean f39034a;
    public String f39035b;
    public boolean f39036c;
    public int d;
    public int e;
    public boolean f39037f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final wo0 f39038n;

    public yn0(wo0 wo0Var) {
        this.f39038n = wo0Var;
    }

    public final int a(String str) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i10 < cArr.length) {
                int indexOf = str.indexOf(cArr[i10]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j3;
        boolean z10;
        String str;
        String str2;
        String substring;
        wo0 wo0Var = this.f39038n;
        if (wo0Var.m0) {
            return;
        }
        Long l4 = wo0Var.H0;
        if (l4 != null) {
            j3 = l4.longValue();
        } else {
            j3 = 0;
        }
        String str3 = this.f39035b;
        if (str3 == null) {
            str3 = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(wo0Var.C0.invoice.currency);
        if (a2 >= 0) {
            str = str3.substring(0, a2);
        } else {
            str = str3;
        }
        String str4 = "";
        if (a2 < 0) {
            str2 = "";
        } else {
            str2 = str3.substring(a2 + 1);
        }
        long longValue = Utilities.parseLong(gf.b.d(str, false)).longValue() * currencyExpDivider;
        long longValue2 = Utilities.parseLong(gf.b.d(str2, false)).longValue();
        String o9 = a4.a.o(longValue2, "");
        String str5 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && o9.length() > str5.length()) {
            if (this.e - a2 < o9.length()) {
                substring = o9.substring(0, str5.length());
            } else {
                substring = o9.substring(o9.length() - str5.length());
            }
            longValue2 = Utilities.parseLong(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        wo0Var.H0 = valueOf;
        if (wo0Var.C0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j10 = wo0Var.C0.invoice.max_tip_amount;
            if (longValue3 > j10) {
                wo0Var.H0 = Long.valueOf(j10);
            }
        }
        int selectionStart = wo0Var.f38267f[0].getSelectionStart();
        wo0Var.m0 = true;
        if (wo0Var.H0.longValue() == 0) {
            wo0Var.f38267f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = wo0Var.f38267f[0];
            str4 = LocaleController.getInstance().formatCurrencyString(wo0Var.H0.longValue(), false, z10, true, wo0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str4);
        }
        if (j3 < wo0Var.H0.longValue() && j3 != 0 && this.f39034a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = wo0Var.f38267f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f39036c && this.d != wo0Var.f38267f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = wo0Var.f38267f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f39037f && z10 && a2 >= 0) {
            int a10 = a(str4);
            if (a10 > 0) {
                wo0Var.f38267f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = wo0Var.f38267f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = wo0Var.f38267f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f39037f = z10;
        wo0Var.L0();
        this.f39035b = null;
        wo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length;
        boolean z10;
        String str;
        if (!this.f39038n.m0) {
            this.f39034a = !TextUtils.isEmpty(charSequence);
            this.f39035b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.e = i10;
            if (i11 == 1 && i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39036c = z10;
            if (z10) {
                String fixNumbers = LocaleController.fixNumbers(charSequence);
                char charAt = fixNumbers.charAt(i10);
                int a2 = a(fixNumbers);
                if (a2 >= 0) {
                    str = fixNumbers.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.parseLong(gf.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i10 > a2 && longValue == 0) {
                        this.f39035b = fixNumbers.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i13 = i10 - 1;
                    if (i13 >= 0) {
                        char charAt2 = fixNumbers.charAt(i13);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f39035b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
                            return;
                        }
                        i10 = i13;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
