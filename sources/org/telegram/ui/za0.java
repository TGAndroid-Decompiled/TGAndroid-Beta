package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Emoji;
public final class za0 implements TextWatcher {
    public final int f46238a;
    public final db0 f46239b;

    public za0(db0 db0Var, int i10) {
        this.f46238a = i10;
        this.f46239b = db0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f46238a) {
            case 0:
                db0 db0Var = this.f46239b;
                if (!db0Var.N) {
                    if (editable.toString().equals("0")) {
                        db0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            db0Var.Y();
                            return;
                        } else {
                            db0Var.X(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        db0Var.Y();
                        return;
                    }
                }
                return;
            default:
                Emoji.replaceEmoji(editable, this.f46239b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f46238a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f46238a;
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
