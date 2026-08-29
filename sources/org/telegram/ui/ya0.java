package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ya0 implements TextWatcher {
    public final int f44822a;
    public final eb0 f44823b;

    public ya0(eb0 eb0Var, int i10) {
        this.f44822a = i10;
        this.f44823b = eb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f44822a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f44823b.G.getPaint().getFontMetricsInt(), false);
                return;
            default:
                eb0 eb0Var = this.f44823b;
                if (!eb0Var.K) {
                    if (editable.toString().equals("0")) {
                        eb0Var.B.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            eb0Var.X();
                            return;
                        } else {
                            eb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        eb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44822a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44822a;
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
