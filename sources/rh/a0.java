package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class a0 implements TextWatcher {
    public final b0 f46600a;

    public a0(b0 b0Var) {
        this.f46600a = b0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        sf.a i10;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        b0 b0Var = this.f46600a;
        if (!z10) {
            i10 = sf.a.h(editable.toString(), b0Var.f46662f2.f48254a);
        } else {
            i10 = sf.a.i(0L, b0Var.f46662f2.f48254a);
        }
        b0Var.f1(i10, false, false, true);
        b0Var.V1.c(b0Var.W1.isFocused(), true ^ TextUtils.isEmpty(b0Var.W1.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
