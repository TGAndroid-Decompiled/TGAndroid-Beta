package vh;

import android.text.Editable;
import android.text.TextWatcher;
public final class a1 implements TextWatcher {
    public final d1 f45793a;

    public a1(d1 d1Var) {
        this.f45793a = d1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        d1 d1Var = this.f45793a;
        if (!d1Var.h && d1Var.f45845c != null) {
            if (d1Var.B && editable.length() > 0) {
                editable2 = editable;
                x5.o(editable2, 0, editable.length(), 1, true, d1Var.I);
            } else {
                editable2 = editable;
            }
            if (!d1Var.f45850w && !d1Var.f45847n && !d1Var.f45848r) {
                d1Var.h = true;
                boolean z4 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z4 = true;
                    }
                }
                d1Var.h = false;
                if (z4) {
                    d1Var.f45845c.G(d1Var);
                    return;
                } else {
                    d1Var.f45845c.N(editable2);
                    return;
                }
            }
            d1Var.f45845c.N(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        c1 c1Var;
        d1 d1Var = this.f45793a;
        if (!d1Var.h && (c1Var = d1Var.f45845c) != null) {
            c1Var.i(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var = this.f45793a;
        boolean z4 = true;
        d1Var.G = true;
        d1Var.q();
        if (d1Var.length() != 0) {
            z4 = false;
        }
        d1Var.setLongClickable(z4);
    }
}
