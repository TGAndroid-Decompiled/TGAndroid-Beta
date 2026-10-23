package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ua0 implements TextWatcher {
    public final int f41919a;
    public final ab0 f41920b;

    public ua0(ab0 ab0Var, int i10) {
        this.f41919a = i10;
        this.f41920b = ab0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f41919a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f41920b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                ab0 ab0Var = this.f41920b;
                if (!ab0Var.O) {
                    if (editable.toString().equals("0")) {
                        ab0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            ab0Var.X();
                            return;
                        } else {
                            ab0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        ab0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41919a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41919a;
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
