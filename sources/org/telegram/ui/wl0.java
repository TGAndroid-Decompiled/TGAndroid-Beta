package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wl0 implements TextWatcher {
    public boolean f43329a;
    public String f43330b;
    public boolean f43331c;
    public int d;
    public int e;
    public boolean f43332f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final sm0 f43333n;

    public wl0(sm0 sm0Var) {
        this.f43333n = sm0Var;
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
        long j10;
        boolean z10;
        String str;
        String str2;
        String substring;
        sm0 sm0Var = this.f43333n;
        if (sm0Var.m0) {
            return;
        }
        Long l4 = sm0Var.H0;
        if (l4 != null) {
            j10 = l4.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f43330b;
        if (str3 == null) {
            str3 = org.telegram.messenger.cd.n(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str4 = sm0Var.C0.invoice.currency;
        str4.getClass();
        int i10 = 10;
        char c10 = 65535;
        switch (str4.hashCode()) {
            case 65726:
                if (str4.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (str4.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (str4.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (str4.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (str4.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (str4.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (str4.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (str4.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (str4.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72801:
                if (str4.equals("ISK")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 73631:
                if (str4.equals("JOD")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73683:
                if (str4.equals("JPY")) {
                    c10 = 11;
                    break;
                }
                break;
            case 74532:
                if (str4.equals("KMF")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74704:
                if (str4.equals("KRW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74840:
                if (str4.equals("KWD")) {
                    c10 = 14;
                    break;
                }
                break;
            case 75863:
                if (str4.equals("LYD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 76263:
                if (str4.equals("MGA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76618:
                if (str4.equals("MRO")) {
                    c10 = 17;
                    break;
                }
                break;
            case 78388:
                if (str4.equals("OMR")) {
                    c10 = 18;
                    break;
                }
                break;
            case 79710:
                if (str4.equals("PYG")) {
                    c10 = 19;
                    break;
                }
                break;
            case 81569:
                if (str4.equals("RWF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 83210:
                if (str4.equals("TND")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83974:
                if (str4.equals("UGX")) {
                    c10 = 22;
                    break;
                }
                break;
            case 84517:
                if (str4.equals("UYI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 85132:
                if (str4.equals("VND")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85367:
                if (str4.equals("VUV")) {
                    c10 = 25;
                    break;
                }
                break;
            case 86653:
                if (str4.equals("XAF")) {
                    c10 = 26;
                    break;
                }
                break;
            case 87087:
                if (str4.equals("XOF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87118:
                if (str4.equals("XPF")) {
                    c10 = 28;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\b':
            case '\n':
            case 14:
            case 15:
            case 18:
            case 21:
                i10 = 1000;
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\t':
            case 11:
            case '\f':
            case '\r':
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                i10 = 1;
                break;
            case 3:
                i10 = 10000;
                break;
            case 17:
                break;
            default:
                i10 = 100;
                break;
        }
        if (a2 >= 0) {
            str = str3.substring(0, a2);
        } else {
            str = str3;
        }
        String str5 = "";
        if (a2 < 0) {
            str2 = "";
        } else {
            str2 = str3.substring(a2 + 1);
        }
        long longValue = Utilities.A(af.b.d(str, false)).longValue() * i10;
        long longValue2 = Utilities.A(af.b.d(str2, false)).longValue();
        String l10 = a1.g.l(longValue2, "");
        String str6 = "" + (i10 - 1);
        if (a2 > 0 && l10.length() > str6.length()) {
            if (this.e - a2 < l10.length()) {
                substring = l10.substring(0, str6.length());
            } else {
                substring = l10.substring(l10.length() - str6.length());
            }
            longValue2 = Utilities.A(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        sm0Var.H0 = valueOf;
        if (sm0Var.C0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = sm0Var.C0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                sm0Var.H0 = Long.valueOf(j11);
            }
        }
        int selectionStart = sm0Var.f41559f[0].getSelectionStart();
        sm0Var.m0 = true;
        if (sm0Var.H0.longValue() == 0) {
            sm0Var.f41559f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = sm0Var.f41559f[0];
            str5 = org.telegram.messenger.cd.D0().q(sm0Var.H0.longValue(), false, z10, true, sm0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str5);
        }
        if (j10 < sm0Var.H0.longValue() && j10 != 0 && this.f43329a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = sm0Var.f41559f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f43331c && this.d != sm0Var.f41559f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = sm0Var.f41559f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f43332f && z10 && a2 >= 0) {
            int a10 = a(str5);
            if (a10 > 0) {
                sm0Var.f41559f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = sm0Var.f41559f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = sm0Var.f41559f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f43332f = z10;
        sm0Var.Q0();
        this.f43330b = null;
        sm0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length;
        boolean z10;
        String str;
        if (!this.f43333n.m0) {
            this.f43329a = !TextUtils.isEmpty(charSequence);
            this.f43330b = null;
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
            this.f43331c = z10;
            if (z10) {
                String n10 = org.telegram.messenger.cd.n(charSequence);
                char charAt = n10.charAt(i10);
                int a2 = a(n10);
                if (a2 >= 0) {
                    str = n10.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.A(af.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i10 > a2 && longValue == 0) {
                        this.f43330b = n10.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i13 = i10 - 1;
                    if (i13 >= 0) {
                        char charAt2 = n10.charAt(i13);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f43330b = n10.substring(0, i13) + n10.substring(i10);
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
