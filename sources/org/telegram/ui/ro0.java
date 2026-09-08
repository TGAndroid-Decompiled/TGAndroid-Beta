package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ro0 implements TextWatcher {
    public final String[] f40240a = {"34", "37"};
    public final String[] f40241b = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public final String[] f40242c = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
    public int d = -1;
    public int f40243e;
    public final xo0 f40244f;

    public ro0(xo0 xo0Var) {
        this.f40244f = xo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        char c10;
        boolean z10;
        int i10;
        int i11;
        String[] strArr;
        int i12;
        String str;
        xo0 xo0Var = this.f40244f;
        if (xo0Var.f42857o0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = xo0Var.f42846f[0];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        int i13 = 3;
        int i14 = 1;
        if (this.d == 3) {
            obj = obj.substring(0, this.f40243e) + obj.substring(this.f40243e + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i15 = 0;
        while (i15 < obj.length()) {
            int i16 = i15 + 1;
            String substring = obj.substring(i15, i16);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i15 = i16;
        }
        xo0Var.f42857o0 = true;
        String str2 = null;
        int i17 = 100;
        if (sb2.length() > 0) {
            String sb3 = sb2.toString();
            int i18 = 0;
            while (true) {
                if (i18 < i13) {
                    if (i18 != 0) {
                        if (i18 != i14) {
                            strArr = this.f40241b;
                            i12 = 14;
                            str = "xxxx xxxx xxxx xx";
                        } else {
                            strArr = this.f40240a;
                            i12 = 15;
                            str = "xxxx xxxx xxxx xxx";
                        }
                    } else {
                        strArr = this.f40242c;
                        i12 = 16;
                        str = "xxxx xxxx xxxx xxxx";
                    }
                    c10 = 1;
                    for (String str3 : strArr) {
                        if (sb3.length() <= str3.length()) {
                            if (str3.startsWith(sb3)) {
                                i17 = i12;
                                str2 = str;
                                break;
                            }
                        } else if (sb3.startsWith(str3)) {
                            i17 = i12;
                            str2 = str;
                            break;
                        }
                    }
                    if (str2 != null) {
                        break;
                    }
                    i18++;
                    i13 = 3;
                    i14 = 1;
                } else {
                    c10 = 1;
                    break;
                }
            }
            if (sb2.length() > i17) {
                sb2.setLength(i17);
            }
        } else {
            c10 = 1;
        }
        if (str2 != null) {
            if (sb2.length() == i17) {
                xo0Var.f42846f[c10].requestFocus();
            }
            editTextBoldCursor.setTextColor(xo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            int i19 = 0;
            while (true) {
                if (i19 >= sb2.length()) {
                    break;
                } else if (i19 < str2.length()) {
                    if (str2.charAt(i19) == ' ') {
                        sb2.insert(i19, ' ');
                        i19++;
                        if (selectionStart == i19 && (i11 = this.d) != 2 && i11 != 3) {
                            selectionStart++;
                        }
                    }
                    i19++;
                } else {
                    sb2.insert(i19, ' ');
                    if (selectionStart == i19 + 1 && (i10 = this.d) != 2 && i10 != 3) {
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
        xo0Var.f42857o0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            this.d = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                this.d = 3;
                this.f40243e = i10 - 1;
                return;
            }
            this.d = 2;
        } else {
            this.d = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
