package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class ub0 implements TextWatcher {
    public final int f40635a;
    public final ac0 f40636b;

    public ub0(ac0 ac0Var, int i10) {
        this.f40635a = i10;
        this.f40636b = ac0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f40635a) {
            case 0:
                Emoji.replaceEmoji(editable, this.f40636b.K.getPaint().getFontMetricsInt(), false);
                return;
            default:
                ac0 ac0Var = this.f40636b;
                if (!ac0Var.O) {
                    if (editable.toString().equals("0")) {
                        ac0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            ac0Var.X();
                            return;
                        } else {
                            ac0Var.W(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        ac0Var.X();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40635a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40635a;
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
