package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class sb0 implements TextWatcher {
    public final int f37241a;
    public final yb0 f37242b;

    public sb0(yb0 yb0Var, int i10) {
        this.f37241a = i10;
        this.f37242b = yb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f37241a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f37242b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                yb0 yb0Var = this.f37242b;
                if (!yb0Var.O) {
                    if (editable.toString().equals("0")) {
                        yb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            yb0Var.X();
                            return;
                        } else {
                            yb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        yb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37241a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37241a;
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
