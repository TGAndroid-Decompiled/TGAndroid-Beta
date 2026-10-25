package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z11 implements TextWatcher {
    public final int f46153a;
    public final b21 f46154b;

    public z11(b21 b21Var, int i10) {
        this.f46153a = i10;
        this.f46154b = b21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f46153a) {
            case 0:
                this.f46154b.V(true);
                return;
            case 1:
                b21 b21Var = this.f46154b;
                if (!b21Var.K) {
                    EditTextBoldCursor editTextBoldCursor = b21Var.f37952a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i10 = i11;
                    }
                    b21Var.K = true;
                    int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
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
                    b21Var.K = false;
                    b21Var.V(true);
                    return;
                }
                return;
            default:
                this.f46154b.V(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f46153a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f46153a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
