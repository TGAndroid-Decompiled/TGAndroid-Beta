package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class wq implements TextWatcher {
    public final int f51588a;
    public int f51589b;
    public int f51590c;
    public final Object d;

    public wq(Object obj, int i3) {
        this.f51588a = i3;
        this.d = obj;
        this.f51589b = -1;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f51588a) {
            case 0:
                int i17 = this.f51590c;
                int i18 = this.f51589b;
                xq xqVar = (xq) this.d;
                if (!xqVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        xqVar.d = true;
                        int i19 = i18;
                        for (int i20 = 0; i20 < Math.min(i17 - i18, length); i20++) {
                            if (i20 == 0) {
                                editable.replace(0, length, obj.substring(i20, i20 + 1));
                            } else {
                                i19++;
                                int i21 = i18 + i20;
                                zq[] zqVarArr = xqVar.f52078f;
                                if (i21 < zqVarArr.length) {
                                    zqVarArr[i21].setText(obj.substring(i20, i20 + 1));
                                }
                            }
                        }
                        xqVar.d = false;
                        i18 = i19;
                    }
                    int i22 = i18 + 1;
                    if (i22 >= 0) {
                        zq[] zqVarArr2 = xqVar.f52078f;
                        if (i22 < zqVarArr2.length) {
                            zq zqVar = zqVarArr2[i22];
                            zqVar.setSelection(zqVar.length());
                            xqVar.f52078f[i22].requestFocus();
                        }
                    }
                    if ((i18 == i17 - 1 || (i18 == i17 - 2 && length >= 2)) && xqVar.getCode().length() == i17) {
                        xqVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wd0 wd0Var = (wd0) this.d;
                ud0 ud0Var = wd0Var.f50784b;
                if (!wd0Var.M) {
                    int selectionStart = ud0Var.getSelectionStart();
                    String obj2 = ud0Var.getText().toString();
                    if (this.f51589b == 3) {
                        obj2 = obj2.substring(0, this.f51590c) + obj2.substring(this.f51590c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i23 = 0;
                    while (i23 < obj2.length()) {
                        int i24 = i23 + 1;
                        String substring = obj2.substring(i23, i24);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i23 = i24;
                    }
                    wd0Var.M = true;
                    String hintText = ud0Var.getHintText();
                    if (hintText != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < sb2.length()) {
                                if (i25 < hintText.length()) {
                                    if (hintText.charAt(i25) == ' ') {
                                        sb2.insert(i25, ' ');
                                        i25++;
                                        if (selectionStart == i25 && (i10 = this.f51589b) != 2 && i10 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i25++;
                                } else {
                                    sb2.insert(i25, ' ');
                                    if (selectionStart == i25 + 1 && (i3 = this.f51589b) != 2 && i3 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        ud0Var.setSelection(Math.min(selectionStart, ud0Var.length()));
                    }
                    ud0Var.invalidate();
                    wd0Var.p();
                    wd0Var.M = false;
                    return;
                }
                return;
            case 2:
                vg0 vg0Var = (vg0) this.d;
                if (!vg0Var.f50523w1) {
                    int selectionStart2 = vg0Var.H1.getSelectionStart();
                    String obj3 = vg0Var.H1.getText().toString();
                    if (this.f51589b == 3) {
                        obj3 = obj3.substring(0, this.f51590c) + obj3.substring(this.f51590c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i26 = 0;
                    while (i26 < obj3.length()) {
                        int i27 = i26 + 1;
                        String substring2 = obj3.substring(i26, i27);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i26 = i27;
                    }
                    vg0Var.f50523w1 = true;
                    String hintText2 = vg0Var.H1.getHintText();
                    if (hintText2 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 < sb3.length()) {
                                if (i28 < hintText2.length()) {
                                    if (hintText2.charAt(i28) == ' ') {
                                        sb3.insert(i28, ' ');
                                        i28++;
                                        if (selectionStart2 == i28 && (i12 = this.f51589b) != 2 && i12 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i28++;
                                } else {
                                    sb3.insert(i28, ' ');
                                    if (selectionStart2 == i28 + 1 && (i11 = this.f51589b) != 2 && i11 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        ug0 ug0Var = vg0Var.H1;
                        ug0Var.setSelection(Math.min(selectionStart2, ug0Var.length()));
                    }
                    vg0Var.H1.invalidate();
                    vg0Var.f50523w1 = false;
                    vg0.I0(vg0Var);
                    return;
                }
                return;
            case 3:
                yj0 yj0Var = (yj0) this.d;
                if (!yj0Var.f52289b1) {
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) yj0Var.Z[2];
                    int selectionStart3 = r20Var.getSelectionStart();
                    String obj4 = r20Var.getText().toString();
                    if (this.f51589b == 3) {
                        obj4 = obj4.substring(0, this.f51590c) + obj4.substring(this.f51590c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i29 = 0;
                    while (i29 < obj4.length()) {
                        int i30 = i29 + 1;
                        String substring3 = obj4.substring(i29, i30);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i29 = i30;
                    }
                    yj0Var.f52289b1 = true;
                    String hintText3 = r20Var.getHintText();
                    if (hintText3 != null) {
                        int i31 = 0;
                        while (true) {
                            if (i31 < sb4.length()) {
                                if (i31 < hintText3.length()) {
                                    if (hintText3.charAt(i31) == ' ') {
                                        sb4.insert(i31, ' ');
                                        i31++;
                                        if (selectionStart3 == i31 && (i14 = this.f51589b) != 2 && i14 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i31++;
                                } else {
                                    sb4.insert(i31, ' ');
                                    if (selectionStart3 == i31 + 1 && (i13 = this.f51589b) != 2 && i13 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    r20Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        r20Var.setSelection(Math.min(selectionStart3, r20Var.length()));
                    }
                    r20Var.invalidate();
                    yj0Var.f52289b1 = false;
                    return;
                }
                return;
            default:
                dl0 dl0Var = (dl0) this.d;
                if (!dl0Var.f44762o0) {
                    org.telegram.ui.Components.r20 r20Var2 = (org.telegram.ui.Components.r20) dl0Var.f44750f[9];
                    int selectionStart4 = r20Var2.getSelectionStart();
                    String obj5 = r20Var2.getText().toString();
                    if (this.f51589b == 3) {
                        obj5 = obj5.substring(0, this.f51590c) + obj5.substring(this.f51590c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i32 = 0;
                    while (i32 < obj5.length()) {
                        int i33 = i32 + 1;
                        String substring4 = obj5.substring(i32, i33);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i32 = i33;
                    }
                    dl0Var.f44762o0 = true;
                    String hintText4 = r20Var2.getHintText();
                    if (hintText4 != null) {
                        int i34 = 0;
                        while (true) {
                            if (i34 < sb5.length()) {
                                if (i34 < hintText4.length()) {
                                    if (hintText4.charAt(i34) == ' ') {
                                        sb5.insert(i34, ' ');
                                        i34++;
                                        if (selectionStart4 == i34 && (i16 = this.f51589b) != 2 && i16 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i34++;
                                } else {
                                    sb5.insert(i34, ' ');
                                    if (selectionStart4 == i34 + 1 && (i15 = this.f51589b) != 2 && i15 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    r20Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        r20Var2.setSelection(Math.min(selectionStart4, r20Var2.length()));
                    }
                    r20Var2.invalidate();
                    dl0Var.f44762o0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f51588a) {
            case 0:
                return;
            case 1:
                if (i10 == 0 && i11 == 1) {
                    this.f51589b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i3) == ' ' && i3 > 0) {
                        this.f51589b = 3;
                        this.f51590c = i3 - 1;
                        return;
                    }
                    this.f51589b = 2;
                    return;
                } else {
                    this.f51589b = -1;
                    return;
                }
            case 2:
                if (i10 == 0 && i11 == 1) {
                    this.f51589b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i3) == ' ' && i3 > 0) {
                        this.f51589b = 3;
                        this.f51590c = i3 - 1;
                        return;
                    }
                    this.f51589b = 2;
                    return;
                } else {
                    this.f51589b = -1;
                    return;
                }
            case 3:
                if (i10 == 0 && i11 == 1) {
                    this.f51589b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i3) == ' ' && i3 > 0) {
                        this.f51589b = 3;
                        this.f51590c = i3 - 1;
                        return;
                    }
                    this.f51589b = 2;
                    return;
                } else {
                    this.f51589b = -1;
                    return;
                }
            default:
                if (i10 == 0 && i11 == 1) {
                    this.f51589b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i3) == ' ' && i3 > 0) {
                        this.f51589b = 3;
                        this.f51590c = i3 - 1;
                        return;
                    }
                    this.f51589b = 2;
                    return;
                } else {
                    this.f51589b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f51588a;
    }

    public wq(xq xqVar, int i3, int i10) {
        this.f51588a = 0;
        this.d = xqVar;
        this.f51589b = i3;
        this.f51590c = i10;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
