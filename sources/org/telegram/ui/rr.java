package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class rr implements TextWatcher {
    public final int f41212a;
    public int f41213b;
    public int f41214c;
    public final Object d;

    public rr(Object obj, int i10) {
        this.f41212a = i10;
        this.d = obj;
        this.f41213b = -1;
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
        switch (this.f41212a) {
            case 0:
                int i18 = this.f41214c;
                int i19 = this.f41213b;
                sr srVar = (sr) this.d;
                if (!srVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        srVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                vr[] vrVarArr = srVar.f41792f;
                                if (i22 < vrVarArr.length) {
                                    vrVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        srVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        vr[] vrVarArr2 = srVar.f41792f;
                        if (i23 < vrVarArr2.length) {
                            vr vrVar = vrVarArr2[i23];
                            vrVar.setSelection(vrVar.length());
                            srVar.f41792f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && srVar.getCode().length() == i18) {
                        srVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gg0 gg0Var = (gg0) this.d;
                dg0 dg0Var = gg0Var.f37563b;
                if (!gg0Var.L) {
                    int selectionStart = dg0Var.getSelectionStart();
                    String obj2 = dg0Var.getText().toString();
                    if (this.f41213b == 3) {
                        obj2 = obj2.substring(0, this.f41214c) + obj2.substring(this.f41214c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i24 = i25;
                    }
                    gg0Var.L = true;
                    String hintText = dg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f41213b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f41213b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        dg0Var.setSelection(Math.min(selectionStart, dg0Var.length()));
                    }
                    dg0Var.invalidate();
                    gg0Var.p();
                    gg0Var.L = false;
                    return;
                }
                return;
            case 2:
                qj0 qj0Var = (qj0) this.d;
                if (!qj0Var.E) {
                    int selectionStart2 = qj0Var.P.getSelectionStart();
                    String obj3 = qj0Var.P.getText().toString();
                    if (this.f41213b == 3) {
                        obj3 = obj3.substring(0, this.f41214c) + obj3.substring(this.f41214c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i27 = 0;
                    while (i27 < obj3.length()) {
                        int i28 = i27 + 1;
                        String substring2 = obj3.substring(i27, i28);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i27 = i28;
                    }
                    qj0Var.E = true;
                    String hintText2 = qj0Var.P.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f41213b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f41213b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        oj0 oj0Var = qj0Var.P;
                        oj0Var.setSelection(Math.min(selectionStart2, oj0Var.length()));
                    }
                    qj0Var.P.invalidate();
                    qj0Var.E = false;
                    qj0.s(qj0Var);
                    return;
                }
                return;
            case 3:
                zm0 zm0Var = (zm0) this.d;
                if (!zm0Var.f44126a1) {
                    org.telegram.ui.Components.m40 m40Var = (org.telegram.ui.Components.m40) zm0Var.Y[2];
                    int selectionStart3 = m40Var.getSelectionStart();
                    String obj4 = m40Var.getText().toString();
                    if (this.f41213b == 3) {
                        obj4 = obj4.substring(0, this.f41214c) + obj4.substring(this.f41214c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i30 = 0;
                    while (i30 < obj4.length()) {
                        int i31 = i30 + 1;
                        String substring3 = obj4.substring(i30, i31);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i30 = i31;
                    }
                    zm0Var.f44126a1 = true;
                    String hintText3 = m40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f41213b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f41213b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    m40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        m40Var.setSelection(Math.min(selectionStart3, m40Var.length()));
                    }
                    m40Var.invalidate();
                    zm0Var.f44126a1 = false;
                    return;
                }
                return;
            default:
                ho0 ho0Var = (ho0) this.d;
                if (!ho0Var.f37937n0) {
                    org.telegram.ui.Components.m40 m40Var2 = (org.telegram.ui.Components.m40) ho0Var.f37927f[9];
                    int selectionStart4 = m40Var2.getSelectionStart();
                    String obj5 = m40Var2.getText().toString();
                    if (this.f41213b == 3) {
                        obj5 = obj5.substring(0, this.f41214c) + obj5.substring(this.f41214c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i33 = 0;
                    while (i33 < obj5.length()) {
                        int i34 = i33 + 1;
                        String substring4 = obj5.substring(i33, i34);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i33 = i34;
                    }
                    ho0Var.f37937n0 = true;
                    String hintText4 = m40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f41213b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f41213b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    m40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        m40Var2.setSelection(Math.min(selectionStart4, m40Var2.length()));
                    }
                    m40Var2.invalidate();
                    ho0Var.f37937n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41212a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f41213b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f41213b = 3;
                        this.f41214c = i10 - 1;
                        return;
                    }
                    this.f41213b = 2;
                    return;
                } else {
                    this.f41213b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f41213b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f41213b = 3;
                        this.f41214c = i10 - 1;
                        return;
                    }
                    this.f41213b = 2;
                    return;
                } else {
                    this.f41213b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f41213b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f41213b = 3;
                        this.f41214c = i10 - 1;
                        return;
                    }
                    this.f41213b = 2;
                    return;
                } else {
                    this.f41213b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f41213b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f41213b = 3;
                        this.f41214c = i10 - 1;
                        return;
                    }
                    this.f41213b = 2;
                    return;
                } else {
                    this.f41213b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41212a;
    }

    public rr(sr srVar, int i10, int i11) {
        this.f41212a = 0;
        this.d = srVar;
        this.f41213b = i10;
        this.f41214c = i11;
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
