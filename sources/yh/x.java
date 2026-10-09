package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class x implements TextWatcher {
    public final y f53355a;

    public x(y yVar) {
        this.f53355a = yVar;
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
        y yVar = this.f53355a;
        if (!z10) {
            i10 = zf.a.h(editable.toString(), yVar.m0.f54439a);
        } else {
            i10 = zf.a.i(0L, yVar.m0.f54439a);
        }
        yVar.V(i10, false, false, true);
        yVar.f53383c0.c(yVar.f53384d0.isFocused(), true ^ TextUtils.isEmpty(yVar.f53384d0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
