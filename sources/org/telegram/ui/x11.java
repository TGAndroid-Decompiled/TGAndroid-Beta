package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x11 implements TextWatcher {
    public final int f42935a;
    public final z11 f42936b;

    public x11(z11 z11Var, int i10) {
        this.f42935a = i10;
        this.f42936b = z11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f42935a) {
            case 0:
                this.f42936b.U(true);
                return;
            case 1:
                z11 z11Var = this.f42936b;
                if (!z11Var.H) {
                    EditTextBoldCursor editTextBoldCursor = z11Var.f43772a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i10 = i11;
                    }
                    z11Var.H = true;
                    int intValue = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb.toString());
                    }
                    z11Var.H = false;
                    z11Var.U(true);
                    return;
                }
                return;
            default:
                this.f42936b.U(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42935a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42935a;
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
