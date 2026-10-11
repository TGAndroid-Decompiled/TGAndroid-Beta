package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class b0 implements TextWatcher {
    public final c0 f52396a;

    public b0(c0 c0Var) {
        this.f52396a = c0Var;
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
        c0 c0Var = this.f52396a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), c0Var.H.f54562a);
        } else {
            i10 = zf.a.i(0L, c0Var.H.f54562a);
        }
        c0Var.s(i10, false, false, true);
        c0Var.f52448f.c(c0Var.h.isFocused(), true ^ TextUtils.isEmpty(c0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
