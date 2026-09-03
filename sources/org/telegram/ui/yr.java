package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class yr implements TextWatcher {
    public final int f43685a;
    public int f43686b;
    public int f43687c;
    public final Object d;

    public yr(Object obj, int i10) {
        this.f43685a = i10;
        this.d = obj;
        this.f43686b = -1;
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
        switch (this.f43685a) {
            case 0:
                int i18 = this.f43687c;
                int i19 = this.f43686b;
                zr zrVar = (zr) this.d;
                if (!zrVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        zrVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                cs[] csVarArr = zrVar.f44011f;
                                if (i22 < csVarArr.length) {
                                    csVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        zrVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        cs[] csVarArr2 = zrVar.f44011f;
                        if (i23 < csVarArr2.length) {
                            cs csVar = csVarArr2[i23];
                            csVar.setSelection(csVar.length());
                            zrVar.f44011f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && zrVar.getCode().length() == i18) {
                        zrVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ng0 ng0Var = (ng0) this.d;
                kg0 kg0Var = ng0Var.f39344b;
                if (!ng0Var.G) {
                    int selectionStart = kg0Var.getSelectionStart();
                    String obj2 = kg0Var.getText().toString();
                    if (this.f43686b == 3) {
                        obj2 = obj2.substring(0, this.f43687c) + obj2.substring(this.f43687c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb = new StringBuilder(obj2.length());
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i24 = i25;
                    }
                    ng0Var.G = true;
                    String hintText = kg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f43686b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f43686b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        kg0Var.setSelection(Math.min(selectionStart, kg0Var.length()));
                    }
                    kg0Var.invalidate();
                    ng0Var.r();
                    ng0Var.G = false;
                    return;
                }
                return;
            case 2:
                uj0 uj0Var = (uj0) this.d;
                if (!uj0Var.C) {
                    int selectionStart2 = uj0Var.N.getSelectionStart();
                    String obj3 = uj0Var.N.getText().toString();
                    if (this.f43686b == 3) {
                        obj3 = obj3.substring(0, this.f43687c) + obj3.substring(this.f43687c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj3.length());
                    int i27 = 0;
                    while (i27 < obj3.length()) {
                        int i28 = i27 + 1;
                        String substring2 = obj3.substring(i27, i28);
                        if ("0123456789".contains(substring2)) {
                            sb2.append(substring2);
                        }
                        i27 = i28;
                    }
                    uj0Var.C = true;
                    String hintText2 = uj0Var.N.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb2.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb2.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f43686b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb2.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f43686b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart2 >= 0) {
                        rj0 rj0Var = uj0Var.N;
                        rj0Var.setSelection(Math.min(selectionStart2, rj0Var.length()));
                    }
                    uj0Var.N.invalidate();
                    uj0Var.C = false;
                    uj0.q(uj0Var);
                    return;
                }
                return;
            case 3:
                fn0 fn0Var = (fn0) this.d;
                if (!fn0Var.X0) {
                    org.telegram.ui.Components.j40 j40Var = (org.telegram.ui.Components.j40) fn0Var.V[2];
                    int selectionStart3 = j40Var.getSelectionStart();
                    String obj4 = j40Var.getText().toString();
                    if (this.f43686b == 3) {
                        obj4 = obj4.substring(0, this.f43687c) + obj4.substring(this.f43687c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj4.length());
                    int i30 = 0;
                    while (i30 < obj4.length()) {
                        int i31 = i30 + 1;
                        String substring3 = obj4.substring(i30, i31);
                        if ("0123456789".contains(substring3)) {
                            sb3.append(substring3);
                        }
                        i30 = i31;
                    }
                    fn0Var.X0 = true;
                    String hintText3 = j40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb3.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb3.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f43686b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb3.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f43686b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    j40Var.setText(sb3);
                    if (selectionStart3 >= 0) {
                        j40Var.setSelection(Math.min(selectionStart3, j40Var.length()));
                    }
                    j40Var.invalidate();
                    fn0Var.X0 = false;
                    return;
                }
                return;
            default:
                lo0 lo0Var = (lo0) this.d;
                if (!lo0Var.f38725k0) {
                    org.telegram.ui.Components.j40 j40Var2 = (org.telegram.ui.Components.j40) lo0Var.f38719f[9];
                    int selectionStart4 = j40Var2.getSelectionStart();
                    String obj5 = j40Var2.getText().toString();
                    if (this.f43686b == 3) {
                        obj5 = obj5.substring(0, this.f43687c) + obj5.substring(this.f43687c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj5.length());
                    int i33 = 0;
                    while (i33 < obj5.length()) {
                        int i34 = i33 + 1;
                        String substring4 = obj5.substring(i33, i34);
                        if ("0123456789".contains(substring4)) {
                            sb4.append(substring4);
                        }
                        i33 = i34;
                    }
                    lo0Var.f38725k0 = true;
                    String hintText4 = j40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb4.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb4.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f43686b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb4.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f43686b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    j40Var2.setText(sb4);
                    if (selectionStart4 >= 0) {
                        j40Var2.setSelection(Math.min(selectionStart4, j40Var2.length()));
                    }
                    j40Var2.invalidate();
                    lo0Var.f38725k0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f43685a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f43686b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f43686b = 3;
                        this.f43687c = i10 - 1;
                        return;
                    }
                    this.f43686b = 2;
                    return;
                } else {
                    this.f43686b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f43686b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f43686b = 3;
                        this.f43687c = i10 - 1;
                        return;
                    }
                    this.f43686b = 2;
                    return;
                } else {
                    this.f43686b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f43686b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f43686b = 3;
                        this.f43687c = i10 - 1;
                        return;
                    }
                    this.f43686b = 2;
                    return;
                } else {
                    this.f43686b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f43686b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f43686b = 3;
                        this.f43687c = i10 - 1;
                        return;
                    }
                    this.f43686b = 2;
                    return;
                } else {
                    this.f43686b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43685a;
    }

    public yr(zr zrVar, int i10, int i11) {
        this.f43685a = 0;
        this.d = zrVar;
        this.f43686b = i10;
        this.f43687c = i11;
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
