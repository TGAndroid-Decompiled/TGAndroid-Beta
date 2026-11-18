package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rj0 implements TextWatcher {
    public final int f51624a;
    public final hk0 f51625b;

    public rj0(hk0 hk0Var, int i7) {
        this.f51624a = i7;
        this.f51625b = hk0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i7 = this.f51624a;
        hk0 hk0Var = this.f51625b;
        switch (i7) {
            case 0:
                if (!hk0Var.f48415a1 && hk0Var.U0 != 0 && hk0Var.Z[0].length() == hk0Var.U0) {
                    hk0Var.M.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = hk0Var.V0;
                HashMap hashMap = hk0Var.X0;
                if (!hk0Var.f48415a1) {
                    hk0Var.f48415a1 = true;
                    String d = pf.b.d(hk0Var.Z[1].getText().toString(), false);
                    hk0Var.Z[1].setText(d);
                    org.telegram.ui.Components.g30 g30Var = (org.telegram.ui.Components.g30) hk0Var.Z[2];
                    if (d.length() == 0) {
                        g30Var.setHintText((String) null);
                        g30Var.setHint(org.telegram.messenger.gd.M0(2131747179, null));
                        hk0Var.Z[0].setText(org.telegram.messenger.gd.M0(2131752123, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        hk0Var.Z[1].setText(substring);
                                        str = d.substring(i10) + hk0Var.Z[2].getText().toString();
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
                                str = d.substring(1) + hk0Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = hk0Var.Z[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            hk0Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) hk0Var.Y0.get(d);
                            if (str3 != null) {
                                g30Var.setHintText(str3.replace('X', (char) 8211));
                                g30Var.setHint((CharSequence) null);
                            }
                        } else {
                            g30Var.setHintText((String) null);
                            g30Var.setHint(org.telegram.messenger.gd.M0(2131747179, null));
                            hk0Var.Z[0].setText(org.telegram.messenger.gd.M0(2131742601, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            g30Var.requestFocus();
                            g30Var.setText(str);
                            g30Var.setSelection(g30Var.length());
                        }
                    }
                    hk0Var.f48415a1 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51624a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51624a;
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
