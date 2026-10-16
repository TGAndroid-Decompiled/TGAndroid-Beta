package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class g0 implements TextWatcher {
    public final h0 f50566a;

    public g0(h0 h0Var) {
        this.f50566a = h0Var;
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
        h0 h0Var = this.f50566a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), h0Var.E.f631a);
        } else {
            i10 = ag.a.i(0L, h0Var.E.f631a);
        }
        h0Var.o(i10, false, false, true);
        h0Var.f50596b.c(h0Var.f50597c.isFocused(), true ^ TextUtils.isEmpty(h0Var.f50597c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
