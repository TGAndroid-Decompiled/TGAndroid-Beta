package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class va0 implements TextWatcher {
    public final int f43418a;
    public final bb0 f43419b;

    public va0(bb0 bb0Var, int i9) {
        this.f43418a = i9;
        this.f43419b = bb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f43418a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f43419b.G.getPaint().getFontMetricsInt(), false);
                return;
            default:
                bb0 bb0Var = this.f43419b;
                if (!bb0Var.K) {
                    if (editable.toString().equals("0")) {
                        bb0Var.B.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            bb0Var.W();
                            return;
                        } else {
                            bb0Var.V(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        bb0Var.W();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f43418a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f43418a;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
