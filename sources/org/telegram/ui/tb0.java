package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class tb0 implements TextWatcher {
    public final int f37720a;
    public final zb0 f37721b;

    public tb0(zb0 zb0Var, int i10) {
        this.f37720a = i10;
        this.f37721b = zb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f37720a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f37721b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                zb0 zb0Var = this.f37721b;
                if (!zb0Var.O) {
                    if (editable.toString().equals("0")) {
                        zb0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            zb0Var.X();
                            return;
                        } else {
                            zb0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        zb0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37720a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37720a;
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
