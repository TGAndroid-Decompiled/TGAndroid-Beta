package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wn0 implements TextWatcher {
    public final String[] f44212a = {"34", "37"};
    public final String[] f44213b = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public final String[] f44214c = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
    public int d = -1;
    public int f44215e;
    public final co0 f44216f;

    public wn0(co0 co0Var) {
        this.f44216f = co0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        char c10;
        boolean z10;
        int i9;
        int i10;
        String[] strArr;
        int i11;
        String str;
        co0 co0Var = this.f44216f;
        if (co0Var.f37262k0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = co0Var.f37256f[0];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        int i12 = 3;
        int i13 = 1;
        if (this.d == 3) {
            obj = obj.substring(0, this.f44215e) + obj.substring(this.f44215e + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i14 = 0;
        while (i14 < obj.length()) {
            int i15 = i14 + 1;
            String substring = obj.substring(i14, i15);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i14 = i15;
        }
        co0Var.f37262k0 = true;
        String str2 = null;
        int i16 = 100;
        if (sb2.length() > 0) {
            String sb3 = sb2.toString();
            int i17 = 0;
            while (true) {
                if (i17 < i12) {
                    if (i17 != 0) {
                        if (i17 != i13) {
                            strArr = this.f44213b;
                            i11 = 14;
                            str = "xxxx xxxx xxxx xx";
                        } else {
                            strArr = this.f44212a;
                            i11 = 15;
                            str = "xxxx xxxx xxxx xxx";
                        }
                    } else {
                        strArr = this.f44214c;
                        i11 = 16;
                        str = "xxxx xxxx xxxx xxxx";
                    }
                    c10 = 1;
                    for (String str3 : strArr) {
                        if (sb3.length() <= str3.length()) {
                            if (str3.startsWith(sb3)) {
                                i16 = i11;
                                str2 = str;
                                break;
                            }
                        } else if (sb3.startsWith(str3)) {
                            i16 = i11;
                            str2 = str;
                            break;
                        }
                    }
                    if (str2 != null) {
                        break;
                    }
                    i17++;
                    i12 = 3;
                    i13 = 1;
                } else {
                    c10 = 1;
                    break;
                }
            }
            if (sb2.length() > i16) {
                sb2.setLength(i16);
            }
        } else {
            c10 = 1;
        }
        if (str2 != null) {
            if (sb2.length() == i16) {
                co0Var.f37256f[c10].requestFocus();
            }
            editTextBoldCursor.setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            int i18 = 0;
            while (true) {
                if (i18 >= sb2.length()) {
                    break;
                } else if (i18 < str2.length()) {
                    if (str2.charAt(i18) == ' ') {
                        sb2.insert(i18, ' ');
                        i18++;
                        if (selectionStart == i18 && (i10 = this.d) != 2 && i10 != 3) {
                            selectionStart++;
                        }
                    }
                    i18++;
                } else {
                    sb2.insert(i18, ' ');
                    if (selectionStart == i18 + 1 && (i9 = this.d) != 2 && i9 != 3) {
                        selectionStart++;
                    }
                }
            }
        }
        if (!sb2.toString().equals(editable.toString())) {
            z10 = false;
            editable.replace(0, editable.length(), sb2);
        } else {
            z10 = false;
        }
        if (selectionStart >= 0) {
            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
        }
        co0Var.f37262k0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            this.d = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i9) == ' ' && i9 > 0) {
                this.d = 3;
                this.f44215e = i9 - 1;
                return;
            }
            this.d = 2;
        } else {
            this.d = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
