package rh;

import android.text.Editable;
import android.text.TextWatcher;

public final class a1 implements TextWatcher {

    public final d1 f47047a;

    public a1(d1 d1Var) {
        this.f47047a = d1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        d1 d1Var = this.f47047a;
        if (d1Var.h || d1Var.f47099c == null) {
            return;
        }
        if (!d1Var.A || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            v5.o(editable2, 0, editable.length(), 1, true, d1Var.H);
        }
        if (d1Var.f47105w || d1Var.f47102n || d1Var.f47103r) {
            d1Var.f47099c.r1(editable2);
            return;
        }
        d1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        d1Var.h = false;
        if (z10) {
            d1Var.f47099c.w1(d1Var);
        } else {
            d1Var.f47099c.r1(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        c1 c1Var;
        d1 d1Var = this.f47047a;
        if (d1Var.h || (c1Var = d1Var.f47099c) == null) {
            return;
        }
        c1Var.B(i11, i12);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var = this.f47047a;
        d1Var.F = true;
        d1Var.q();
        d1Var.setLongClickable(d1Var.length() == 0);
    }
}
