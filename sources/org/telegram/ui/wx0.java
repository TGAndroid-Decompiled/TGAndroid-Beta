package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wx0 implements TextWatcher {
    public final int f53554a;
    public final yx0 f53555b;

    public wx0(yx0 yx0Var, int i7) {
        this.f53554a = i7;
        this.f53555b = yx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f53554a) {
            case 0:
                this.f53555b.Z(true);
                return;
            case 1:
                yx0 yx0Var = this.f53555b;
                if (!yx0Var.L) {
                    EditTextBoldCursor editTextBoldCursor = yx0Var.f54323a[1];
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
                    yx0Var.L = true;
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
                    yx0Var.L = false;
                    yx0Var.Z(true);
                    return;
                }
                return;
            default:
                this.f53555b.Z(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f53554a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f53554a;
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
