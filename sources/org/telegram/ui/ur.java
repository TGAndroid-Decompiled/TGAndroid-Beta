package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ur implements TextWatcher {
    public final int f44519a;
    public int f44520b;
    public int f44521c;
    public final Object d;

    public ur(Object obj, int i10) {
        this.f44519a = i10;
        this.d = obj;
        this.f44520b = -1;
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
        switch (this.f44519a) {
            case 0:
                int i18 = this.f44521c;
                int i19 = this.f44520b;
                vr vrVar = (vr) this.d;
                if (!vrVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        vrVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                xr[] xrVarArr = vrVar.f44897f;
                                if (i22 < xrVarArr.length) {
                                    xrVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        vrVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        xr[] xrVarArr2 = vrVar.f44897f;
                        if (i23 < xrVarArr2.length) {
                            xr xrVar = xrVarArr2[i23];
                            xrVar.setSelection(xrVar.length());
                            vrVar.f44897f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && vrVar.getCode().length() == i18) {
                        vrVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fg0 fg0Var = (fg0) this.d;
                cg0 cg0Var = fg0Var.f39363b;
                if (!fg0Var.L) {
                    int selectionStart = cg0Var.getSelectionStart();
                    String obj2 = cg0Var.getText().toString();
                    if (this.f44520b == 3) {
                        obj2 = obj2.substring(0, this.f44521c) + obj2.substring(this.f44521c + 1);
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
                    fg0Var.L = true;
                    String hintText = cg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f44520b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f44520b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        cg0Var.setSelection(Math.min(selectionStart, cg0Var.length()));
                    }
                    cg0Var.invalidate();
                    fg0Var.p();
                    fg0Var.L = false;
                    return;
                }
                return;
            case 2:
                oj0 oj0Var = (oj0) this.d;
                if (!oj0Var.E) {
                    int selectionStart2 = oj0Var.P.getSelectionStart();
                    String obj3 = oj0Var.P.getText().toString();
                    if (this.f44520b == 3) {
                        obj3 = obj3.substring(0, this.f44521c) + obj3.substring(this.f44521c + 1);
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
                    oj0Var.E = true;
                    String hintText2 = oj0Var.P.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f44520b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f44520b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        mj0 mj0Var = oj0Var.P;
                        mj0Var.setSelection(Math.min(selectionStart2, mj0Var.length()));
                    }
                    oj0Var.P.invalidate();
                    oj0Var.E = false;
                    oj0.r(oj0Var);
                    return;
                }
                return;
            case 3:
                in0 in0Var = (in0) this.d;
                if (!in0Var.f40274a1) {
                    org.telegram.ui.Components.q40 q40Var = (org.telegram.ui.Components.q40) in0Var.Y[2];
                    int selectionStart3 = q40Var.getSelectionStart();
                    String obj4 = q40Var.getText().toString();
                    if (this.f44520b == 3) {
                        obj4 = obj4.substring(0, this.f44521c) + obj4.substring(this.f44521c + 1);
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
                    in0Var.f40274a1 = true;
                    String hintText3 = q40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f44520b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f44520b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    q40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        q40Var.setSelection(Math.min(selectionStart3, q40Var.length()));
                    }
                    q40Var.invalidate();
                    in0Var.f40274a1 = false;
                    return;
                }
                return;
            default:
                po0 po0Var = (po0) this.d;
                if (!po0Var.f42609n0) {
                    org.telegram.ui.Components.q40 q40Var2 = (org.telegram.ui.Components.q40) po0Var.f42599f[9];
                    int selectionStart4 = q40Var2.getSelectionStart();
                    String obj5 = q40Var2.getText().toString();
                    if (this.f44520b == 3) {
                        obj5 = obj5.substring(0, this.f44521c) + obj5.substring(this.f44521c + 1);
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
                    po0Var.f42609n0 = true;
                    String hintText4 = q40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f44520b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f44520b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    q40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        q40Var2.setSelection(Math.min(selectionStart4, q40Var2.length()));
                    }
                    q40Var2.invalidate();
                    po0Var.f42609n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f44519a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f44520b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f44520b = 3;
                        this.f44521c = i10 - 1;
                        return;
                    }
                    this.f44520b = 2;
                    return;
                } else {
                    this.f44520b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f44520b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f44520b = 3;
                        this.f44521c = i10 - 1;
                        return;
                    }
                    this.f44520b = 2;
                    return;
                } else {
                    this.f44520b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f44520b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f44520b = 3;
                        this.f44521c = i10 - 1;
                        return;
                    }
                    this.f44520b = 2;
                    return;
                } else {
                    this.f44520b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f44520b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f44520b = 3;
                        this.f44521c = i10 - 1;
                        return;
                    }
                    this.f44520b = 2;
                    return;
                } else {
                    this.f44520b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44519a;
    }

    public ur(vr vrVar, int i10, int i11) {
        this.f44519a = 0;
        this.d = vrVar;
        this.f44520b = i10;
        this.f44521c = i11;
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
