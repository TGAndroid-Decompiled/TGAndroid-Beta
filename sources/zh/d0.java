package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class d0 implements TextWatcher {
    public final e0 f51778a;

    public d0(e0 e0Var) {
        this.f51778a = e0Var;
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
        e0 e0Var = this.f51778a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), e0Var.H.f51622a);
        } else {
            i10 = zf.a.i(0L, e0Var.H.f51622a);
        }
        e0Var.q(i10, false, false, true);
        e0Var.f51809f.c(e0Var.h.isFocused(), true ^ TextUtils.isEmpty(e0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
