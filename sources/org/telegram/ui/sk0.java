package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sk0 implements TextWatcher {
    public final int f41383a;
    public final jl0 f41384b;

    public sk0(jl0 jl0Var, int i10) {
        this.f41383a = i10;
        this.f41384b = jl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i10 = this.f41383a;
        jl0 jl0Var = this.f41384b;
        switch (i10) {
            case 0:
                if (!jl0Var.Z0 && jl0Var.T0 != 0 && jl0Var.Y[0].length() == jl0Var.T0) {
                    jl0Var.L.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = jl0Var.U0;
                HashMap hashMap = jl0Var.W0;
                if (!jl0Var.Z0) {
                    jl0Var.Z0 = true;
                    String d = af.b.d(jl0Var.Y[1].getText().toString(), false);
                    jl0Var.Y[1].setText(d);
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) jl0Var.Y[2];
                    if (d.length() == 0) {
                        n30Var.setHintText((String) null);
                        n30Var.setHint(org.telegram.messenger.dd.L0(2131747388, null));
                        jl0Var.Y[0].setText(org.telegram.messenger.dd.L0(2131752134, null));
                    } else {
                        int i11 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i11 >= 1) {
                                    String substring = d.substring(0, i11);
                                    if (((String) hashMap.get(substring)) != null) {
                                        jl0Var.Y[1].setText(substring);
                                        str = d.substring(i11) + jl0Var.Y[2].getText().toString();
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i11--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + jl0Var.Y[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = jl0Var.Y[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            jl0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) jl0Var.X0.get(d);
                            if (str3 != null) {
                                n30Var.setHintText(str3.replace('X', (char) 8211));
                                n30Var.setHint((CharSequence) null);
                            }
                        } else {
                            n30Var.setHintText((String) null);
                            n30Var.setHint(org.telegram.messenger.dd.L0(2131747388, null));
                            jl0Var.Y[0].setText(org.telegram.messenger.dd.L0(2131742884, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = jl0Var.Y[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            n30Var.requestFocus();
                            n30Var.setText(str);
                            n30Var.setSelection(n30Var.length());
                        }
                    }
                    jl0Var.Z0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41383a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41383a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
