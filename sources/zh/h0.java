package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class h0 implements TextWatcher {
    public final i0 f52003a;

    public h0(i0 i0Var) {
        this.f52003a = i0Var;
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
        i0 i0Var = this.f52003a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), i0Var.E.f51653a);
        } else {
            i10 = zf.a.i(0L, i0Var.E.f51653a);
        }
        i0Var.n(i10, false, false, true);
        i0Var.f52037b.c(i0Var.f52038c.isFocused(), true ^ TextUtils.isEmpty(i0Var.f52038c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
