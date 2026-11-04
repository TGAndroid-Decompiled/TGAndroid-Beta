package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sk0 implements TextWatcher {
    public final int f49529a;
    public final dl0 f49530b;

    public sk0(dl0 dl0Var, int i3) {
        this.f49529a = i3;
        this.f49530b = dl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i3 = this.f49529a;
        dl0 dl0Var = this.f49530b;
        switch (i3) {
            case 0:
                if (dl0Var.f44745d0 != 0 && editable.length() == dl0Var.f44745d0) {
                    dl0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = dl0Var.f44742c;
                if (!dl0Var.f44761n0) {
                    dl0Var.f44761n0 = true;
                    String d = mf.b.d(dl0Var.f44750f[8].getText().toString(), false);
                    dl0Var.f44750f[8].setText(d);
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) dl0Var.f44750f[9];
                    if (d.length() == 0) {
                        r20Var.setHintText((String) null);
                        r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        dl0Var.f44750f[8].setText(substring);
                                        str = d.substring(i10) + dl0Var.f44750f[9].getText().toString();
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
                                str = d.substring(1) + dl0Var.f44750f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = dl0Var.f44750f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && dl0Var.f44736a.indexOf(str3) != -1 && (str2 = (String) dl0Var.d.get(d)) != null) {
                            r20Var.setHintText(str2.replace('X', (char) 8211));
                            r20Var.setHint((CharSequence) null);
                        } else {
                            r20Var.setHintText((String) null);
                            r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = dl0Var.f44750f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            r20Var.requestFocus();
                            r20Var.setText(str);
                            r20Var.setSelection(r20Var.length());
                        }
                    }
                    dl0Var.f44761n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f49529a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f49529a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
