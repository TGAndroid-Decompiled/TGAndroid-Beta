package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class zq implements TextWatcher {
    public final int f52646a;
    public int f52647b;
    public int f52648c;
    public final Object d;

    public zq(Object obj, int i7) {
        this.f52646a = i7;
        this.d = obj;
        this.f52647b = -1;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f52646a) {
            case 0:
                int i17 = this.f52648c;
                int i18 = this.f52647b;
                ar arVar = (ar) this.d;
                if (!arVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        arVar.d = true;
                        int i19 = i18;
                        for (int i20 = 0; i20 < Math.min(i17 - i18, length); i20++) {
                            if (i20 == 0) {
                                editable.replace(0, length, obj.substring(i20, i20 + 1));
                            } else {
                                i19++;
                                int i21 = i18 + i20;
                                dr[] drVarArr = arVar.f43768f;
                                if (i21 < drVarArr.length) {
                                    drVarArr[i21].setText(obj.substring(i20, i20 + 1));
                                }
                            }
                        }
                        arVar.d = false;
                        i18 = i19;
                    }
                    int i22 = i18 + 1;
                    if (i22 >= 0) {
                        dr[] drVarArr2 = arVar.f43768f;
                        if (i22 < drVarArr2.length) {
                            dr drVar = drVarArr2[i22];
                            drVar.setSelection(drVar.length());
                            arVar.f43768f[i22].requestFocus();
                        }
                    }
                    if ((i18 == i17 - 1 || (i18 == i17 - 2 && length >= 2)) && arVar.getCode().length() == i17) {
                        arVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                de0 de0Var = (de0) this.d;
                be0 be0Var = de0Var.f44926b;
                if (!de0Var.L) {
                    int selectionStart = be0Var.getSelectionStart();
                    String obj2 = be0Var.getText().toString();
                    if (this.f52647b == 3) {
                        obj2 = obj2.substring(0, this.f52648c) + obj2.substring(this.f52648c + 1);
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
                    de0Var.L = true;
                    String hintText = be0Var.getHintText();
                    if (hintText != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < sb2.length()) {
                                if (i25 < hintText.length()) {
                                    if (hintText.charAt(i25) == ' ') {
                                        sb2.insert(i25, ' ');
                                        i25++;
                                        if (selectionStart == i25 && (i10 = this.f52647b) != 2 && i10 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i25++;
                                } else {
                                    sb2.insert(i25, ' ');
                                    if (selectionStart == i25 + 1 && (i7 = this.f52647b) != 2 && i7 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        be0Var.setSelection(Math.min(selectionStart, be0Var.length()));
                    }
                    be0Var.invalidate();
                    de0Var.q();
                    de0Var.L = false;
                    return;
                }
                return;
            case 2:
                ch0 ch0Var = (ch0) this.d;
                if (!ch0Var.f44323v1) {
                    int selectionStart2 = ch0Var.G1.getSelectionStart();
                    String obj3 = ch0Var.G1.getText().toString();
                    if (this.f52647b == 3) {
                        obj3 = obj3.substring(0, this.f52648c) + obj3.substring(this.f52648c + 1);
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
                    ch0Var.f44323v1 = true;
                    String hintText2 = ch0Var.G1.getHintText();
                    if (hintText2 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 < sb3.length()) {
                                if (i28 < hintText2.length()) {
                                    if (hintText2.charAt(i28) == ' ') {
                                        sb3.insert(i28, ' ');
                                        i28++;
                                        if (selectionStart2 == i28 && (i12 = this.f52647b) != 2 && i12 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i28++;
                                } else {
                                    sb3.insert(i28, ' ');
                                    if (selectionStart2 == i28 + 1 && (i11 = this.f52647b) != 2 && i11 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        bh0 bh0Var = ch0Var.G1;
                        bh0Var.setSelection(Math.min(selectionStart2, bh0Var.length()));
                    }
                    ch0Var.G1.invalidate();
                    ch0Var.f44323v1 = false;
                    ch0.I0(ch0Var);
                    return;
                }
                return;
            case 3:
                dk0 dk0Var = (dk0) this.d;
                if (!dk0Var.f44993a1) {
                    org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) dk0Var.Y[2];
                    int selectionStart3 = w20Var.getSelectionStart();
                    String obj4 = w20Var.getText().toString();
                    if (this.f52647b == 3) {
                        obj4 = obj4.substring(0, this.f52648c) + obj4.substring(this.f52648c + 1);
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
                    dk0Var.f44993a1 = true;
                    String hintText3 = w20Var.getHintText();
                    if (hintText3 != null) {
                        int i31 = 0;
                        while (true) {
                            if (i31 < sb4.length()) {
                                if (i31 < hintText3.length()) {
                                    if (hintText3.charAt(i31) == ' ') {
                                        sb4.insert(i31, ' ');
                                        i31++;
                                        if (selectionStart3 == i31 && (i14 = this.f52647b) != 2 && i14 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i31++;
                                } else {
                                    sb4.insert(i31, ' ');
                                    if (selectionStart3 == i31 + 1 && (i13 = this.f52647b) != 2 && i13 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    w20Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        w20Var.setSelection(Math.min(selectionStart3, w20Var.length()));
                    }
                    w20Var.invalidate();
                    dk0Var.f44993a1 = false;
                    return;
                }
                return;
            default:
                jl0 jl0Var = (jl0) this.d;
                if (!jl0Var.f47017n0) {
                    org.telegram.ui.Components.w20 w20Var2 = (org.telegram.ui.Components.w20) jl0Var.f47007f[9];
                    int selectionStart4 = w20Var2.getSelectionStart();
                    String obj5 = w20Var2.getText().toString();
                    if (this.f52647b == 3) {
                        obj5 = obj5.substring(0, this.f52648c) + obj5.substring(this.f52648c + 1);
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
                    jl0Var.f47017n0 = true;
                    String hintText4 = w20Var2.getHintText();
                    if (hintText4 != null) {
                        int i34 = 0;
                        while (true) {
                            if (i34 < sb5.length()) {
                                if (i34 < hintText4.length()) {
                                    if (hintText4.charAt(i34) == ' ') {
                                        sb5.insert(i34, ' ');
                                        i34++;
                                        if (selectionStart4 == i34 && (i16 = this.f52647b) != 2 && i16 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i34++;
                                } else {
                                    sb5.insert(i34, ' ');
                                    if (selectionStart4 == i34 + 1 && (i15 = this.f52647b) != 2 && i15 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    w20Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        w20Var2.setSelection(Math.min(selectionStart4, w20Var2.length()));
                    }
                    w20Var2.invalidate();
                    jl0Var.f47017n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f52646a) {
            case 0:
                return;
            case 1:
                if (i10 == 0 && i11 == 1) {
                    this.f52647b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f52647b = 3;
                        this.f52648c = i7 - 1;
                        return;
                    }
                    this.f52647b = 2;
                    return;
                } else {
                    this.f52647b = -1;
                    return;
                }
            case 2:
                if (i10 == 0 && i11 == 1) {
                    this.f52647b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f52647b = 3;
                        this.f52648c = i7 - 1;
                        return;
                    }
                    this.f52647b = 2;
                    return;
                } else {
                    this.f52647b = -1;
                    return;
                }
            case 3:
                if (i10 == 0 && i11 == 1) {
                    this.f52647b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f52647b = 3;
                        this.f52648c = i7 - 1;
                        return;
                    }
                    this.f52647b = 2;
                    return;
                } else {
                    this.f52647b = -1;
                    return;
                }
            default:
                if (i10 == 0 && i11 == 1) {
                    this.f52647b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f52647b = 3;
                        this.f52648c = i7 - 1;
                        return;
                    }
                    this.f52647b = 2;
                    return;
                } else {
                    this.f52647b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52646a;
    }

    public zq(ar arVar, int i7, int i10) {
        this.f52646a = 0;
        this.d = arVar;
        this.f52647b = i7;
        this.f52648c = i10;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
