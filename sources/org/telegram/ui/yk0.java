package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yk0 implements TextWatcher {
    public final int f53531a;
    public final jl0 f53532b;

    public yk0(jl0 jl0Var, int i7) {
        this.f53531a = i7;
        this.f53532b = jl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i7 = this.f53531a;
        jl0 jl0Var = this.f53532b;
        switch (i7) {
            case 0:
                if (jl0Var.f48391d0 != 0 && editable.length() == jl0Var.f48391d0) {
                    jl0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = jl0Var.f48388c;
                if (!jl0Var.f48407n0) {
                    jl0Var.f48407n0 = true;
                    String d = pf.b.d(jl0Var.f48396f[8].getText().toString(), false);
                    jl0Var.f48396f[8].setText(d);
                    org.telegram.ui.Components.y20 y20Var = (org.telegram.ui.Components.y20) jl0Var.f48396f[9];
                    if (d.length() == 0) {
                        y20Var.setHintText((String) null);
                        y20Var.setHint(org.telegram.messenger.hd.M0(2131747372, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        jl0Var.f48396f[8].setText(substring);
                                        str = d.substring(i10) + jl0Var.f48396f[9].getText().toString();
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + jl0Var.f48396f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = jl0Var.f48396f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && jl0Var.f48382a.indexOf(str3) != -1 && (str2 = (String) jl0Var.d.get(d)) != null) {
                            y20Var.setHintText(str2.replace('X', (char) 8211));
                            y20Var.setHint((CharSequence) null);
                        } else {
                            y20Var.setHintText((String) null);
                            y20Var.setHint(org.telegram.messenger.hd.M0(2131747372, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = jl0Var.f48396f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            y20Var.requestFocus();
                            y20Var.setText(str);
                            y20Var.setSelection(y20Var.length());
                        }
                    }
                    jl0Var.f48407n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f53531a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f53531a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
