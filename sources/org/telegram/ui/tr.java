package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

public final class tr implements TextWatcher {

    public final int f42997a;

    public int f42998b;

    public int f42999c;
    public final Object d;

    public tr(Object obj, int i10) {
        this.f42997a = i10;
        this.d = obj;
        this.f42998b = -1;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f42997a) {
            case 0:
                int i18 = this.f42999c;
                int i19 = this.f42998b;
                ur urVar = (ur) this.d;
                if (!urVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String string = editable.toString();
                        urVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, string.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                wr[] wrVarArr = urVar.f43279f;
                                if (i22 < wrVarArr.length) {
                                    wrVarArr[i22].setText(string.substring(i21, i21 + 1));
                                }
                            }
                        }
                        urVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        wr[] wrVarArr2 = urVar.f43279f;
                        if (i23 < wrVarArr2.length) {
                            wr wrVar = wrVarArr2[i23];
                            wrVar.setSelection(wrVar.length());
                            urVar.f43279f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && urVar.getCode().length() == i18) {
                        urVar.a();
                    }
                }
                break;
            case 1:
                hg0 hg0Var = (hg0) this.d;
                eg0 eg0Var = hg0Var.f38805b;
                if (!hg0Var.F) {
                    int selectionStart = eg0Var.getSelectionStart();
                    String string2 = eg0Var.getText().toString();
                    if (this.f42998b == 3) {
                        string2 = string2.substring(0, this.f42999c) + string2.substring(this.f42999c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(string2.length());
                    int i24 = 0;
                    while (i24 < string2.length()) {
                        int i25 = i24 + 1;
                        String strSubstring = string2.substring(i24, i25);
                        if ("0123456789".contains(strSubstring)) {
                            sb2.append(strSubstring);
                        }
                        i24 = i25;
                    }
                    hg0Var.F = true;
                    String hintText = eg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (i26 < sb2.length()) {
                            if (i26 < hintText.length()) {
                                if (hintText.charAt(i26) == ' ') {
                                    sb2.insert(i26, ' ');
                                    i26++;
                                    if (selectionStart == i26 && (i11 = this.f42998b) != 2 && i11 != 3) {
                                        selectionStart++;
                                    }
                                }
                                i26++;
                            } else {
                                sb2.insert(i26, ' ');
                                if (selectionStart == i26 + 1 && (i10 = this.f42998b) != 2 && i10 != 3) {
                                    selectionStart++;
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        eg0Var.setSelection(Math.min(selectionStart, eg0Var.length()));
                    }
                    eg0Var.invalidate();
                    hg0Var.r();
                    hg0Var.F = false;
                    break;
                }
                break;
            case 2:
                oj0 oj0Var = (oj0) this.d;
                if (!oj0Var.B) {
                    int selectionStart2 = oj0Var.M.getSelectionStart();
                    String string3 = oj0Var.M.getText().toString();
                    if (this.f42998b == 3) {
                        string3 = string3.substring(0, this.f42999c) + string3.substring(this.f42999c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(string3.length());
                    int i27 = 0;
                    while (i27 < string3.length()) {
                        int i28 = i27 + 1;
                        String strSubstring2 = string3.substring(i27, i28);
                        if ("0123456789".contains(strSubstring2)) {
                            sb3.append(strSubstring2);
                        }
                        i27 = i28;
                    }
                    oj0Var.B = true;
                    String hintText2 = oj0Var.M.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (i29 < sb3.length()) {
                            if (i29 < hintText2.length()) {
                                if (hintText2.charAt(i29) == ' ') {
                                    sb3.insert(i29, ' ');
                                    i29++;
                                    if (selectionStart2 == i29 && (i13 = this.f42998b) != 2 && i13 != 3) {
                                        selectionStart2++;
                                    }
                                }
                                i29++;
                            } else {
                                sb3.insert(i29, ' ');
                                if (selectionStart2 == i29 + 1 && (i12 = this.f42998b) != 2 && i12 != 3) {
                                    selectionStart2++;
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        mj0 mj0Var = oj0Var.M;
                        mj0Var.setSelection(Math.min(selectionStart2, mj0Var.length()));
                    }
                    oj0Var.M.invalidate();
                    oj0Var.B = false;
                    oj0.r(oj0Var);
                    break;
                }
                break;
            case 3:
                xm0 xm0Var = (xm0) this.d;
                if (!xm0Var.W0) {
                    org.telegram.ui.Components.u30 u30Var = (org.telegram.ui.Components.u30) xm0Var.U[2];
                    int selectionStart3 = u30Var.getSelectionStart();
                    String string4 = u30Var.getText().toString();
                    if (this.f42998b == 3) {
                        string4 = string4.substring(0, this.f42999c) + string4.substring(this.f42999c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(string4.length());
                    int i30 = 0;
                    while (i30 < string4.length()) {
                        int i31 = i30 + 1;
                        String strSubstring3 = string4.substring(i30, i31);
                        if ("0123456789".contains(strSubstring3)) {
                            sb4.append(strSubstring3);
                        }
                        i30 = i31;
                    }
                    xm0Var.W0 = true;
                    String hintText3 = u30Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (i32 < sb4.length()) {
                            if (i32 < hintText3.length()) {
                                if (hintText3.charAt(i32) == ' ') {
                                    sb4.insert(i32, ' ');
                                    i32++;
                                    if (selectionStart3 == i32 && (i15 = this.f42998b) != 2 && i15 != 3) {
                                        selectionStart3++;
                                    }
                                }
                                i32++;
                            } else {
                                sb4.insert(i32, ' ');
                                if (selectionStart3 == i32 + 1 && (i14 = this.f42998b) != 2 && i14 != 3) {
                                    selectionStart3++;
                                }
                            }
                        }
                    }
                    u30Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        u30Var.setSelection(Math.min(selectionStart3, u30Var.length()));
                    }
                    u30Var.invalidate();
                    xm0Var.W0 = false;
                    break;
                }
                break;
            default:
                do0 do0Var = (do0) this.d;
                if (!do0Var.f37467j0) {
                    org.telegram.ui.Components.u30 u30Var2 = (org.telegram.ui.Components.u30) do0Var.f37462f[9];
                    int selectionStart4 = u30Var2.getSelectionStart();
                    String string5 = u30Var2.getText().toString();
                    if (this.f42998b == 3) {
                        string5 = string5.substring(0, this.f42999c) + string5.substring(this.f42999c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(string5.length());
                    int i33 = 0;
                    while (i33 < string5.length()) {
                        int i34 = i33 + 1;
                        String strSubstring4 = string5.substring(i33, i34);
                        if ("0123456789".contains(strSubstring4)) {
                            sb5.append(strSubstring4);
                        }
                        i33 = i34;
                    }
                    do0Var.f37467j0 = true;
                    String hintText4 = u30Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (i35 < sb5.length()) {
                            if (i35 < hintText4.length()) {
                                if (hintText4.charAt(i35) == ' ') {
                                    sb5.insert(i35, ' ');
                                    i35++;
                                    if (selectionStart4 == i35 && (i17 = this.f42998b) != 2 && i17 != 3) {
                                        selectionStart4++;
                                    }
                                }
                                i35++;
                            } else {
                                sb5.insert(i35, ' ');
                                if (selectionStart4 == i35 + 1 && (i16 = this.f42998b) != 2 && i16 != 3) {
                                    selectionStart4++;
                                }
                            }
                        }
                    }
                    u30Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        u30Var2.setSelection(Math.min(selectionStart4, u30Var2.length()));
                    }
                    u30Var2.invalidate();
                    do0Var.f37467j0 = false;
                    break;
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f42997a) {
            case 0:
                break;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f42998b = 1;
                } else if (i11 != 1 || i12 != 0) {
                    this.f42998b = -1;
                } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                    this.f42998b = 3;
                    this.f42999c = i10 - 1;
                } else {
                    this.f42998b = 2;
                }
                break;
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f42998b = 1;
                } else if (i11 != 1 || i12 != 0) {
                    this.f42998b = -1;
                } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                    this.f42998b = 3;
                    this.f42999c = i10 - 1;
                } else {
                    this.f42998b = 2;
                }
                break;
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f42998b = 1;
                } else if (i11 != 1 || i12 != 0) {
                    this.f42998b = -1;
                } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                    this.f42998b = 3;
                    this.f42999c = i10 - 1;
                } else {
                    this.f42998b = 2;
                }
                break;
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f42998b = 1;
                } else if (i11 != 1 || i12 != 0) {
                    this.f42998b = -1;
                } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                    this.f42998b = 3;
                    this.f42999c = i10 - 1;
                } else {
                    this.f42998b = 2;
                }
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42997a;
    }

    public tr(ur urVar, int i10, int i11) {
        this.f42997a = 0;
        this.d = urVar;
        this.f42998b = i10;
        this.f42999c = i11;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
