package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class i0 implements TextWatcher {
    public final j0 f51446a;

    public i0(j0 j0Var) {
        this.f51446a = j0Var;
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
        j0 j0Var = this.f51446a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), j0Var.E.f53321a);
        } else {
            i10 = zf.a.i(0L, j0Var.E.f53321a);
        }
        j0Var.n(i10, false, false, true);
        j0Var.f51471b.c(j0Var.f51472c.isFocused(), true ^ TextUtils.isEmpty(j0Var.f51472c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
