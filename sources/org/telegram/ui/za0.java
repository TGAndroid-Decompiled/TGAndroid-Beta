package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;

public final class za0 implements TextWatcher {

    public final int f45120a;

    public final fb0 f45121b;

    public za0(fb0 fb0Var, int i10) {
        this.f45120a = i10;
        this.f45121b = fb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f45120a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f45121b.G.getPaint().getFontMetricsInt(), false);
                break;
            default:
                fb0 fb0Var = this.f45121b;
                if (!fb0Var.K) {
                    if (editable.toString().equals("0")) {
                        fb0Var.B.setText("");
                    } else {
                        try {
                            int i10 = Integer.parseInt(editable.toString());
                            if (i10 <= 100000) {
                                fb0Var.W(i10);
                            } else {
                                fb0Var.X();
                            }
                        } catch (NumberFormatException unused) {
                            fb0Var.X();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f45120a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f45120a;
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
