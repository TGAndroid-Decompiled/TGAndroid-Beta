package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yk0 implements TextWatcher {
    public final int f52137a;
    public final jl0 f52138b;

    public yk0(jl0 jl0Var, int i7) {
        this.f52137a = i7;
        this.f52138b = jl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        String str;
        String str2;
        int i7 = this.f52137a;
        jl0 jl0Var = this.f52138b;
        switch (i7) {
            case 0:
                if (jl0Var.f47000c0 != 0 && editable.length() == jl0Var.f47000c0) {
                    jl0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = jl0Var.f46999c;
                if (!jl0Var.m0) {
                    jl0Var.m0 = true;
                    String d = pf.b.d(jl0Var.f47007f[8].getText().toString(), false);
                    jl0Var.f47007f[8].setText(d);
                    org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) jl0Var.f47007f[9];
                    if (d.length() == 0) {
                        w20Var.setHintText((String) null);
                        w20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        jl0Var.f47007f[8].setText(substring);
                                        str = d.substring(i10) + jl0Var.f47007f[9].getText().toString();
                                        d = substring;
                                        z9 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z9 = false;
                                    str = null;
                                }
                            }
                            if (!z9) {
                                str = d.substring(1) + jl0Var.f47007f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = jl0Var.f47007f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z9 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && jl0Var.f46993a.indexOf(str3) != -1 && (str2 = (String) jl0Var.d.get(d)) != null) {
                            w20Var.setHintText(str2.replace('X', (char) 8211));
                            w20Var.setHint((CharSequence) null);
                        } else {
                            w20Var.setHintText((String) null);
                            w20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                        }
                        if (!z9) {
                            EditTextBoldCursor editTextBoldCursor2 = jl0Var.f47007f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            w20Var.requestFocus();
                            w20Var.setText(str);
                            w20Var.setSelection(w20Var.length());
                        }
                    }
                    jl0Var.m0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52137a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52137a;
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
