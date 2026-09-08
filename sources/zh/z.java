package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class z implements TextWatcher {
    public final a0 f52935a;

    public z(a0 a0Var) {
        this.f52935a = a0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        zf.a i10;
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
        a0 a0Var = this.f52935a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), a0Var.m0.f51653a);
        } else {
            i10 = zf.a.i(0L, a0Var.m0.f51653a);
        }
        a0Var.U(i10, false, false, true);
        a0Var.f51679c0.c(a0Var.f51680d0.isFocused(), true ^ TextUtils.isEmpty(a0Var.f51680d0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
