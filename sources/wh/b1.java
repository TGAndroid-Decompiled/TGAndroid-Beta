package wh;

import android.text.Editable;
import android.text.TextWatcher;
public final class b1 implements TextWatcher {
    public final e1 f49651a;

    public b1(e1 e1Var) {
        this.f49651a = e1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        e1 e1Var = this.f49651a;
        if (!e1Var.h && e1Var.f49709c != null) {
            if (e1Var.B && editable.length() > 0) {
                editable2 = editable;
                x5.o(editable2, 0, editable.length(), 1, true, e1Var.I);
            } else {
                editable2 = editable;
            }
            if (!e1Var.f49715w && !e1Var.f49712n && !e1Var.f49713r) {
                e1Var.h = true;
                boolean z4 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z4 = true;
                    }
                }
                e1Var.h = false;
                if (z4) {
                    e1Var.f49709c.o(e1Var);
                    return;
                } else {
                    e1Var.f49709c.O(editable2);
                    return;
                }
            }
            e1Var.f49709c.O(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var;
        e1 e1Var = this.f49651a;
        if (!e1Var.h && (d1Var = e1Var.f49709c) != null) {
            d1Var.j(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        e1 e1Var = this.f49651a;
        boolean z4 = true;
        e1Var.G = true;
        e1Var.q();
        if (e1Var.length() != 0) {
            z4 = false;
        }
        e1Var.setLongClickable(z4);
    }
}
