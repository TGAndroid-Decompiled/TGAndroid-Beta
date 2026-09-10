package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class rb0 implements TextWatcher {
    public final int f36327a;
    public final xb0 f36328b;

    public rb0(xb0 xb0Var, int i10) {
        this.f36327a = i10;
        this.f36328b = xb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f36327a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f36328b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                xb0 xb0Var = this.f36328b;
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
        int i13 = this.f36327a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36327a;
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
