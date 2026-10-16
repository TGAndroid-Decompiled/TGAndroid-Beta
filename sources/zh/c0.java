package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class c0 implements TextWatcher {
    public final d0 f50338a;

    public c0(d0 d0Var) {
        this.f50338a = d0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ag.a i10;
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
        d0 d0Var = this.f50338a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), d0Var.H.f631a);
        } else {
            i10 = ag.a.i(0L, d0Var.H.f631a);
        }
        d0Var.s(i10, false, false, true);
        d0Var.f50365f.c(d0Var.h.isFocused(), true ^ TextUtils.isEmpty(d0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
