package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xx0 implements TextWatcher {
    public final int f51839a;
    public final zx0 f51840b;

    public xx0(zx0 zx0Var, int i7) {
        this.f51839a = i7;
        this.f51840b = zx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f51839a) {
            case 0:
                this.f51840b.Z(true);
                return;
            case 1:
                zx0 zx0Var = this.f51840b;
                if (!zx0Var.K) {
                    EditTextBoldCursor editTextBoldCursor = zx0Var.f52694a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i7 = 0;
                    while (i7 < obj.length()) {
                        int i10 = i7 + 1;
                        String substring = obj.substring(i7, i10);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i7 = i10;
                    }
                    zx0Var.K = true;
                    int intValue = Utilities.z(sb2.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb2.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb2.toString());
                    }
                    zx0Var.K = false;
                    zx0Var.Z(true);
                    return;
                }
                return;
            default:
                this.f51840b.Z(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51839a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51839a;
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
