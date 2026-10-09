package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class g0 implements TextWatcher {
    public final h0 f52575a;

    public g0(h0 h0Var) {
        this.f52575a = h0Var;
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
        h0 h0Var = this.f52575a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), h0Var.E.f54441a);
        } else {
            i10 = zf.a.i(0L, h0Var.E.f54441a);
        }
        h0Var.p(i10, false, false, true);
        h0Var.f52602b.c(h0Var.f52603c.isFocused(), true ^ TextUtils.isEmpty(h0Var.f52603c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
