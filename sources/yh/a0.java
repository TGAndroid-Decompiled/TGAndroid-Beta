package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class a0 implements TextWatcher {
    public final b0 f51069a;

    public a0(b0 b0Var) {
        this.f51069a = b0Var;
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
        b0 b0Var = this.f51069a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), b0Var.m0.f53321a);
        } else {
            i10 = zf.a.i(0L, b0Var.m0.f53321a);
        }
        b0Var.S(i10, false, false, true);
        b0Var.f51121c0.c(b0Var.f51122d0.isFocused(), true ^ TextUtils.isEmpty(b0Var.f51122d0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
