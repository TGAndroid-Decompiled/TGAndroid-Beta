package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class wa0 implements TextWatcher {
    public final int f42495a;
    public final cb0 f42496b;

    public wa0(cb0 cb0Var, int i10) {
        this.f42495a = i10;
        this.f42496b = cb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f42495a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f42496b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                cb0 cb0Var = this.f42496b;
                if (!cb0Var.O) {
                    if (editable.toString().equals("0")) {
                        cb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            cb0Var.X();
                            return;
                        } else {
                            cb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        cb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42495a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42495a;
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
