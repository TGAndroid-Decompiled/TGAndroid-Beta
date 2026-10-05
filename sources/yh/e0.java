package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class e0 implements TextWatcher {
    public final f0 f51241a;

    public e0(f0 f0Var) {
        this.f51241a = f0Var;
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
        f0 f0Var = this.f51241a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), f0Var.H.f53321a);
        } else {
            i10 = zf.a.i(0L, f0Var.H.f53321a);
        }
        f0Var.q(i10, false, false, true);
        f0Var.f51277f.c(f0Var.h.isFocused(), true ^ TextUtils.isEmpty(f0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
