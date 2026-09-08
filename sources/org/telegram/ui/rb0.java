package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class rb0 implements TextWatcher {
    public final int f40152a;
    public final xb0 f40153b;

    public rb0(xb0 xb0Var, int i10) {
        this.f40152a = i10;
        this.f40153b = xb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f40152a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f40153b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                xb0 xb0Var = this.f40153b;
                if (!xb0Var.O) {
                    if (editable.toString().equals("0")) {
                        xb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            xb0Var.X();
                            return;
                        } else {
                            xb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        xb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40152a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40152a;
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
