package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uk0 implements TextWatcher {
    public final int f42154a;
    public final ll0 f42155b;

    public uk0(ll0 ll0Var, int i10) {
        this.f42154a = i10;
        this.f42155b = ll0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i10 = this.f42154a;
        ll0 ll0Var = this.f42155b;
        switch (i10) {
            case 0:
                if (!ll0Var.Z0 && ll0Var.T0 != 0 && ll0Var.Y[0].length() == ll0Var.T0) {
                    ll0Var.L.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = ll0Var.U0;
                HashMap hashMap = ll0Var.W0;
                if (!ll0Var.Z0) {
                    ll0Var.Z0 = true;
                    String d = af.b.d(ll0Var.Y[1].getText().toString(), false);
                    ll0Var.Y[1].setText(d);
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) ll0Var.Y[2];
                    if (d.length() == 0) {
                        n30Var.setHintText((String) null);
                        n30Var.setHint(org.telegram.messenger.cd.L0(2131747388, null));
                        ll0Var.Y[0].setText(org.telegram.messenger.cd.L0(2131752134, null));
                    } else {
                        int i11 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i11 >= 1) {
                                    String substring = d.substring(0, i11);
                                    if (((String) hashMap.get(substring)) != null) {
                                        ll0Var.Y[1].setText(substring);
                                        str = d.substring(i11) + ll0Var.Y[2].getText().toString();
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
                                str = d.substring(1) + ll0Var.Y[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = ll0Var.Y[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            ll0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) ll0Var.X0.get(d);
                            if (str3 != null) {
                                n30Var.setHintText(str3.replace('X', (char) 8211));
                                n30Var.setHint((CharSequence) null);
                            }
                        } else {
                            n30Var.setHintText((String) null);
                            n30Var.setHint(org.telegram.messenger.cd.L0(2131747388, null));
                            ll0Var.Y[0].setText(org.telegram.messenger.cd.L0(2131742884, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = ll0Var.Y[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            n30Var.requestFocus();
                            n30Var.setText(str);
                            n30Var.setSelection(n30Var.length());
                        }
                    }
                    ll0Var.Z0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42154a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42154a;
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
