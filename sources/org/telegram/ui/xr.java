package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class xr implements TextWatcher {
    public final int f39952a;
    public int f39953b;
    public int f39954c;
    public final Object d;

    public xr(Object obj, int i10) {
        this.f39952a = i10;
        this.d = obj;
        this.f39953b = -1;
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
        switch (this.f39952a) {
            case 0:
                int i18 = this.f39954c;
                int i19 = this.f39953b;
                yr yrVar = (yr) this.d;
                if (!yrVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        yrVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                as[] asVarArr = yrVar.f40221f;
                                if (i22 < asVarArr.length) {
                                    asVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        yrVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        as[] asVarArr2 = yrVar.f40221f;
                        if (i23 < asVarArr2.length) {
                            as asVar = asVarArr2[i23];
                            asVar.setSelection(asVar.length());
                            yrVar.f40221f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && yrVar.getCode().length() == i18) {
                        yrVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pg0 pg0Var = (pg0) this.d;
                mg0 mg0Var = pg0Var.f36510b;
                if (!pg0Var.J) {
                    int selectionStart = mg0Var.getSelectionStart();
                    String obj2 = mg0Var.getText().toString();
                    if (this.f39953b == 3) {
                        obj2 = obj2.substring(0, this.f39954c) + obj2.substring(this.f39954c + 1);
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
                    pg0Var.J = true;
                    String hintText = mg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f39953b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f39953b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        mg0Var.setSelection(Math.min(selectionStart, mg0Var.length()));
                    }
                    mg0Var.invalidate();
                    pg0Var.r();
                    pg0Var.J = false;
                    return;
                }
                return;
            case 2:
                wj0 wj0Var = (wj0) this.d;
                if (!wj0Var.F) {
                    int selectionStart2 = wj0Var.Q.getSelectionStart();
                    String obj3 = wj0Var.Q.getText().toString();
                    if (this.f39953b == 3) {
                        obj3 = obj3.substring(0, this.f39954c) + obj3.substring(this.f39954c + 1);
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
                    wj0Var.F = true;
                    String hintText2 = wj0Var.Q.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f39953b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f39953b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        uj0 uj0Var = wj0Var.Q;
                        uj0Var.setSelection(Math.min(selectionStart2, uj0Var.length()));
                    }
                    wj0Var.Q.invalidate();
                    wj0Var.F = false;
                    wj0.q(wj0Var);
                    return;
                }
                return;
            case 3:
                gn0 gn0Var = (gn0) this.d;
                if (!gn0Var.f33958a1) {
                    org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) gn0Var.Y[2];
                    int selectionStart3 = g40Var.getSelectionStart();
                    String obj4 = g40Var.getText().toString();
                    if (this.f39953b == 3) {
                        obj4 = obj4.substring(0, this.f39954c) + obj4.substring(this.f39954c + 1);
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
                    gn0Var.f33958a1 = true;
                    String hintText3 = g40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f39953b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f39953b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    g40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        g40Var.setSelection(Math.min(selectionStart3, g40Var.length()));
                    }
                    g40Var.invalidate();
                    gn0Var.f33958a1 = false;
                    return;
                }
                return;
            default:
                oo0 oo0Var = (oo0) this.d;
                if (!oo0Var.f36284n0) {
                    org.telegram.ui.Components.g40 g40Var2 = (org.telegram.ui.Components.g40) oo0Var.f36274f[9];
                    int selectionStart4 = g40Var2.getSelectionStart();
                    String obj5 = g40Var2.getText().toString();
                    if (this.f39953b == 3) {
                        obj5 = obj5.substring(0, this.f39954c) + obj5.substring(this.f39954c + 1);
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
                    oo0Var.f36284n0 = true;
                    String hintText4 = g40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f39953b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f39953b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    g40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        g40Var2.setSelection(Math.min(selectionStart4, g40Var2.length()));
                    }
                    g40Var2.invalidate();
                    oo0Var.f36284n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f39952a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f39953b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f39953b = 3;
                        this.f39954c = i10 - 1;
                        return;
                    }
                    this.f39953b = 2;
                    return;
                } else {
                    this.f39953b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f39953b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f39953b = 3;
                        this.f39954c = i10 - 1;
                        return;
                    }
                    this.f39953b = 2;
                    return;
                } else {
                    this.f39953b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f39953b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f39953b = 3;
                        this.f39954c = i10 - 1;
                        return;
                    }
                    this.f39953b = 2;
                    return;
                } else {
                    this.f39953b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f39953b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f39953b = 3;
                        this.f39954c = i10 - 1;
                        return;
                    }
                    this.f39953b = 2;
                    return;
                } else {
                    this.f39953b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39952a;
    }

    public xr(yr yrVar, int i10, int i11) {
        this.f39952a = 0;
        this.d = yrVar;
        this.f39953b = i10;
        this.f39954c = i11;
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
