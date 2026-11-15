package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class zq implements TextWatcher {
    public final int f54007a;
    public int f54008b;
    public int f54009c;
    public final Object d;

    public zq(Object obj, int i7) {
        this.f54007a = i7;
        this.d = obj;
        this.f54008b = -1;
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
        switch (this.f54007a) {
            case 0:
                int i17 = this.f54009c;
                int i18 = this.f54008b;
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
                                dr[] drVarArr = arVar.f45491f;
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
                        dr[] drVarArr2 = arVar.f45491f;
                        if (i22 < drVarArr2.length) {
                            dr drVar = drVarArr2[i22];
                            drVar.setSelection(drVar.length());
                            arVar.f45491f[i22].requestFocus();
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
                be0 be0Var = (be0) this.d;
                zd0 zd0Var = be0Var.f45689b;
                if (!be0Var.M) {
                    int selectionStart = zd0Var.getSelectionStart();
                    String obj2 = zd0Var.getText().toString();
                    if (this.f54008b == 3) {
                        obj2 = obj2.substring(0, this.f54009c) + obj2.substring(this.f54009c + 1);
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
                    be0Var.M = true;
                    String hintText = zd0Var.getHintText();
                    if (hintText != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < sb2.length()) {
                                if (i25 < hintText.length()) {
                                    if (hintText.charAt(i25) == ' ') {
                                        sb2.insert(i25, ' ');
                                        i25++;
                                        if (selectionStart == i25 && (i10 = this.f54008b) != 2 && i10 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i25++;
                                } else {
                                    sb2.insert(i25, ' ');
                                    if (selectionStart == i25 + 1 && (i7 = this.f54008b) != 2 && i7 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        zd0Var.setSelection(Math.min(selectionStart, zd0Var.length()));
                    }
                    zd0Var.invalidate();
                    be0Var.q();
                    be0Var.M = false;
                    return;
                }
                return;
            case 2:
                bh0 bh0Var = (bh0) this.d;
                if (!bh0Var.f45762z1) {
                    int selectionStart2 = bh0Var.K1.getSelectionStart();
                    String obj3 = bh0Var.K1.getText().toString();
                    if (this.f54008b == 3) {
                        obj3 = obj3.substring(0, this.f54009c) + obj3.substring(this.f54009c + 1);
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
                    bh0Var.f45762z1 = true;
                    String hintText2 = bh0Var.K1.getHintText();
                    if (hintText2 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 < sb3.length()) {
                                if (i28 < hintText2.length()) {
                                    if (hintText2.charAt(i28) == ' ') {
                                        sb3.insert(i28, ' ');
                                        i28++;
                                        if (selectionStart2 == i28 && (i12 = this.f54008b) != 2 && i12 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i28++;
                                } else {
                                    sb3.insert(i28, ' ');
                                    if (selectionStart2 == i28 + 1 && (i11 = this.f54008b) != 2 && i11 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        zg0 zg0Var = bh0Var.K1;
                        zg0Var.setSelection(Math.min(selectionStart2, zg0Var.length()));
                    }
                    bh0Var.K1.invalidate();
                    bh0Var.f45762z1 = false;
                    bh0.I0(bh0Var);
                    return;
                }
                return;
            case 3:
                ek0 ek0Var = (ek0) this.d;
                if (!ek0Var.f46807b1) {
                    org.telegram.ui.Components.y20 y20Var = (org.telegram.ui.Components.y20) ek0Var.Z[2];
                    int selectionStart3 = y20Var.getSelectionStart();
                    String obj4 = y20Var.getText().toString();
                    if (this.f54008b == 3) {
                        obj4 = obj4.substring(0, this.f54009c) + obj4.substring(this.f54009c + 1);
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
                    ek0Var.f46807b1 = true;
                    String hintText3 = y20Var.getHintText();
                    if (hintText3 != null) {
                        int i31 = 0;
                        while (true) {
                            if (i31 < sb4.length()) {
                                if (i31 < hintText3.length()) {
                                    if (hintText3.charAt(i31) == ' ') {
                                        sb4.insert(i31, ' ');
                                        i31++;
                                        if (selectionStart3 == i31 && (i14 = this.f54008b) != 2 && i14 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i31++;
                                } else {
                                    sb4.insert(i31, ' ');
                                    if (selectionStart3 == i31 + 1 && (i13 = this.f54008b) != 2 && i13 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    y20Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        y20Var.setSelection(Math.min(selectionStart3, y20Var.length()));
                    }
                    y20Var.invalidate();
                    ek0Var.f46807b1 = false;
                    return;
                }
                return;
            default:
                jl0 jl0Var = (jl0) this.d;
                if (!jl0Var.f48408o0) {
                    org.telegram.ui.Components.y20 y20Var2 = (org.telegram.ui.Components.y20) jl0Var.f48396f[9];
                    int selectionStart4 = y20Var2.getSelectionStart();
                    String obj5 = y20Var2.getText().toString();
                    if (this.f54008b == 3) {
                        obj5 = obj5.substring(0, this.f54009c) + obj5.substring(this.f54009c + 1);
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
                    jl0Var.f48408o0 = true;
                    String hintText4 = y20Var2.getHintText();
                    if (hintText4 != null) {
                        int i34 = 0;
                        while (true) {
                            if (i34 < sb5.length()) {
                                if (i34 < hintText4.length()) {
                                    if (hintText4.charAt(i34) == ' ') {
                                        sb5.insert(i34, ' ');
                                        i34++;
                                        if (selectionStart4 == i34 && (i16 = this.f54008b) != 2 && i16 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i34++;
                                } else {
                                    sb5.insert(i34, ' ');
                                    if (selectionStart4 == i34 + 1 && (i15 = this.f54008b) != 2 && i15 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    y20Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        y20Var2.setSelection(Math.min(selectionStart4, y20Var2.length()));
                    }
                    y20Var2.invalidate();
                    jl0Var.f48408o0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f54007a) {
            case 0:
                return;
            case 1:
                if (i10 == 0 && i11 == 1) {
                    this.f54008b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f54008b = 3;
                        this.f54009c = i7 - 1;
                        return;
                    }
                    this.f54008b = 2;
                    return;
                } else {
                    this.f54008b = -1;
                    return;
                }
            case 2:
                if (i10 == 0 && i11 == 1) {
                    this.f54008b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f54008b = 3;
                        this.f54009c = i7 - 1;
                        return;
                    }
                    this.f54008b = 2;
                    return;
                } else {
                    this.f54008b = -1;
                    return;
                }
            case 3:
                if (i10 == 0 && i11 == 1) {
                    this.f54008b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f54008b = 3;
                        this.f54009c = i7 - 1;
                        return;
                    }
                    this.f54008b = 2;
                    return;
                } else {
                    this.f54008b = -1;
                    return;
                }
            default:
                if (i10 == 0 && i11 == 1) {
                    this.f54008b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f54008b = 3;
                        this.f54009c = i7 - 1;
                        return;
                    }
                    this.f54008b = 2;
                    return;
                } else {
                    this.f54008b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f54007a;
    }

    public zq(ar arVar, int i7, int i10) {
        this.f54007a = 0;
        this.d = arVar;
        this.f54008b = i7;
        this.f54009c = i10;
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
