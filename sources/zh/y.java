package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class y implements TextWatcher {
    public final z f51317a;

    public y(z zVar) {
        this.f51317a = zVar;
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
        z zVar = this.f51317a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), zVar.m0.f631a);
        } else {
            i10 = ag.a.i(0L, zVar.m0.f631a);
        }
        zVar.V(i10, false, false, true);
        zVar.f51346c0.c(zVar.f51347d0.isFocused(), true ^ TextUtils.isEmpty(zVar.f51347d0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
