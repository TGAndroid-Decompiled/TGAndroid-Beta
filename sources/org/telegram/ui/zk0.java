package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zk0 implements TextWatcher {
    public final int f54639a;
    public final kl0 f54640b;

    public zk0(kl0 kl0Var, int i7) {
        this.f54639a = i7;
        this.f54640b = kl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i7 = this.f54639a;
        kl0 kl0Var = this.f54640b;
        switch (i7) {
            case 0:
                if (kl0Var.f49462d0 != 0 && editable.length() == kl0Var.f49462d0) {
                    kl0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = kl0Var.f49459c;
                if (!kl0Var.f49478n0) {
                    kl0Var.f49478n0 = true;
                    String d = pf.b.d(kl0Var.f49467f[8].getText().toString(), false);
                    kl0Var.f49467f[8].setText(d);
                    org.telegram.ui.Components.g30 g30Var = (org.telegram.ui.Components.g30) kl0Var.f49467f[9];
                    if (d.length() == 0) {
                        g30Var.setHintText((String) null);
                        g30Var.setHint(org.telegram.messenger.gd.N0(2131747178, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        kl0Var.f49467f[8].setText(substring);
                                        str = d.substring(i10) + kl0Var.f49467f[9].getText().toString();
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
                                str = d.substring(1) + kl0Var.f49467f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = kl0Var.f49467f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && kl0Var.f49453a.indexOf(str3) != -1 && (str2 = (String) kl0Var.d.get(d)) != null) {
                            g30Var.setHintText(str2.replace('X', (char) 8211));
                            g30Var.setHint((CharSequence) null);
                        } else {
                            g30Var.setHintText((String) null);
                            g30Var.setHint(org.telegram.messenger.gd.N0(2131747178, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = kl0Var.f49467f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            g30Var.requestFocus();
                            g30Var.setText(str);
                            g30Var.setSelection(g30Var.length());
                        }
                    }
                    kl0Var.f49478n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f54639a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f54639a;
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
